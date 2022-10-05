import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
      //Creating A Map
      MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
      PacMan pacman = frame.addPacMan(new Location(1, 1)); //Creates PacMan at location x, y
      //Start The Game
      frame.startGame();
      assert(pacman.consume()!=null);
    return null;
  }
}
