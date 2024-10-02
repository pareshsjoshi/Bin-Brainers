# Tree
- Each node in tree can further have subtree below it's hierarchy.
- Non linear data structure.
- It represents hierarchical relationship among variour data element.

### Terminologies
0. Node
	- Each element in tree is refered as Node.
1. Root Node
	- Top most element is known as Root Node.
2. Leaf node
	-It refere to node with no children
3. Sub-tree
	- A portion of tree, which can be as separate tree in itself.
4. Children of node
	Root of subtree of a node are called children of the node.
5. Edge
	- Link from parent to child.
6. Degree of node
	- Number of children connected to node. 
7. Ancestors
	- All nodes in path from the root to that node. Or previous nodes of a node. Or Parent nodes of node.
8. Descendants - 
	- All nodes accessible from given node. Children of given node.
9. External nodes
	- Also known as extended nodes.
	- These are null node.
10. Internal Nodes
	- Also known as intermediate node.
11. Degree of tree
	- Highest degree of node in tree.
12. Depth of tree
	- No. of levels in tree, starts with zero(0) in downward direction.
13. Depth of node
	- No. of levels in tree which represents node in downward direction.
14. Height of tree
	- No. of levels in tree, starts with zero(0) in upward direction.
15. Height of node
	- No. of levels in tree which represents node in upward direction. 
	
### Properties of Tree
1. No of nodes must be finite & non-empty
2. Every node must be connected somewhere in tree.
3. There must not be any cycle in tree.

## Binary Tree
- Binary tree is a specific type of tree, in which each node can have at most 2 children, viz. keft child, right child.
- Tree in which every node has at most 2 children.
- The maximun number of nodes on nth level of binary tree is 2^n, where n>=0.
- The maximun number of nodes on nth level of binary tree is 2^(n-1), where n>=1.
- The maximun number of nodes in binary tree of depth k is (2^(k+1))-1, where k>=0.
	- k=3 -> (2^(3+1))-1 = 16-1 = 15
- The maximun number of nodes in a binary tree of depth k is (2^k)-1, where k>=1
	- k=3 -> (2^4)-1 = 16-1 = 15
### Types of binary tree
1. Strictly binary tree
2. Full binary tree
3. Complete binary tree
4. Incomplete binary tree
5. ACBT - Almost complete binary tree (Imp)
6. Perfect binary tree

#### Strictly binary tree
- A binary tree in which every node, except for leaf node, has non-empty left and right children.
- Wherever node is extending, it should have 2 children.
- A binary tree is a full binary tree is every node has 0 or 2 children.

#### Full binary tree
- A binary tree in which every level is complete and has maximun number of nodes in 
- Depth = (2^(n+1))-1, where n>=0.
- A binary tree is a full binary tree is every node has 0 or 2 children. Depth = (2^n)-1

#### Complete binary tree
- A binary tree with n node and depth d whose node correspondes to the nodes numbered from 0 to n-1 in the full binary try of depth k.
- A complete binary tree is a type of binary tree where every level, except possibly the last, is fully filled with nodes, and all nodes are as far left as possible.
- Agar nodes ko numbering kare to vo continuous order me hona chahie.
- Agar order me koi gap ho to incomplete tree.

#### Incomplete binary tree

#### ACBT

#### Perfect binary tree
No of nodes -> 2^n
Total no of nodes in PBT = 2(h^-1)-1
Height of PBT -> n = no of nodes, h = height of tree
PBT = 2^(h-1)-1
number of leafs = h^2
number of non-leaf nodes 2^(h+1)-1 = (2^n)-1

