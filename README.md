# StudiesRoom
Concurrency problem solved for CS class.

## Present classes
At the moment, two classes have been started.

### StudiesRoom
The main of the program. Just launches the rest of the processes.

### Student
Class that inherits from Runnable. When finished, should be able to see how many people there are in the room and party or study accordingly.

## To-Do
### Director
Three different states:
 * Outside - The director is just nowhere to be seen.
 * Waiting - The director is outside, waiting until all the students leave the study room.
 * Inside - The director entered the study room to stop the party. Signals every student to leave the room.