package formattedOutput;

import java.text.NumberFormat;

public class formattingCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String formattedCurrency;
		
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		formattedCurrency = moneyFormatter.format(20.8888888);
		
		System.out.println(formattedCurrency);
	}

}
