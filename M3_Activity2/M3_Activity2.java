package M3_Activities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class M3_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner inputProd = new Scanner(System.in);
		 Set<String> products = new HashSet<>();
		 
		 boolean runsMenu = true;
		 
		 
			products.add("Laptop");
			products.add("Monitor");
			products.add("Mouse");
			products.add("Keyboard");
			products.add("Printer");
		

		 while (runsMenu == true) {
			 
		      System.out.println("\n");   	 
		      System.out.println("=*========= JRDGadgets =========*=");      
		      System.out.println("|| 1. Search a product          ||");
		      System.out.println("|| 2. Add a product             ||"); 
		      System.out.println("|| 3. Print a products & count  ||");
		      System.out.println("|| 4. Exit                      ||"); 
		      System.out.println("=*==============================*=");   
		      System.out.println("\n");    
		      
		      Scanner input = new Scanner(System.in);
		      System.out.print("\nEnter choice: "); 
		      int choice = input.nextInt();

		      String products2 =" ";
		      
			  switch (choice) {
		      
		      case 1:
		    	  
		    	    
					System.out.print("\n Enter product name to search: ");
					products2 = inputProd.nextLine();
					
					if (!products.contains(products2)) {
						System.out.println("\n System Not Found.");
					}
					else {
						System.out.println("\n Product Found: " + products2);
					}
				      
		      break;
		      
		      case 2:  
		    	    
     		    	System.out.print("Enter product name to add: ");
					products2 = inputProd.nextLine();	
					products.add(products2);
					System.out.println("Product added: " + products2);
					
	      
		      break;
		      
			  case 3:
					System.out.println("All products:");
					for(String produce : products) {
						System.out.println(produce);
					}
					System.out.println("Total unique products: " + products.size());
					
			  break;
					
		      case 4:
		    	  runsMenu = false;
		    	  System.out.println("Exit Program.. ");
		       break;
		    	  
		      default:
		    	  System.out.println("Invalid Input");
		      
		      }
		      
		      
			 
			 
		 }
		 
	}

}
