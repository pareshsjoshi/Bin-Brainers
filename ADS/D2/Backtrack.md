# Backtracking 
- It is an algorithm stategy for solving problems by exploring possible solutions and dead end solutions as it is determine they cannot lead to the solution.
	- Problem solving technique
	- Involves exploration of different path to find solution
	- Provides multiple choice & backtrack tries each option
	- Solution tool to challenging problem
	
## Key conpets:
1. Partial solution
	- BT works by building a solution one piece at a time. Generally by adding or modifying parts of solution in a way that is consistant with the problem constraints
2. Feasibility check
	- Algorithm checks whether a current partial solution can possibly lead to complete and valid solution. If not, it backtracks.
3. Recursive Exploration
	- It is implemented with recursion and algorithm will explore one possibility at a timea and recurse into it.
4. Backtrack condition
	- If a solution is found to be invalid or leads to no solution, the algorithm backtracks to the previous step and try alternate route.
	
## Working of Backtrack
1. Initial decision point
	- Make initial choice for setting parameters for algorithm
2. Recursive Exploration
	- For each decision algorithm proceed recursively.
3. Solution check
	- Checks and make current decision to a valid solution.
4. Backtrack & try new option
	- If no options are valid, then the algorithm backtracks to previous decision points.
	- 
5. Completion
	- Continue till get the solution.
	
## Application
1. N-queen problem
	- Placing N queens on NxN chessboard such that no two queens threaten each other
2. Sudoku Solver
	- Filling in the missing numbers in a Sudoku puzzle
3. Maze solving
	- Finding path from start to end in maze
4. Graph coloring
	- Assign colors to vertices of the graph, such that no 2 adjacent vertices have same color.
5. Subset/Permutation/Combination
	- Nummber or String text
6. Knapsnack problem
	- Solving variationof knapsack problem by exploring all possible ways to pack item into knapsack.
	-
## H/W - Difference between
1. Recursion & Backtracking
2. Static Data Structure & Dynamic Data Structure
3. Iteration & Recursion
4. Recursion & Backtracking
5. Backtracking and Branch & bound technique.
6. Head & Tail recursion

## State Space Solution 
- Space state tree is tree representing all possible states (solution or non-solution) of the problem from the root as an initial state to leaf as terminal state
```java
//General algorithm of backtrack
Backtrack(x)
	if x is not a solution
		return false
	if x is a new solution
		add to list of solution
	backtrack(expand x)
```	
**Strategy: Every time, make a choice and explore**
- Start
- Explore
- Constraint check
- Recursion
- Repeat
	
**Example** -	
```java
class BackTracking{
	
	static void	display(String str,String res){
		if(str.length() ==0){
			System.out.println(res+ " ");
			return;
		}
		for(int i=0;i< str.length();i++){
			char ch = str.charAt(i);
			String ros = str.substring(0,i)+str.substring(i+1);
			display(ros,res+ch);
		}
	}

	public static void main(String args[]){
		String s ="ABCD";
		display(s," ");
	}
}
```
![Backtrack](/ADS/D2/Backtrack.png)