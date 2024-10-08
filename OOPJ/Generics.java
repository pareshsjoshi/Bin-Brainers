/*Generics
-Using Object class
-Using Generics*/
//Consider generic class using java.lang.Object class
//code
class Box {
	private Object object;
	public Object getObject() {
		return this.object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}
public class Test {
	public static void main(String[] args) {
		Box box = new Box();
		Date date = new Date();
		box.setObject(date);
		System.out.println(box.getObject());
	}
}
//code
//Typesafe - It is to ensure object type is used as it supposed to.
/*ParameterizedType-
We pass data type as argument in generic class.*/
//code
class Box<T>{
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
}
public class Test {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setObject(10);
		System.out.println(box.getObject());
	}
}
//code
/*Why generics-
Stronger type checking at compile time, jis me pass kiya usi me catch kro.
Don't required explicit type casting
we can implement generic data structer & generic algorithms.*/
//Type argument must be non-primitive and reference type only
//Bounded type parameter - to restrict type parameter for perticular data type(s) only.
/*In generics "?" is known as wild card, it represents unknown type.
Wild card ypes- unbounded wild card, upper bounded wild card, lower bounded wild card.
//code 12.8 d3
Upper bounded wild card - ? extends Number - allow itslef and all subclass of number
Upper bounded wild card - ? super Integer - allow itslef and all superclasses of integer*/
//Which are restriction of generics...
//Type eraser - if integer type is set as type argument type, it will erased automatically for compile purpose and set to Object.
//Reference - https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
