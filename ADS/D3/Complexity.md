Priority Analysis, Posterior Analysis

Algorithm Complexities
1. Time Complexity
	- Measured by counting the of key operation such as comparisions in the sorting algorithm.
2. Space Complexity
	- Measures by counting maxiumum memory space required by the algorithm.

Asymptotic Notation (Symbols) - We use it to define complexities
- Asymptotic analysis of an algorithm refers to defining the mathamatical boundations of its run-time performance
Mathamatical boundations - Behaviour of program betweem upper & lower limit. upper limit-start of program, lower limit-end of program
**Notations**
1. Best case - minimum time required form program execution (Symbol - Ohm)
2. Average case - Average time required for program execution (Symbol - Theta)
3. Worst case - maximum time required for program execution (Capital letter 'O')

**Constant time complexity** -
- If we have 3 number of lines and execution is taking 1s per line then f(n) = 3 & will be represented as O(1), also can be called as constant time complexity.

**Constant space complexity** -
- If we have 3 variable each taking space of 1 unit then s(n) = 3 & will be represented as O(1), also can be called as constant space complexity.
- O(1) - Order of one - It is *constant notation*.

```
n=5						//t:1	s:1
int a[] = new int[n]	//t:1	s:n
s=0;					//t:1 	s:1
int i;					//t:1	s:1
for(i=0;i<n;i++){		//t:n+1 - executing n+1 time
	s+=i;				//t:n - executing n time
}
return s				//t:1
```
**Linear time complexity**
for above program f(n) = 2n+5
represented as O(n)

**Linear space complexity**
for above program s(n) = 3n
represented as O(n)

```
Add(A, B, n){		s:A=n^2,B=n^2,C=n^2,n=1,i=1,j=1
	for(i){								//t:n+1
		for(j){							//t:(n+1)*n
			C[i,j] = A[i,j] + B[i,j]; 	//t:n*n
		}
	}
}
```
**Quadratic time complexity**
- for above program f(n) = (n+1)+n((n+1)+n) = (n^2)+n+1
- represented as O(n^2)

**Quadratic space complexity**
- for above program s(n) = 3(n^2)+3
- represented as O(n^2)

**Cubic time complexity**
- for(){for(){for(){}}} 		//t:3

**Cubic spcae complexity**
- A[i,j,k]					//s:3

```
for(i=0;i<n;i++){					//t:n+1
	for(j=0;j<i;j++){				//t:(i+1)*n
		C[i,j] = A[i,j] + B[i,j]; 	//t:i*n
	}
}
```
In worst case, above example would be Quadratic time complexity. In Best case, It would be Linear time complexity.

```
p=0;
for(i=1; p<=n; i++){
	p+=i;
}
```
**Square-root time complexity**

- for(i=1; i<n; i=i*2){}

**Logarithmic time complexity**

-    O(1) - Constant
-    O(logn) - Logarithmic
-    O(n) - Linear
-    O(n^2) - Quadratic
-    O(n^2) - Cubic
-    O(2^n) - Exponential
-    O(3^n) - Exponential
-    O(n^n) - Exponential
-    Best to Worst
-    O(1)<O(logn)<O(n^-2)<O(n)<O(nlogn)<O(c^n)<.<O(n^c)<.<O(n^n)<O(n!)

### Time & Space complexity for Arrays:
1. Accessing an element 1-D Array: t:O(1), s:O(1)
2. Inserting at the end 1-D Array: t:O(1), s:O(1)
3. Inserting at the begining 1-D Array: t:O(n), s:(n)
4. Searching in 1-D Array: t:O(n), s:(1)
5. Delete an element in 1-D Array: t:O(n), s:(1)
6. Transpose of a matrix in 2-D Array: t:O(m*n), s:(m*n)

#### Eg.
![Screenshot1](/ADS/D3/Screenshot%201.png)
![Screenshot2](/ADS/D3/Screenshot%202.png)
![Screenshot3](/ADS/D3/Screenshot%203.png)
![Screenshot4](/ADS/D3/Screenshot%204.png)
![Screenshot5](/ADS/D3/Screenshot%205.png)
![Screenshot6](/ADS/D3/Screenshot%206.png)