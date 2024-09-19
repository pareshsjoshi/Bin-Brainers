-   Functional interface is annotation is introduced in java 8.
-   An expression, which contains lambda operator (->) is called as lambda expression.
-   Meaning of lambda operator (->) is "goes to"
-   Syntax ->
-   Functional_interface ref = Lambda expression.
-   Lambda expression: Input param -> Lambda body
```java
    InterfaceName ref = returnType -> returnLogic;
```
-   Lmbda expression also known as Anonymous method
-   To implement functional interface, we can use lambda expression.
    //code
-   If we define lambda expression, internally no .class file is created.
-   invokedynamic - instruction to implement lambda expression in byte code
-    JVM implicitly creates private static void method for anonymous method.
-   Using lambda expression, development time is reduced.
-   Functional interface eg. java,util.Function
-   Predicate<T> test(), Consumer<T> accept(), Supplier<T> get(), Function<T,R>  apply().
-   When we pass method body as parameter to another method it is called behavior parameterization (demo 8)
```java
public static void print( Consumer< String> c, String str ) {
		c.accept(str);
	}
	public static void main(String[] args) {
		Program.print(str -> System.out.println( str ), "Hello1");
	}
```
![Lambda_Expression](/OOPJ/D15/LambdaExprBySir.jpg)