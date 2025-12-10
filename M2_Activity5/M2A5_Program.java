package M2_Activities;

public abstract class M2A5_Program {

	private String name;
	private boolean isRunning = false;
	
	public M2A5_Program() {
		
	}
	
	public M2A5_Program(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	
	public boolean getIsRunning() {
		return isRunning;
	}
	
	protected void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	
	
}
