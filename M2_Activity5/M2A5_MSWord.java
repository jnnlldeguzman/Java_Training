package M2_Activities;

public class M2A5_MSWord extends M2A5_Program {
	
	public M2A5_MSWord(String name) {
		this.setName(name);
	}
	public M2A5_MSWord() {
		
	}
	
	@Override
	
	public void run() {
		String message = "Opening MS Word...";
		this.setIsRunning(true);
		
		System.out.println(message);
	}

	
	public void stop() {
		String message = "Stopping MS Word...";
		this.setIsRunning(false);
		
		System.out.println(message);
	}
	
}
