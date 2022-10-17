import java.io.*;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {

	  MainFrame frame = new MainFrame();
	  Ghost ghost = frame.addGhost(new Location(2, 2), "name", Color.red);
	  assert(ghost.move() == true);


  
  }

}
