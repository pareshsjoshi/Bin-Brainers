# Graph
A graph is non-linear data structure
- G(V,E)
- Vertices -> Node-> Entity/Objects
- Edges -> Connected pairs of vertices
![Graph1](/ADS/D12/Graph1.png)

#### Type of Edges
1. Undirected Edges
	- Every edge should Undirected
	- Uni-directed
	- Edges -> 2n -> n-no of edges
	```
	---------
	s/d---s/d
	```
	
2. Directed Edges
	- Every edge should Directed
	- Bi-directed
	- Edges -> n -> n-no of edges
	```
	------>
	s-----d
	```

#### Properties	
- No of edges in Undirected Graph
	- The no of possible pairs in an n vertex is n(n-1)
	- Since edge (u,v) =~ edge (v,u)..
	> No of edges in Undirected Graph = (n*(n-1))/2
	
- No of edges in Directed Graph
	- The no of possible pairs in an n vertex is n(n-1)
	- Since edge (u,v) != edge (v,u)..
	> No of edges in Directed Graph <= n*(n-1)

#### Type of Graphs
1. Tribial Graph
    - Graph with one vertex
2. Null Graph - 
    - Edges Connected to Null
3. Connected Graph
    - Every node is reachable
4. Disconnected Graph
    - At least one node is not reachable from another.
5. Cycle Graph
    - All nodes form a Cycle.
6. Cyclic Graph
    - At least 1 cycle
7. Directed Acyclic Graph
    - Directed but with no cycle(s).
8. Weighted Graph
    - Edge carries wieghts(Cost)
9. Complete Graph (Dense Graph)
    - All nodes are connected to each other.
    - Graph in which from each node there is an edge to each other node.

1. Adjecent Symmetrics (Screenshot)
    - Time complexity - O(1)
    - Space complexity - O(n^2)
    - For Undirected Graph, the matrix is Symmetric.

![Graph2](/ADS/D12/Graph2.png)

2. Adjecency List (Screenshot)
    - Time complexity - O(V+E)
    - Space complexity - O(E)
	
![Graph3](/ADS/D12/Graph3.png)

#### Graph Traversal
- DFS - Depth first search (Uses Stack)
- BFS - Breadth first search (Uses Queue)

1. Visited - Visit every node
2. Explore - Explore the node

Difference in DFS & BFS
|BFS|DFS|
|-|-|
| Queue DSA | Stack DSA |
| Level by level (Breadth-wise | Depth-wise explore |
| Shortest path - yes | Shortest path - No |
| Cycle detection | Cycle detection |
| Time complexity O(V+E) | Time complexity O(V+E) |.
| Space complexity O(V) | Space complexity O(V) |
| Appl-Finding shortest path | Appl-Searching path, backtrack |
| ... | ... |

# Algorithm Strategy
1. Greedy Algorithm
2. Dynamic Programming

### 1. Greedy Algorithm
- A class of algorithm that makes locally optimal choises at each step, hoping to get the final optimal solution.
- Works when the problem exibits
	- Greedy choice property
		- Making best local choice leads to global optimal solution.
	- Optimal substructure
		- Optimal solution can be constructed from the optimal solution of it's subproblem
##### Steps for creating Greedy Algorithm
1. Define a problem
	- Clearly state the objectives of the problem to be optimized.
2. Identify the Greedy choice.
	- Find the locally optimal choice at each step.
3. Make the Greedy choice
	- Select the best option based on current state.
4. Repeat the process
	- Continue making Greedy choices until a solution is found.
	
##### Characteristics of Greedy Algorithm
1. Simple to implement
2. Fast and efficient in solving problems
3. It will make locally optimal choices made at each step
4. It'll make decisions based on current information, passed choices cannot be considered.

##### Examples
1. Dijkestra's Algorithm - Find shortest path in Graph
2. Krushkal's Algorithm - Find minimum spanning tree
3. Haffman's Coding - Compresses data by assigning shorter codes to more frequent symbols.

##### Applications
1. Task Scheduling - min waiting time
2. Resource allocation
3. Data compression
4. Network Design

### 2. Dynamic Programming (DP)
- A method for solving complex problems by breaking them into simpler subproblems
- Key concepts
1. Overlapping subproblem
	- repeated calculations for the same problem
2. Optimal substructure
	- the optimal solution to a problem can be constructed from the optimal solution of it's subproblem.

##### Steps in Dynamic problem
1. Identify problem

2. Solve each subproblem and store the result
3. Build the solution to main problem using store results
4. Avoid redundant conputations by reusing stored solution.

##### Approches for DP
1. Top-Down Approch (Memoization)
	- Subproblems to main problem
	- Recursive finonacci
2. Bottom-Up Approch (Tabulation)
	- Smallest problem to main problem
	- Iterative fibonicci using table
	
##### Examples
1. Fibonicci sequence
2. Logest common sub sequence (LCS)
3. Knapsack problem
4. Shortest path 
##### Major diff
- Greedy gives best solution at the end.
- Dynamic gives best solution out of multiple solution.

| Greedy | DP |
|-|-|
| locally optimal solution | solve subproblems and builds up to global solution |
| Not always guarented optimal solution | Guarented globally optimal solution |
| Time complexity : O(n)/O(n^n) | Time complexity : high
| ex. Dijkestra, Krushkal algo | ex. shortest path, Knapsack |

# Spanning Tree
- Undirected
- No Cycle
- Can generate multiple Spanning tree
- Design to make minimum cost spanning tree

### Minumum Spanning Tree (MST)
- MST is subset of edges from a connected Weighted graph that connects all the Vertices without any cycle and with minimum possible total edge weight

### Conditions
1. Graph Connected
2. Graph Undirected
3. Weights are unique

### To identify minimum spanning tree
1. Krushkal's Algorithm
2. Prim's Algorithm

##### 1. Krushkal's Algorithm (its Greedy Algorithm)
	- Pick edges who have the shortest cost first.
	- Time complexity = O(ElogE)
	- Spcae = O(E+V)
![Graph4](/ADS/D12/Graph4.png)
	
##### 2. Prim's Algorithm  (its Greedy Algorithm)
	- Pick any edge  with low cost edge.
	- Time complexity = O(ElogV)
	- Spcae = O(E+V)
![Graph5](/ADS/D12/Graph5.png)
	
##### 3. Dijkstra's Algorithm
- Used to find shortest path in weighted graph
- Weighted Graph with non-negative weight. (Drawback)
- Method - Greedy Algorithm, which expands node with with smallest distance at each step.
- Time complexity - O(V^2)
- Space complexity - O(V)
![Graph6](/ADS/D12/Graph6.png)

##### Bellman Ford
- Time complexity - O(V+E)
- Space complexity - O(V)
