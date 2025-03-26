package estruturaSequencial;

import java.util.Locale;

public class SecaoQuatroExercicios1 {

	public static void main(String[] args) {
		String product1 =  "Computer";
		String product2 =  "Office desk";
		
		int age = 30;
		int code =  5290;
		char gender = 'F';
		
		double price1 =  2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products: %n Computer, wich price is $ %.2f%n"
				+ " Office desk, which price is $ %.2f%n%n", price1, price2);
		
		System.out.printf("%d years oldf, coode %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: %.8f%n ", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n ", measure );
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f ", measure);	
		

	}

}
