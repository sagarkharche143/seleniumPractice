package task;

public class Government {
	int payTax;
	void payTax(int a , int b) {
		
	}

	public static void main(String[] args) {
		Government objgov = new Government();
		objgov.payTax(100,200);
		Individual objind = new Individual();
		objind.payTax(1000,2000);
		Businessman objbus = new Businessman();
		objbus.payTax(10000,20000);
		
	}

}
