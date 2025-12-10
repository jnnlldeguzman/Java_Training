package M2_Activities;

//import java.util.Scanner;

public class M2_Activity3 {

	public static void main(String[] args) {
		
		
		//my first car
		M2A3_Car car1 = new M2A3_Car();
		car1.brand = "BMW";
		car1.model = "M5";
		car1.year = 2020;
		
		
		System.out.println("===Car #01===");
		car1.displayInfo1();
		System.out.println("=============");
		System.out.println(" ");
		
		
		
		//second car
		M2A3_Car car2 = new M2A3_Car ("honda", "civic", 2025);
		

		
		System.out.println("===Car #02===");
		car2.displayInfo2();		
		System.out.println("=============");	
		
		
		
//		S3Car car3 = new S3Car("status", "color");
//		car3.displayInfo3();

	}

}
