package M2_Activities;

public class M2A5_MSExcel extends M2A5_Program {
	
	public M2A5_MSExcel(String name) {
		this.setName(name);
	}
	public M2A5_MSExcel() {
		
	}
	
	@Override
	
	public void run() {
		String message = "Opening MS Excel...";
		this.setIsRunning(true);
		
		System.out.println(message);
	}

	
	public void stop() {
		String message = "Stopping MS Excel...";
		this.setIsRunning(false);
		
		System.out.println(message);
	}
	

	
}
