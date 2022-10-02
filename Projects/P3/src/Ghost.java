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
    return false;
  }

  public boolean attack() {
    return false;
  }
}
