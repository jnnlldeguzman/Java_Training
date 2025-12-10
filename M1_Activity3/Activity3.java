package Individual;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		 //Read input1
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
 
        //Read input2
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
 
 
        int sum = num1 + num2;
        int difference = num1 - num2;
        int prod = num1 * num2;
//        int quo = num1 / num2;
//        int remainder = num1 % num2;
// 
        // output
        System.out.println("Sum:  " + sum);
        System.out.println("Difference:  " + difference);
        System.out.println("Product:  " + prod);
        
        input.close();
	}

}
