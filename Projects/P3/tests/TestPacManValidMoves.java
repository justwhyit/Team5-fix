import java.io.*;
import java.util.ArrayList;
import junit.framework.*;
import  java.awt.Color;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame();

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(1, 2), "name", Color.red);
    PacMan pacman = frame.addPacMan(new Location(1, 1));

    //Start The Game
    frame.startGame();

    ArrayList<Location> validMoves = pacman.get_valid_moves();
    boolean invalidMoveFound = false;

    for (Location move : validMoves) {
      if (pacman.myMap.getLoc(move).contains(Map.Type.WALL)) {
        invalidMoveFound = true;
      }
    }

    assertTrue(!invalidMoveFound);
  }
}
