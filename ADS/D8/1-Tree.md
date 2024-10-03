1. Tree
2. Binary tree
3. Tree Traversing
4. Binary search tree
Balanced & Imbalanced Tree
Skewed Tree - A binary tree which grow in one direction in either left or right direction.

#### Relationship of parents and LC & RC
**i is index of node.**
- LC = 2i+1, where i>=0; 2i, where i>=1 & i
- RC = 2i+2, where i>=0; 2i+1, where i>=1 & i
-Parent = (i-1)/2, where i>=0; i/2, where i>=1 

Reprentation of tree
1. Using Array
2. Using Linked List (Doubly)
```java
class BT{
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	BT(){
		root = null;
	}
	BT(int d){
		root = new Node(d);
	}
	
	void printInOrder(Node node){
		if(node == null)
			retun;
		printInOrder(node.left);
		System.out.print(node.data + " ");
		printInOrder(node.right);
	}
	void inOrder(){
		printInOrder(root);
	}
	void printPreOrder(Node node){
		if(node == null)
			retun;
		System.out.print(node.data + " ");
		printInOrder(node.left);
		printInOrder(node.right);
	}
	void preOrder(){
		printPreOrder(root);
	}
	void printPostOrder(Node node){
		if(node == null)
			retun;
		printInOrder(node.left);
		printInOrder(node.right);
		System.out.print(node.data + " ");
	}
	public static void main(String args[]){
		BT t1 = new BT();
		t1.root = new Node(11);
		
		
	}
	void postOrder(){
		printPostOrder(root);
	}
	for(int i=root;i.next!=null 
}
```
## Tree Traversal
1. Pre-order : Root, LC, RC
2. In-Order : LC, Root, RC
2. Post-Order : LC, RC, Root


## Balanced binary tree
- If on each level subtrees are growing equally or similary, we can call it balanced tree.
- It is balance id height of tree is O(log n).
- O(log n), where n is no of nodes.
- on every level, n/(2^i)

### Types
1. Binary Search Tree		- VIMP
2. AVL Tree					- IMP
3. Red-Black Tree			- IMP
4. B Tree
5. B+ Tree

#### 1. Binary Search Tree(BST)
- A binary tree data structure in which each node has a key & satisfies following properties.
- Property:
	1> Left subtree of node contains only nodes with keys less than the root node keys.
	2> Right subtree of node contains only nodes with keys greater than the root node keys.
	3> Both left and right subtree must also be a binary search tree.
##### - Property:
1. Binary Tree

2. Ordering property
	- left subtree <= root
	- right subtree >= root
3. Search property
	- Search operation is the efficient with time complexity directly propertional to the height of the tree.
	- Fastest operation
4. In-order traversal
	- It always result into ascending sorted order.
5. Efficiency
	- Operations performed like, insertion, deletion, search, it's best case results in O(log n), when tree is balanced.It's worst case results in O(n), when tree is skewed.
- Insertion 
    ```	
    12 8 18 5 11 15 30 50 100
    ^Root	12
        8		18
    5	   11 15	30
                        50
                            100	
                            
    3 5 9 15 23 49 155 999
    3
        5	
            9
                23	
                    49
                        155
                            999	
    ```						
- Deletion
	> Case 1: Delete a leaf node.
		>> Simply remove element
	> Case 2: Delete a node with one child.
		>> Replace child node with a node.
	> Case 3: Delete a node with two children.
		>> Get in-order of tree
		>> replace successor node with a node (Smallest node in the right subtree) or in-order predecerssor.


##### Drawback of BST
- In order traversal sorted - Tree is growing in only one directly
- Result ==> Unbalanced tree
- Solution ==> Convert Unbalanced tree --> Balanced tree
	i.e. AVL tree, Red-Black tree (Both are Balanced tree)

