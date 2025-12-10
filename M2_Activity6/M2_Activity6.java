package M2_Activities;

public class M2_Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M2A6_Car car = new M2A6_Car(4, "BMW");
		M2A6_Truck truck = new M2A6_Truck(14, "Isuzu");
		
		//Entry1
		car.startEngine();
		car.refuel();
		System.out.println("Number of wheels: " + car.getNumberOfWheels());
		
		//Entry2
		
		truck.startEngine();
		truck.refuel();
		System.out.println("Number of wheels: " + truck.getNumberOfWheels());
	
	destroyVehicle(car);
	destroyVehicle(truck);
	
	}

	private static void destroyVehicle(M2A6_Vehicle vehicle) {
		vehicle.destroy();
	}
	
}



