import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
	  NoFrame f = new NoFrame();
	  PacMan p = f.addPacMan(new Location(2, 4));

	  assert(f.getMap().getLoc(new Location(2, 4)) != null);
	  assert(f.getMap().getLoc(new Location(2, 4)).contains(Map.Type.PACMAN));
  }
}
