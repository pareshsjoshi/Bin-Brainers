D4.1 Queue

Time & Space complexity for Stack
1. push() - t:O(1), s:O(1)
2. pop() - t:O(1), s:O(1)
3. peek()/top() - t:O(1), s:O(1)
4. isEmpty() - t:O(1), s:O(1)
5. size() - t:O(1), s:O(1)
6. Stack storage - t:O(1), s:O(n)

| Advantage | Disadvantage |
|-----------|--------------|
| - Simplicity: | - Unidirection |
| - Efficiency: | - Fixed Capacity
| - LIFO: | - Limited Access |
| - Memony efficiency: | - No Random Access |
| - Reversing | - Overflow |

Queue
----------------
- A Linear data structure, that follows FIFO principle
- Elements are added at the rear end & removed from the front.

#### FIFO
- First element added is first to me removed. ex. bus/ATM queue

2 pointers - rear front
Rear for insersion
front for deletion

#### Type of queue
1. Simple Queue
	- Follow FIFO Stricktly
	- Insertion: rear and Deletion: from
	- Insertion enqueue()
	- Deletion: dequeue()
	- Unidirectional Traversing  (One way traversing)
```java
takde code from notes
```
2. Circular Queue
getInfoFromOther()
```java
takde code from notes
```
3. Double-Ended Queue(Deque)
	- It is generalized version of queue that allows insersion and deletion of element from both ends
	- Types
		1. I/P Restricted Deque
		> I/P blocked at single end, but deletion is alloed at both the end
		2. O/P Restricted Deque
		> O/P blocked at single end, but insersion is alloed at both the end
	- Operations
		- insertFront: enqueue
		- insertRear(): enqueue
		- deleteFront(): dequeue
		- deleteRear(): dequeue
		- isEmpty()
		- isFull()
		- display()
		- getData()
		
	- Application
		- Web browers: to store browsing history
		- Job scheduling:
		- 
		- 
```java
takde code from notes
```	
4. Priority Queue
- It is a type of queue where each elements has a priority value. Elements with higher priority are processed before those with lower priority.
- Properties
	- Each element has an associated priority
	- Elements with higher priority are dequeued before those with lower priority.
	- If two elements have same priority, they are serverd according to their order in the queue.
	
- How priority is assigned?
	- Priority can be assigned on the value of an element. (Higher value = Higher priority),(Lower value = Higher priority)

- Operations
	- insersion()
	- deletion
	- peek()

- Types of Priority Queue
1. Ascending order Priority Queue
	- Lower priority values get higher priority.
	- eg. 4,6,8,9,10 => 4
	- Max heap
2. Descending order Priority Queue.
	- Higher priority values get higher priority.
	- eg. 4,6,8,9,10 => 10
	- Min heap
	
**Heap is used to implement priority queue**

- Advantage
	- Fast access according to the preference (priority)
	- For quick access using priority queue.
- Disadvantage
	- More complex than simple queue (implementation pov)
	- In higher memory operations, never save the priority.
	- 
- Application
	- Graph algorithm (Prims Algo, Krushkals Algo)
	- Data compression (Huffman's coding)
	- CPU Scheduling
	- Thread
	
### Heap:
- It is special form of complete binary tree that key value of each is smaller(or larger) than the key value than it's children.
- Always start with left child 1st, then right one.
- No more than 2 childs
- Nodes
	- Root Node : Super 
	- Intermidiate nodes
	- Leaf nodes.
- Types of Heap:
1. Max heap
	-If parents value is highest or equal in relation, known as max heap.
	- Parent value = Maximum
	- Ascending order Priority Queue
2. Min heap
	-If parents value is lowest or equal in relation, known as min heap.
	- Parent value = Minimum
	- Descending order Priority Queue
3. It'll be called in only Heap, if both above are not satisfying

- Properties
	1. Complete binary tree 
	- Every level except possibly the last level is completely filled & all nodes as far as left possible.
	2. Heap order property
	- Max heap: each parent node is larger than the children
	- Min heap: each parent node is smaller than the children
	
- Operations on Heap:
	- Insertion
	- Deletion
	- **Heappify** (Write psudo code)
	
### Hippyfy
	- Swapping of nodes to make Max/Min heap.
	- Advantage - we operate with half of the elements only, so time complexity decreses
Heap sort follows Array Implementation heap

```java
takde code from notes
```	