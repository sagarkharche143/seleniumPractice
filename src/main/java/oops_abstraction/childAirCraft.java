package oops_abstraction;

public class childAirCraft extends ParentAirCraft {
	
	public static void main(String[] args) {
		ParentAirCraft obj = new childAirCraft();
		obj.bodyColour();
		obj.engine();
		obj.safetyGuideline();
	}

	@Override
	public void bodyColour() {
		System.out.println("Red colour on body");
	}

}
