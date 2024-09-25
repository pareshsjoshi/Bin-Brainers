# Arrays 
- Finite, ordered, homogeneous
- An array is a finite ordered and collection of homogeneous data elements
	- Finite: Limited number of elements
	- Ordered: Elements are stored one by one in contiguous location of computer memory in linear fashion
	- Homogeneous: All elements of an array are of the same data type.
	
### Need of Array DS
- Stores data for processing.
- Implement data structures such as stacks & queue
- 2D: Can represent data in tables & matrix
- Create dynamic data structure like linked list & trees.
---
```
Address (A[i]) = M + (i - L) * w      (M - Memory starting address, Lowest, w - Bytes of type, i - index)
Size (A) = U-L+1  (U - upper limit, L - lower limit)
Calculate memory address
    String[] strArr = {A,R,R,A,Y,S};
    Address (A[2]) = ?
    M = 100
    Address (A[2]) = 100 + (2-0)*2
    Size(A) = (5-0)+1
```
---
Row major order / Column major order
(m*n = 3x4)
1. Row major order
    - Address(aij) = M+(i+1)*n+j-1
    - a13 = 100+(1-1)*4+3-1 = 102
2. Column major order
    - Address(aij) = M + (j-1)*m+i-1
    - a34 = 100+(4-1)*3+3-1 = 111
![Row/Column Major Order](/ADS/D2/Head-Tail%20Recursion.png)	

### Array Operation
- Insertion
- Deletion
- Searching
- Sorting
- Traversal
- Merging

```java
class Array{
	public static void main(String[] args){
		int a1[] = new int[100];
		int size = 10;
		
		a1[0] = 11;
		a1[1] = 13;
		a1[2] = 15;
		a1[3] = 51;
		a1[4] = 71;
		a1[5] = 56;
		a1[6] = 48;
		a1[7] = 8;
		a1[8] = 99;
		a1[9] = 110;`
		
		
		
	}
}
```