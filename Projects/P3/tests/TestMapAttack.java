import junit.framework.*;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    NoFrame frame0 = new NoFrame();
    Location location1 = new Location(6,1);
    Location location2 = new Location(7,1);  
    PacMan testPacman = frame0.addPacMan(location1);
    Ghost testGhost = frame0.addGhost(location2, "ghost", Color.red);
    assertTrue(frame0.getMap().attack("ghost"));
  }
}
