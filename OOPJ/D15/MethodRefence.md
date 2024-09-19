#    Method reference
-    If method already exist in class and have same signature as functional method(method of interface) then we can use method reference instead of lambda expression
-    Syntax
```java
    //printable is interface
    //For static method
    Pritable p = Program::showRecord;
    p.print();

    //For non-static method
    Program ref - new Program();
    Pritable p = ref::showRecord;
    p.print();
```
*   Example
```java
    @FunctionalInterface
    interface Printable{
        void print( String str );
    }

    public class Program {
        public static void showRecord( String str ) {
            System.out.println( str );
        }
        
        public void displayRecord( String str ) {
            System.out.println( str );
        }
        
        public static void main(String[] args) {
            Program reference = new Program();
            Printable p = reference::displayRecord;	//Method reference using non static method
            p.print("Hello DAC");
        }
        
        public static void main2(String[] args) {
            //Printable p = //Lambda Expression
            //Printable p = //Method Reference
            Printable p = Program::showRecord;	//Method reference using static method
            p.print("Hello");
        }
    }
```
-    if you are calling any method on input parameter inside input body of lambda expression then you can use another syntax of method reference.
```java
    //Sample is interface.
    Sample s = (String str) -> str.toLowerCase(); //syntax1
    Sample s = String::toLowerCase; (Non-static but using method of String itself) //syntax2
```

#    Constructor reference
```java
    Sample s = Employee::new ;	//Constructor reference 
    Employee emp = s.get("Sandeep", 33, 45000.50f );
```
-    It will call constructor and instantiate class.
-    We can create new instance of a class using constructor reference. While passing parameters type and number of types should match with that of constructor of the instantiated class.