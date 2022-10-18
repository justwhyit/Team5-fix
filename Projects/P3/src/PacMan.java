import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    Location[] locations = new Location[4];
    ArrayList<Location> validMoves = new ArrayList<>();

    locations[0] = myLoc.shift(0, 1); //upwards location
    locations[1] = myLoc.shift(0, -1);  //downwards location
    locations[2] = myLoc.shift(-1, 0);  //left location
    locations[3] = myLoc.shift(1, 0);  //right location

    for (Location location : locations) {
      if ( !(myMap.getLoc(location).contains(Map.Type.COOKIE)
      || myMap.getLoc(location).contains(Map.Type.GHOST)) ) {
        validMoves.add(location);
      }
    }

    return validMoves;
  }

  public boolean move() {
    ArrayList<Location> locs = get_valid_moves();
    if (locs.size() > 0) {
	    this.myLoc = locs.get(0);
	    return false;
    }
    return false;
  }

  public boolean is_ghost_in_range() {
    ArrayList<Location> locs = new ArrayList<>();
    locs.add(new Location(this.myLoc.x - 1, this.myLoc.y));
    locs.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    locs.add(new Location(this.myLoc.x, this.myLoc.y - 1));
    locs.add(new Location(this.myLoc.x, this.myLoc.y + 1));

    for (int i = 0; i < locs.size(); i++) { 
      if (myMap.getLoc(locs.get(i)) != null) {
        if (myMap.getLoc(locs.get(i)).contains(Map.Type.GHOST)) {
          return true;
        }
      }
    }
    return false;
  }

  public JComponent consume() {
    return null;
    /* 
    if(myMap.getLoc(myLoc).contains(PACMAN) && myMap.getLoc(myLoc).contains(COOKIE)){
        return myMap.eatCookie("pacman");
    }
    */
  }
}
