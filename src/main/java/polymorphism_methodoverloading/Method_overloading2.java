package polymorphism_methodoverloading;

public class Method_overloading2 {
	
	public static void main(String[] args) {
		Addition2 add2 = new Addition2();
		// By changing datatypes
		System.out.println(add2.add(5,5));
		System.out.println(add2.add(5.5, 5.5));
	}

}
