import java.util.ArrayList;
import java.util.Random;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
	  ArrayList<Location> locs = get_valid_moves();
	  Random r = new Random();
	  if (locs.size() == 0)
		  return false;
	  this.myLoc = locs.get(r.nextInt(locs.size()));
	  return true;
  }

  public boolean is_pacman_in_range() {
    ArrayList<Location> locs = new ArrayList<>();
    locs.add(new Location(this.myLoc.x - 1, this.myLoc.y));
    locs.add(new Location(this.myLoc.x + 1, this.myLoc.y));
    locs.add(new Location(this.myLoc.x, this.myLoc.y - 1));
    locs.add(new Location(this.myLoc.x, this.myLoc.y + 1));

    for (int i = 0; i < locs.size(); i++) { 
      if (myMap.getLoc(locs.get(i)) != null) {
        if (myMap.getLoc(locs.get(i)).contains(Map.Type.PACMAN)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean attack() {
    if(!is_pacman_in_range()){
        return false;
    }
    return true;
  }
}
