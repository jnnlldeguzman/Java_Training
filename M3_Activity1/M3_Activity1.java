package M3_Activities;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M3_Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> products = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Printer"));
		
		System.out.println("All Products: ");
		for(int i=0; i < products.size(); i++) {
			System.out.println (i+1 + ". " + products.get(i));
		}
		
		products.add("Webcam");
		products.remove("Mouse");
		
		System.out.println("\nAfter adding and removing products: ");
		for(int i=0; i < products.size(); i++) {
			System.out.println (i+1 + ". " + products.get(i));
		}		
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("\n Enter product name to search: ");
		String prodSearch = input1.nextLine();
		if (!products.contains(prodSearch)) {
			System.out.println("\n System Not Found.");
		}
		else {
			System.out.println("\n Product Found: " + prodSearch);
		}

	}

}
