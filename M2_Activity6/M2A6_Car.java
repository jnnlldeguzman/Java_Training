package M2_Activities;

public class M2A6_Car extends M2A6_Vehicle implements M2A6_Refuels {
	public M2A6_Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}


public M2A6_Car() {
	
}


@Override
public void startEngine() {
	System.out.println();
	System.out.println(getBrand() + " Car Engine Started");
}

@Override
public void refuel() {
	System.out.println("Your " + getBrand() + " Car now is refueled..");
}
}
