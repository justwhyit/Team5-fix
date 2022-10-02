import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
	  MainFrame f = new MainFrame();
	  PacMan p = frame.addPacMan(new Location(2, 4));

	  assert(f.getLoc(new Location(2, 4)) != null);
	  assert(f.getLoc(new Location(2, 4)) == Map.Type.PACMAN);
  }
}
