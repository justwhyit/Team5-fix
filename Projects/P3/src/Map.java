import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
    JComponent component = components.get(name);

    //should only be ever adjusting position for pacman and ghost so... 
    if (type == Type.PACMAN) {
      if (!getLoc(loc).contains(Type.WALL)) { //can't update at all
        component.setLocation(loc.x, loc.y);
        return true;
      } else {
        return false;
      }
    } else { //must be ghost?
      if (!getLoc(loc).contains(Type.WALL)) { //can't set at wall
        component.setLocation(loc.x, loc.y);
        return true;
      } else {
        return false;
      }
    }
  }


  public HashSet<Type> getLoc(Location loc) {
    if (field.containsKey(loc))
	    return field.get(loc);
    return wallSet;
  }

  public boolean attack(String Name) {
    // update gameOver
    boolean isAttacked = false;
    Object[] key = field.keySet().toArray();

    Location pacLocation = null;
    for (int i = 0; i < key.length; i++) {
      if (field.get(key[i]).contains(Type.PACMAN)) {
        pacLocation = (Location)key[i];
      }
    }
    Location ghostLoc = locations.get(Name);
    if (ghostLoc != null) {
      if (ghostLoc.shift(1, 0).equals(pacLocation) || ghostLoc.shift(0, -1).equals(pacLocation) || ghostLoc.shift(0, 1).equals(pacLocation) || ghostLoc.shift(-1, 0).equals(pacLocation)){
        isAttacked = true;
      }
    }
    return isAttacked;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    // if name doesnt exist do nothing
    if(!locations.containsKey(name)){
        return null;
    }
    //otherwise
    Location pac_man_loc = locations.get(name);
    String cookie_name = "tok_x" + pac_man_loc.x + "_y" + pac_man_loc.y;
    JComponent eaten_cookie =  components.get(cookie_name);
    //decrement getCookies
    cookies = cookies+1;
    //removing cokkie from locations and field
    locations.remove(name);
    components.remove(cookie_name);
    //otherwise we get JComponent and remove it
    return eaten_cookie;
  }
}
