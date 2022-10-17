import java.io.*;
import junit.framework.*;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost testGhost1 = frame.addGhost(new Location(2, 2), "ghost 1", Color.red);
    Ghost testGhost2 = frame.addGhost(new Location(6, 6), "ghost 2", Color.red);
    PacMan testPacman = frame.addPacMan(new Location(2, 3));

    assertTrue(testGhost1.is_pacman_in_range());
    assertFalse(testGhost2.is_pacman_in_range());
  }
}
