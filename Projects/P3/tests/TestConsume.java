import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
      //Creating A Map
      Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
      NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
      //create pacman
      PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y
      frame.initPlayers(); //Creates all of the players
      //Start The Game
      frame.startGame();
      assert(pacman.consume()!=null);
    return null;
  }
}
