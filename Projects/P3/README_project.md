# Team 5 - Pacman Project
Members: Anthony Squillacioti, Josue Velasquez, Patrick Wang, Shrikar Vasisht

## Classes
### Pacman
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
