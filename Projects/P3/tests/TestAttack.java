import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {

      NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

      Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); //Creates a red ghost named "name" at location x,y
      PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

      frame.startGame();

      assert(ghost.attack()==true);


  }
}
