import java.io.*;
import junit.framework.*;
import java.awt.Color.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {

	  MainFrame frame = new MainFrame();
	  Ghost ghost = frame.addGhost(new Location(2, 2), "name", java.awt.Color.red);
	  assert(ghost.move() == true);


  
  }

}
