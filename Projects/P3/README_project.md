# Team 5 - Pacman Project
Members: Anthony Squillacioti, Josue Velasquez, Patrick Wang, Shrikar Vasisht

## Classes
### Pacman
get_valid_moves()
<ul>
  <li>What it does: Returns an array of the spaces above, below, to the left, and to the right of Pacman that do not contain a ghost or wall.
  <li>Test: Places Pacman and a ghost on the grid. Throws an exception if any of the valid locations returned by the method contains a wall.
</ul>

move()
<ul>
  <li>What it does: Calls get_valid_moves(), picks the location at index 0 and sets Pacman's myLoc to that, then returns true. Returns false if no valid moves.</li>
  <li>Test: Places a Pacman object on a grid and checks if the method returns true</li>
</ul>
is_ghost_in_range()
<ul>
  <li>What it does: Creates an array of possible locations within the radius and returns true if there's a ghost in it.</li>
  <li>Test: Creates a pacman and two ghosts, one within the radius and one without. Checks if the method returns true for the ghost in range, and false for the ghost not in range.</li>
</ul>

### Ghost
get_valid_moves()
<ul>
  <li>What it does: Returns an array of the spaces above, below, to the left, and to the right of the ghost that do not contain a ghost or wall.
  <li>Test: Places Pacman and a ghost on the grid. Throws an exception if any of the valid locations returned by the method contains a wall.
</ul>

move()
<ul>
  <li>What it does: Calls get_valid_moves(), picks a random index and sets the ghost's myLoc to the loc at that index in the list, then returns true. Returns false if no valid moves.</li>
  <li>Test: Places a Ghost object on a grid and checks if the method returns true</li>
</ul>
is_pacman_in_range()
<ul>
  <li>What it does: Creates an array of possible locations within the radius and returns true if theres a pacman in it.</li>
  <li>Test: Creates a pacman and two ghosts, one within the radius and one without. Checks if the ghost can detect the pacman in its radius.</li>
</ul>

### Map
move(String name, Location loc, Type type)
<ul>
  <li>What it does: Moves an object of the given name and type to the new location. The method moves the object if doing so does not place a wall on any other object, or vice versa.
  <li>Test: Places Pacman and a ghost on a grid. The test checks to make sure that Pacman and the ghost cannot be moved to a space containing a wall (or can be otherwise).
</ul>

getLoc()
<ul>
  <li>What it does: Returns the HashSet of Types at the location passed into the method.</li>
  <li>Test: Places a Pacman object at a specific location and checks if the set returned by the method contains Map.Type.PACMAN.</li>
</ul>
attack(String name)
<ul>
  <li>What it does: Checks to see if the locations of any ghosts are within the radius of the locations of the pacman. Does this to see if ghosts are capable of attacking a pacman.</li>
  <li>Test: Create a pacman and a ghost next to each other to see if the ghost is capable of attacking the pacman.</li>
</ul>
