+ Everytime recursive call is executed, recursion tree will grow exponentially resulting in high time complexity.
- Recursion problems (interview)
	- Tower of Hanoi
	- Factorial
	- Fibonicci
	- GCD
	- Printing all permutations of the givem string**
	- Generate all strings of n bits of binary number
	
+ Tower of Hanoi - No of max moves = (2^n)-1 ; n - no of disks //screenshot	
* New recursion type (Binary branch only)
- When you give recusive call within the function and how the function progresses to base is defined in head & tail recursion
1. Tail Recursion
	- Recursion tailing towards right.
	- Function in end of the expression.
	- It is recursive call made after all the processing in the function. The function performs its operations first and recursive call is the last operation.
2. Head Recursion
	- Recursion heading towards left.
	- Function in start of the expression.
	- It is recursive call made before any other operations or calculation in the function. The function performs after the recursion.
	
- Explore - Achermann's function