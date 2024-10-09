# Hashing
- Hashing is technique used to map data(key values) to a unique index in a fixed size table called as hash table.
- Primarily used to optimize seach, insertion & deletion operation.
o(1)
- It is a data structure that stores elements and allows insertion, lookups & deletions to be performed in O(1) time.
- Alternative Data structure - dictionary.
- In a hash table, a hash function is used to map keys into positions this is called as Hashing.
### Operations
1. Search
	- Compute f(k) & see if a pair exist
2. Insertion
	- Compute & place it at that position
3. Deletion
	- Compute & delete it at that poisition
.
.
.
.

- Hash function -> key % size of hash table
- Linear probing is used when collision occurs, hash function getting same index is known as collision.

##### Common hashing techniques
1. Direct Hashing
	- Each key is mapped directly to specific index in hash table.
	- drawback -  collision
	- h(x) = 42 % 10 = 2 index 2
2. Division method (Modulo method)
	- drawback - collision
3. Multiplicative method
	- h(x) = floor(table size * (key * A % 1 ))
	- A = standard constant (between 0 & 1) (Will be given)
	- Key is multiplied with constant value and the fractional part of the result is multiplied by table size of to get the index
	```
	key->42, table size->10, A->0.610
	h(x) = floor(10(42*0.610%1))
	```
4. Folding method
	- key->987654
	- 987 + 654 = 1641 <-index
	- h(x) = 1641 % table size -> unique index
	- Key is divided into equal parts and the parts are added to get the hash index.
	- As there is circular connection, probability of getting outOfBound is less.
	
5. Mid square nethod
	```
	3456789 -> 567
	h(x) = 567 % tablesize
	4567 -> 56
	h(x) = t56 % tablesize
	```
	- The key value is square and the middle digits are extracted to form the index.
	
###### Collision handling technique
![Hashing1](/ADS/D11/Hashing1.png)
1. Separate chaining (open hashing) (Linked List)
2. Open addressing (Close Hasing) (Array)
	a. linear probing
	b. quadratic probing
	c. Double hashing	

1. Separate chaining
    ```0,1,4,9,16,25,36,49,64,81
    0 1 2 3 4 5  6 7 8 9
    0 1     4 25 16    9
    81    64   36    49
    ```
![Hashing2](/ADS/D11/Hashing2.png)

2. Open Addressing
Collision are resolved by finding another empty slot within within the hash table.
![Hashing3](/ADS/D11/Hashing3.png)
	1. Linear Probing
	- Increment the index sequentially until an empty slot is formed.
	
    ```h(x) = (h(x)+i)%tablesize```
	```25,35 size->10
	25%10 = 5
	35%10 = 5
	(35+1)%10 = 6
    ```
	2. Quadratic Probing
	- Next index is found by increamenting the square of attempted number.

	```h(x) = (h(key) + i^2) % tablesize```
	
    ```20 30 2 13 25 24 10 9 size->11```

	3. Double Hashing
	- Uses a second hash function to determine step size after the collision
	
    ```h(x) = ((h(x) + i*h)(key))%tablesize```

##### Applications of Hashing

```
Load factor (alpha) - n/m
n-> no of elements in hash table
m-> total no of available slot(buckets)
alpha ~= 1
alpha << 1 low Hashing
alpha >> 1 almost full, high Hashing
```
- Difference in open hashing & close hashing
|Open hashing | Closed hashing |
|-|-|
|Linked list | Array |
| Separate chaining | linear probing, quadratic, Double |
| dynamic in size | fixed in size |
| Access time O(n) | O(n) in case of high number |
| Slower | Faster |

- Time Complexity
	|App/case	|Avg	|Worst|
	|-|-|-|
	|Search		|O(1)	|O(n)|
	|insertion	|O(1)	|O(n)|
	|Deletion	|O(1)	|O(n)|
- Space Complexity
				O(n)	O(n)
	- Separate chaining O(n+m) n->keys, m->buckets
	- Linear probing O(m)