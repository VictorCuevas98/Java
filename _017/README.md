## Encapsulation reenforce

Given a robot which can only move in four directions, UP(U), DOWN(D), LEFT(L), RIGHT(R). Given a string consisting
of instructions to move. Output the coordinates of a robot after executing the instructions. Initial position
of robot is at origin (0,0). Implemented method should return the x and y co-ordinate of the robot as an Integer
array.

Example:
- Input: moveStr = "UDDLRL";
- OutputL [-1, -1]
- Move U: (0,0)-(0,1)
- Move D: (0,0)-(0,-1)
- Move D: (0,1)-(0,0)
- Move L: (0,-1)-(-1,-1)
- Move R: (-1,-1)-(0,-1)
- Move L: (0,-1)-(-1,-1)
  Therefore final position after the complete movements is (-1, -1)