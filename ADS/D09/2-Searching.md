# Searching
- Using for loop for searching
	- Best case O(1)
	- Avg Case O(n)
	- Worst Case O(n)
#### Type of Searching
1. Linear seach
	- work on sorted as well as unsorted
	- sequentially access
	- access slow
	- 1D and multi-dimention
	- Easy to implement
2. Binary searching
	- Work on sorted array.
	- Access through mid point value calculation
	- 1D dimention only.
	- complex operation.
```java	
//Binary Searching
static int bsearch(int a[], int x, int l, int r){
	if(r>1){
		int mid = l+(r-l)/2;
		if(a[mid]==x)
			return mid;
		if(a[mid]>x)
			return bsearch(a, x, l, mid-1);
		return bsearch(a, x, l, mid+1);
	}
	return -1;
	
	public static void main(String[] args){
		int a[] = {22,44,66,77,88,99};
		int x = 188;
		int n = a.lenght;
		int res = bsearch(a, x, 0, n-1);
		if(res==-1)	
			System.out.println("Res: " + 
	}
}
```
- Important fomula:
	> Original - mid = (low+high)/2 (Can give issue in right side of mid point)
	> Updated - mid = low + (low+high)/2 (Can work in any case)

- Linear search - Restaurant menu 
- Binary search - English dictionary