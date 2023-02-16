package polymorphism_methodoverloading;

public class Method_overloading1 {

	public static void main(String[] args) {
		Addition add = new Addition();
		// By changing no of arguments or param.
		System.out.println(add.add(5,6));
		System.out.println(add.add(5, 5, 5));

	}

}
