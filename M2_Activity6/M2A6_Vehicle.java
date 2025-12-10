package M2_Activities;

public abstract class M2A6_Vehicle {
	private int numberOfWheels;
	private String brand;
	
	public M2A6_Vehicle() {
		
	}
	
	public M2A6_Vehicle (int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}
	
	//abstract
	abstract void startEngine();
	
	//concrete
	public void destroy() {
		System.out.println();
		System.out.println(this.numberOfWheels > 4 ? brand + " truck destroyed" : brand + " car destroyed");
		
	}
	
	
	//getters and setters
	public void setNumberOfWheels (int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumberOfWheels() {
		return this.numberOfWheels;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	

}
