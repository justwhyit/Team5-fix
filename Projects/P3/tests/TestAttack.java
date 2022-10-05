import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
      Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
      NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

      //Creating Players
      Ghost ghost = frame.addGhost(new Location(1, 1), "name", Color.red); //Creates a red ghost named "name" at location x,y
      PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

      //alternatively if you don't need the PacMan or Ghost objects in your tests
      //frame.initPlayers(); //Creates all of the players

      //Start The Game
      frame.startGame();

      assert(ghost.attack()==true);


  }
}
