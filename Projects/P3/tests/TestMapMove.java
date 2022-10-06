import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
      //Creating A Map
      NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

      //Creating Players
      Ghost ghost = frame.addGhost(new Location(2, 1), "name", Color.red);
      PacMan pacman = frame.addPacMan(new Location(1, 1));
  
      //Start The Game
      frame.startGame();
  
      Location wallLoc = new Location(1, 0);
  
      if (pacman.myMap.getLoc(wallLoc).contains(Map.Type.WALL)) {
        assertTrue(!pacman.myMap.move("Pacman", wallLoc, Map.Type.PACMAN));
        assertTrue(pacman.myMap.move("Pacman", new Location(2,1), Map.Type.PACMAN));
        assertTrue(!ghost.myMap.move("name", wallLoc, Map.Type.GHOST));
        assertTrue(ghost.myMap.move("name", new Location(2,1), Map.Type.PACMAN));
        assertTrue(ghost.myMap.move("name", new Location(3,1), Map.Type.PACMAN));
      }
  }
}
