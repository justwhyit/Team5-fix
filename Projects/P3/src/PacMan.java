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
    return null;
  }

  public boolean move() {
    ArrayList<Location> locs = get_valid_moves();
    if (locs.length() > 0) {
	    this.myLoc = locs.get(0);
	    return true;
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
    if(myMap.getLoc(myLoc).contains(PACMAN) && myMap.getLoc(myLoc).contains(COOKIE)){
        return myMap.eatCookie("pacman");
    }
    return null;
  }
}
