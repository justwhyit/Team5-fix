import java.io.*;
import junit.framework.*;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost testGhost1 = frame.addGhost(new Location(2, 2), "ghost 1", Color.red);
    Ghost testGhost2 = frame.addGhost(new Location(6, 6), "ghost 2", Color.red);
    PacMan testPacman = frame.addPacMan(new Location(2, 3));

    assertTrue(testPacman.is_ghost_in_range());
  }
}
