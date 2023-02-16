package polymorphism_methodoverriding;

public class Method_Overriding {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		System.out.println(s.getRateOfInterest());
		Pnb p = new Pnb();
		System.out.println(p.getRateOfInterest());
		Icici ic = new Icici();
		System.out.println(ic.getRateOfInterest());
		
	

	}

}
