Analysis of Algorithm, Stack, Stack Application

# Stack
- Linear data structure following LIFO(Last In First Out) principle
- Insertion & Deletion at one end called as *top of the stack*
- LIFO(Last In First Out)  - Last element inserted is the first one to be deleted.

Representation of Stack:
1. Fixed size stack: stackic in nature : It is array implementation
- It has fixed size, that channot be changed.
- If stack is full, we call it Overflow. If stack is empty, we call it Underflow.
2. Dynamic size stack: dynamic in nature : Linked list representation
- It is dynamic in size
- Automatically grow or shrink

* Stack Operation:
	- Insertion: push()
	- Deletion: pop()
	- Tos position: peek()/tos()/top() - Top of Stack
	- Underflow: isEmpty()
	- Overflow: isFull()

Array implementation of stack-
```java
//code in StackProgram.java
```

## Stack Applications:
1. Balancing of symbol
2. String Reversal
3. Redp/Undo
4. Recursion
5. Depth of Search (DFS)
6. Backtracking
7. Expression Evaluation
8. Memory management

- String Reversal //Code
- Balancing of symbol //H/W
- Express Evaluation
	- Infix Notation -> A+B
	- Prefix Notation -> + A B
	- Postfix Notation -> A B +
	
Operator Precedence(preference)
1. BODMAS
2. Brackets, Exponential(^), (*/+-)

- Example ss

- Coversion of Infix to Postfix ss
- Coversion of Infix to Prefix - Reverse eq, to conversion, reverse output again to get Prefix

- Postfix Evaluation 	3*(10+5) => 3 10 5 + *

![Postfix](/ADS/D3/Postfix.png)