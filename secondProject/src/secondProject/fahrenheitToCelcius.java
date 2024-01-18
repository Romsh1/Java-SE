package secondProject;

import java.util.Scanner;

public class fahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//double fahrenheit, celcius;
		
		System.out.println("Enter the temperature in fahrenheit: ");
		
		String fahrenheit = scanner.nextLine();
		
		double convertedVal = Double.parseDouble(fahrenheit);
		
		
		double formula = (5.0/9.0) * (convertedVal - 32);
		
		System.out.println("The temperature in celcius is "+ formula);
		
		scanner.close();
		
		
		/*double fahrenheit = 0;
		double celcius = (5/9) * (fahrenheit - 32);
		
		System.out.println("The temperature in f is "+ fahrenheit);
		System.out.println("The temperature in celcius is "+ celcius);*/
		
		
	}

}
