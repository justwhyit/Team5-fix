import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
      //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating PlayersGhost ghost = frame.addGhost(new Location(1, 1), "redone", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y

    //Start The Game
    frame.startGame();

    assert(frame.getMap().eatCookie("pacman")!= null);

  }
}
