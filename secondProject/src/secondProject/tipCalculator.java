package secondProject;

public class tipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double subTotal = 41.23;
		double tax = 41.23 * 0.13;
		double tip = 41.23 * 0.15;
		
	
		System.out.println("The cost of meal pre-tax is "+subTotal+".");
		System.out.println("Tax charged on meal is "+tax+".");
		System.out.println("Total of meal excluding tip is "+ (subTotal + tax));
		System.out.println("Tip cost is "+ tip + ".");
		System.out.println("Total of meal including tip is "+ (subTotal + tip));
		
		
	}

}
