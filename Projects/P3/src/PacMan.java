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
    return false;
  }

  public JComponent consume() {
    //if(myMap.getLoc(myLoc).contains(COOKIE)){
    return myMap.eatCookie();
    //}
    //return null;
  }
}
