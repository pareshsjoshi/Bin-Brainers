# Divide and Conquer Strategy
Algorithm design paradigm that solves as problem using following steps
1. Dividing: Breaking problems into smaller subproblems
2. Connquering: Solving each subproblem recursively
3. Combining: Merging solution of subproblem to form the solution to original problem.

##### Characteristics
1. Recursion: Divide & Conquer often uses recursive technique.
2. Efficiency: Helps to reduce complex problem into simple and managable ones.
3. Optimal solution: The problem can be broken into smaller subproblems, each of which is a problem.
4. Overlapping: Subproblems are independent and do not share the data.

##### Advantage:
1. Efficiency: reduces complexity of a problem.
2. Parallelism: Subproblems can often be solved independently, making it suitable for parallel computing.
3. Modularity: Problem are solved in modular way, improving code structure & readability.

##### Disadvantages:
1. Space complexity
2. Overhead for execution

##### Application:
1. Searching: Binart search
2. Sorting: Merge sort & Quick sort
3. Matrix multiplication: Strassen's algorithm

### Merge sort
- Append L1 & L2
- if sorted, compare elements and merge.

```java

```

Time complexity: O(nlogn)
Space complexity: O(n)
Both sorting: (Internal/External)
- Internal for less data
- External for large data
Stable Technique


### Quick sort
Space complexity O(log n)
Best case: O(nlogn)
Average case: O(nlogn)
Worst case: O(n^2)
Not stable
Internal

### Heap sort
Best case: O(nlogn)
Average case: O(nlogn)
Worst case: O(nlogn)
space complexity o(1)
Not stable
Internal