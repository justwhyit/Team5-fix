# Team 5 - Pacman Project
Members: Anthony Squillacioti, Josue Velasquez, Patrick Wang, Shrikar Vasisht

## Classes
### Pacman
move()
<ul>
  <li>What it does: Calls get_valid_moves(), picks the location at index 0 and sets Pacman's myLoc to that, then returns true. Returns false if no valid moves.</li>
  <li>Test: Places a Pacman object on a grid and checks if the method returns true</li>
</ul>

### Ghost
move()
<ul>
  <li>What it does: Calls get_valid_moves(), picks a random index and sets the ghost's myLoc to the loc at that index in the list, then returns true. Returns false if no valid moves.</li>
  <li>Test: Places a Ghost object on a grid and checks if the method returns true</li>
</ul>

### Map
getLoc()
<ul>
  <li>What it does: Returns the HashSet of Types at the location passed into the method.</li>
  <li>Test: Places a Pacman object at a specific location and checks if the set returned by the method contains Map.Type.PACMAN.</li>
</ul>
