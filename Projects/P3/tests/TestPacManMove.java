import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
	  NoFrame frame = new NoFrame();
	  PacMan p = frame.addPacMan(new Location(1, 1));
	  assertTrue(p.move() == true);
  }
}
