package M2_Activities;

public class M2A6_Truck extends M2A6_Vehicle implements M2A6_Refuels {
	public M2A6_Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}


public M2A6_Truck() {
	
}


@Override
public void startEngine() {
	System.out.println();
	System.out.println(getBrand() + " Truck Engine Started");
}

@Override
public void refuel() {
	System.out.println("Your " + getBrand() + " truck now refueled..");
}



}