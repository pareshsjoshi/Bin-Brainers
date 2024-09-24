- Steps of finding solution:-
  - Define the problem
  - Analyse the problem
  - Indentify potential solution
  - Evaluate & choose best solution.
  - Plan action
  - Implement & review result

- What is use of DS - To organize data in structured manner
- Why it need to be structured - If DS arranged in organized manner then we can save memory and have more efficiency.
- What is importants of algorithm - 

- algo + DS = program
- Ranking algorithm: 

- Computational Thinking - it is problem solving process/technique that includes decomposition, pattern recognition, abstraction and algorithm design.
  - Decompsition - Breaking down data/process into smaller & manageable parts/tasks.
  - Pattern Recognition - Observating patterns, trends & regularities in data.
  - Abstraction - Identifying general principles that generate these patthers. Also involves filtering out details we do not need in order to solve a problem.
  - Algorithm Design - Develope step by step instructions for solving these and similar problems

- Some basic techniques to explain logic of any program - flow chart, design algorithms, write psudo code.

- Foundation of DS.
  - Data: collection of raw facts
  - Algorithm: Essense of computational process in step by step manner
  - Program: Implementation of algorithm in some programming language
  - Data Structure: Organization of data needed to solve the problem.

- How alogithm play role:
  - In general-
    - We give input to program, program will execute and generates some output.
  - In DS-
    - First see real-time problem, understand rtp follow steps of finding solution for rtp, design steps of algorithm to solve rtp, implement the algorithm in program. We make use of DS while implementing.

## Logic building
- It is solution of problem, in step by step manure using algorithm, and applying algorithm while implementing DS.

## Algorithm
- It is step-by-step procedure to solve ral-time-problem or to perform any tasks.
- It is well defined step-by-step computational procedure that takes a set of inputs and produce a desired output.

## Characteristics for Algorithm: 
- Finite: must terminate after finite number of steps.
- Definate - Each step must be precisely defined.
- Input - Takes zero or more inputes (at least 1 input)
- Output - Produce at least 1 output.
- Effective - Each step must be basic & achievable.
 
## Types of algorithm Strategies:
- Greedy technique
	1. Choose best-out-of-best solution.
	2. Makes *locally optimal* choice at each step with hope of finding *global optimum*.
	3. eg. Dijkstra's Algorithm
- Divide and Conquer
	1. Break big problems into small tasks/subproblems then solve them *recursively* and *combine* all together.
	2. eg. Merge sort, Quick sort
- Dynamic programming
	1. It is combination of Greedy technique and Divide & Conquer.
	2. Solves complex problems by breaking them into simpler subproblems & *solving each once*.
	3. eg. Fibonacci, Knapsack problem.
- Brute Force
	1. Try all possible solutions until the correct one is found.
	2. eg. String matching
- Recursive Technique
	1. Solves a problem by solving smaller instances of the same program.
	2. eg. Tower of Hanoi, Factorial.
- Search Algorithm
	1. Finds an element in DS.
	2. eg. Binary search, Linear search.
- Sorting Algorithms
	1. Order the elements in perticular sequence.
	2. Bubble sort, selection sort, insertion sort, heap sort.

## Algorithm Analysis - with-respect-to time & space.
1. Time complexity - 
	- How much time is taken by program to execute.
	- Measures the time of an algorithmm, takes as function of input size.
2. Space complexity -
	- How much space/storage is taken by program to execute.
	- Measures of the ammount of memory consume by an algorithm, uses as a function of the input size.
3. Big O Notation
	-Base Case - Ohm
	-Average Case - Theta
	-Worst Case - O (Capital O)
	These are units of time complexity.
	*Always mention about worst case time complexity in interview. (recording D1.1 - 12.48 PM)
-------------------------------------------------
-------------------------------------------------
## Data structures:
- A way of organizing, managing and sorting data to enable efficient access & modification
- A data structure is a perticular way of organizing, managing and storing data in computer so that it can be used efficiently.
- Defines the relationship between data and the operations that can be performed on the data and the methods of accessing or modifying it.
- DSs are crucial for developing efficient algorithm and are foundational for handling and processing data in various applications
-------------------------------------------------
## Types of DS
- Linear DS
	- Data elements are arranged sequenciall
	- eg. arrays, linked list, stack, queue
	
	-Array: collection of elements stored at contiguous memory location.
	-Linked-List: Linear collection of data elecments, where each element points to the next
	-Stack: It follows Last-In-First-Out (LIFO)
	-Queue: It follows Fisrt-In-First-Out (FIFO)
	-Hash table: Stores key-value pairs offering fast lookups
- Non-Linear DS
	-Data elecments are arranged hierarchically or in network
	-eg. Trees, Graphs
	
	-Tree: A hierarchical structure with root, nodes and edges (Binary tree, AVL tree, etc).
	-Graph: Consists of nodes(vertices), connective edges(Directive, undirective)
	-Heap: A complete binary tree that maintains a specific order.(Min-heap, Max-heap)
-------------------------------------------------
## Application of DS (Explore more)
1. Arrasy: Sorted fixed data - Contact list
2. Linked-List: Impementing (dynamically) queues, stack and graph.
3. Stack: Redo-Undo, Syntax parsing, expression evaluation
4. Queue: Printer job queue, CPS task scheduling.
5. Tree: Hierarchical data storage(file system eg. linux), database(B-trees)
6. Graphs: Social network(Facebook, insta, etc), Road maps, web page links.
-------------------------------------------------
## Operations we can perform on DS:
1. Travering: Accessing elecments
2. Searching: Finding element at perticular location.
3. Intertion: Adding new element
4. Deletion: Removing an elecment.
5. Sorting: Arrange element in perticular order.
6. Merging:  Combining two data DS into one.
-------------------------------------------------
![Data Structure](/ADS/D1/Data%20Structure.png)
- When we implement Stack, Queue, Linked-List using array, we call it Static DS
- When we implement Stack, Queue, Linked-List using Linked list, we call it Dynamic DS
-------------------------------------------------
## Difference in Static & Dynamic DS
| Static DS | Dynamic DS |
|-----------|------------|
| A static DS is a fixed-size structure that allocates a predefined ammount of memory at compile time. | A Dynamic DS can grow or shrink in size during program execution. |
| Characteristics- Fixed size, memory allocation(compile-time), Access speed(faster), Efficient. (All this bcz it does in compile-time). | Characteristics- variable-size, Memory allocation(run-time), Flexibity, Overhead(additional memory). |
| Allocates memory as needed at compile-time. | Allocates memory as needed at run-time. |
| - Code eg. Array | - Code eg. linkedList |


## H/W diff in Linear & Non-Linear DS.