package Individual;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {

		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		
		 
			//Read input1
			System.out.print("Enter your age: ");
			int age = input.nextInt();
			
			
			if(age < 18) {
				System.out.println("Minor");
			} else if (age >= 18 && age<=59 ) {
				System.out.println("Adult");
			} else {
				System.out.println("Senior");
			}

			input.close();
	}

}
