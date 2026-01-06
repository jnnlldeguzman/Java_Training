package M3_Activities;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M3_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Queue<Product> products = new LinkedList<>();
		
		//initialize 5 products and prices
		products.add(new Product("Sinturon ni Hudas", 745));
		products.add(new Product("Piccolo", 40));
		products.add(new Product("Watusi", 10));
		products.add(new Product("Pa pop", 5));
		products.add(new Product("Fireworks", 999));
		
		try (Scanner input = new Scanner(System.in)) {
			boolean runs = true;
			double totals = 0;

			
			while (runs == true) {
				
				M3A3_Menu();
				
				System.out.print("Enter your choice: ");
				int choice = input.nextInt();
				
				String prod = "";
				double price = 0;
				int count = 0;
				
			switch(choice){
			case 1:
				System.out.print("Enter product name: ");
				prod = input.next();
				System.out.print("Enter product price (Php): ");
				price = input.nextDouble();
				products.offer(new Product(prod, price));
				System.out.println("Product added to checkout line!");
				break;
				
			case 2:
				Product process = products.poll();
				if(process != null) {
					totals += process.getPrice();
					System.out.println("Processed: " + process.getName() + " (Php " + process.getPrice() + ")");
					System.out.println("Total bill so far: ₱" + totals);
				}
				else {
					System.out.println("No products in line.");
				}
				break;
				
			case 3:
				for (Product product : products) {
					count++;
				}
				System.out.println("Number of products in line: " + count);
				break;
				
			case 4:
				System.out.println("Total bill so far: ₱" + totals);
				break;
			
			case 5:
				runs = false;
				System.out.println("Closing cashier line...");
				System.out.println("Final total bill: ₱" + totals);
				break;
				
			default:
				System.out.println("Invalid input. Try again.");
				break;
			}
				
			}
		}
		 	
		
		
	}
	
	static void M3A3_Menu() {
		System.out.println("========Chekwa Fireworks=======");
		System.out.println("|                             |");
		System.out.println("| 1. Add a product            |");
		System.out.println("| 2. Process next product     |");
		System.out.println("| 3. Check number of produc   |");
		System.out.println("| 4. View total bill so far   |");
		System.out.println("| 5. Exit                     |");
		System.out.println("===++=====================++===");
	}

}
