package Individual;
/**
 * 
 */


import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);

        int sum = 0;
		
		for (int i=1; i<=50; i++) {
			
			sum += i;
			
		} 
		
		System.out.println("sum : " + sum);
		
		
		input.close();
	}

}
