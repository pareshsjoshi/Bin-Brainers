# Collection Framework
What is purpose of Data Structure - To store data in managed way so it can retrieve easily.
what/why collection - It is collection of classes which will store and manage data
Framework - set of library
what are collection classes- Collection class known as container class. It can contain objects of same type.
Collection store only objects, not a primitive type data.
We can create object of container ie container object, which will contain no of objects.
All collection classes/interface are available in java.util package.
ArrayList dynamically increases size.
Hashing used to locate/store data in bucket. It is faster than arrayList, linkedList.
ArrayList - It does not store objects, but its references are stored in arrayList.
Set - represents collection that does not contain any duplicate elements, treeset, hashset, 
List - Stores data in ordered way. Indexed based operation is possible in list, It can contain multiple null values, it can also contain duplicate value.
Queue- It represents collection that ordered by FIFO(First in, First out) order/algorithm, implemented by ArrayDeque and PriorityQueue
Map Interface- It is root interface. It stores data in key-value pair. Does not allow duplicate key
Utility class - additional classes to provide support to interface and classes.
-Collections class - shuffling, reversing, sorting, searching collection object
-Arrays class - Sorting, searching, copying, filling arrays.

# Collection Interface Methods-
| Return Type | Method | Description |
|-------------|--------------|----------|
| boolean     | add ( E obj )   | Add object to the invoking collection.   |
| boolean    | addAll ( Collection <? Extends E> )   | Adds all the elements of c to the invoking   |
| void | clear ( ) | Removes all elements from the invoking collection. |
| boolean | contains ( Object obj ) | Returns true if obj is in invoking collection. |
| boolean | containsAll ( Collection <?> c ) | Returns true if the invoking collection contains all elements of c. |
| boolean | equals ( Object obj ) | Returns true if the invoking collection and obj are equal |
| boolean | isEmpty (  ) | Returns true if the invoking collection is empty | 
| Iterator<E> | iterator ( ) | Returns an iterator for the invoking collection. |
| boolean | remove (Object obj ) | Removes object from the invoking collection. |
| boolean |removeAll ( Collection <?> c  ) | Removes all elements of c from the invoking collection. | 
| boolean | retainAll ( Collection <?> c ) | Removes all elements from collection except those in c. |
| int | size ( ) | Returns the number of elements held in  the invoking collection. |
| Object [ ] | toArray( ) | Returns an array that contains all the elements stored in the invoking collection. |

# List Interface Methods
| Return Type | Method | Description |
| void | add (int index, E obj) | Inserts obj at the specified index. |
| void | addAll (int index, Collection <? extends E> c) | Inserts all elements of c at the specified index. |
| E | get ( int index ) | Returns element stored at specified index. |
| int | indexOf (Object obj ) | Returns the index of the first instance of obj in the invoking list. If it is not present, -1 is returned. |
| int | lastIndexOf (Object obj ) | Returns the index of the last instance of obj in the invoking list. If it is not present, -1 is returned.
| ListIterator <E> | listIterator( ) | Returns a ListIterator to the start for the invoking list |

