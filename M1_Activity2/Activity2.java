package Individual;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your age: ");
		String ageString = input.nextLine();
		
		int ageInt = Integer.parseInt(ageString);
		double ageDouble = ageInt;
		
		
		System.out.println("Your age as int: " + ageInt);
		System.out.println("Your age as doub " + ageDouble);
		
		input.close();
	}

}
