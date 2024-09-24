## Abstract Data Structure (ADT)
- ADT is type/class for objects whos behaviour is defined by set of rules.
- The defination of ADT only mentione swhat operations are to be performed but not how to perform or how to implement
- It does not specifiy ho data will be organized in memory and what algorithms are used for implementation.
- It is called as 'abstract' bcz it give an implementation-independant view.
//D1.2 ADT digram
- Remember - Whenever we want to optimize the program, make use ADT (Java Collection Framework).

  - listen starting of recording D1.2 till 3.17

## Recursion:
- Any function which call itself directly or indirectly is called as recursion. The corresponding function is called recursive function
- Recursive method solves problem by calling copy of itself to work on smaller problem.
- It is important to ensure that recursion must end.
- Each time function call itself with slightly simple version of original problem.

```java
void recFun(){ //recursion function
	//statemet(s);
	recFun();		recursive call : copy of recFun function
	//statemet(s);
}
public class program{
	p.s.v.m(S.a[]){
		//statemet(s);
		/recFun();	 	calling funtion
		//statemet(s);
	}
}
```
Types of recursion
1. Direct Recursion
	- A function is called direct recursive if it calls the same function. eg.
```java
	//Direct Recursion
	void fun(){
		fun();
	}
```
2. Indirect Recursion
	- A function is called indirect recursive call if it calls another function, which is calling current function it in.
```java
	//Indirect Recursion
	void fun1(){
		fun2();
	}
	void fun2(){
		fun1();
	}
```
*Q.* If your program enters in infinite loop, then what will happen in background? 
*Ans.* It'll traverse in recursion till allotted memory is used.
	
- As recursive tree starts growing function values goes in stack memory, and memory gets free as function comes out of recursive functions.
	
#Final Boss Example
Find factorial using recursive function
```java
//Recursive tree - in attached image
//Logic - in attached image	
//Infinite loop
class Recursion{
        static int fact(int n)
        {
                if(n<=1)
                        return 1;
                else
                        return n*fact(n-1);
        }
        public static void main(String args[])
        {
              System.out.println(fact(5)); //method call
        }
}
```
![Logic & Recursive Tree](https://github.com/pareshsjoshi/Bin-Brainers/blob/main/ADS%2FD1%2FRecursion%20Logic.png)