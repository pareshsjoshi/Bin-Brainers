# Sorting
- Refers to arranging element in some logical order
- Ascending & Descending

#### Type of Sorting
##### 1. Internal & External Sorting
1. Internal Sorting
	- If all the data that is to be sorted can be adjusted at that time in main memory, then Internal Iorting methods are used.
	Bubble, insertion sorting
2. External Sorting
	- If all the data that is to be sorted can't be accomodate in the memory at the same time and some has to use auxillary memory, then it is External Sorting
	- Quick sort, Merge sort
##### 2.Stable & Not Stable Sorting
1. Stable sorting
	- If a Sorting algorithm, after sorting the contents, does not change the sequence of similar content in which theu appear, is called Stable Sorting.
	Bubble sort
2. Not stable sorting
	- If a sorting algorithm, after sorting the contents, changes the sequence of similar content in whhich they appear, is called Not Stable Sorting.
	Quick sort
    
![Stable/NotStable](/ADS/D9/Stable-Not%20Stable.png)
### Bubble Sorting
- It is Internal sorting
- It is Stable sorting

```java
class BubbleSorting{
	static void bsort(int[] a){
		int n = a.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(a[j] > a[j+1]{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				display(a);
			}
			display(a);
		}
	}
	display(int[] a){
		for(int arr:a)
			System.out.println(arr + " ");
	}
	public static void main(String[] args){
		int[] a = {2,13,24,56,45,9,30};
		bsort(a);
		display(a);
	}
}
```
