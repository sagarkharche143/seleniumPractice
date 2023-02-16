package oops_inheritance;

public class SimpleInherit {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		System.out.println(b.str);
		
		ClassA a = new ClassB();
		// creates object for classB but acquiring properties of classA
		
		System.out.println(a.i);
		
	}

}
