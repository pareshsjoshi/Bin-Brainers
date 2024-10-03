1. Binary search tree
2. Tree applications
3. Sorting techniques

Insertion of Node in tree
```java
Node insert(Node root, int key){
	if(root == null){
		root = new Node(key);
		return;
	}
	if(key<=root.data)
		root.left = insert(root.left,key);
	else
		root.right = insert(root.right,key);
	return root;
}
```

Deletion of Node in tree
```
Node delete(Node root, int key){
	if(root == null){
		return root;
	}
	if(key<root.data)
		root.left = delete(root.left,key);
	else if(key>root.data)
		root.right = delete(root.right,key);
	else{
		if(root.left == null)
			return root.right;
		else if(root.right == null)
			return root.left;
		root.data=minValue(root.right);
		root.right=delete(root.right, root.data);
	}
}
int minValue(Node root){
	int x = root.data;
	while(root.left!=null{
		x=root.left.data;
		root = root.left;
	}
	return x;
}
```

## AVL tree
- An AVL tree is a self balancing BST where the difference between heights of the left and right subtree (balance factor) of any node is at most 1.
- Also call height balancing BST.
> Balance factor = height of left subtree - height of right subtree.
> Range: BF {-1,0,1}
> if >=2 || <=-2 , we need to balance tree.
- We use rotations for balancing the tree.
- Every node maintains an extra information known as balance factor.
- Every AVL tree is BST, but not vice versa.
- Time complexity: O(long n)
#### Operations
1. Insertion
2. Deletion
3. search

Start from leaf node
if |balance factor| >= 2, do rotation.

#### Approaches
- Single Rotations
	- Left rotation 
	- right rotation
- Double Rotations
	- left-right rotation 
	- right-left rotation

- Left rotation
	- When a node is inserted  into right subtree of right subtree, then we perform single left rotation
	![LeftRotation](/ADS/D8/Left%20rotation.png)
- Right rotation
	- When a node is inserted  into left subtree of left subtree, then we perform single right rotation
	![RightRotation](/ADS/D8/Right%20rotation.png)
- Left-Right Rotation
	- It is combination of left rotation followed by right rotaion.
	- Need change!! It is used when a subtree extended in left subtree which has left subtree null/smaller than right is subtree.
	![LeftRightRotation](/ADS/D8/Left-Right%20rotation.png)
- Right-Left Rotation
	- It is combination of right rotation followed by left rotaion.
	- Need change!! It is used when a subtree extended in right subtree which has right subtree null/smaller than left is subtree.
	![RightLeftRotation](/ADS/D8/Right-Left%20rotation.png)
```	
Eg. 50 30 60 20 10
bf			2
bal		2	50	 0
	1	30		60
0	20
10		27
After 
```
![AVL Visual](https://www.cs.usfca.edu/~galles/visualization/AVLtree.html)

#### Applications
- Data bases
- Memory allocation

## Red & Black Tree
![Red-Black Tree1](/ADS/D8/Red-black%20tree1.png)
![Red-Black Tree2](/ADS/D8/Red-black%20tree2.png)