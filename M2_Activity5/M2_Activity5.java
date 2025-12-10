package M2_Activities;

public class M2_Activity5 {

	public static void main(String[] args) {


		M2A5_Program excel = new M2A5_MSExcel("MS Excel");
		M2A5_Program word = new M2A5_MSWord("MS Word");
		
		
		runProgram(excel);
		runProgram(word);
		
		checkProgramStatus(excel);
		checkProgramStatus(word);
		
		stopProgram(excel);
		stopProgram(word);
		
		checkProgramStatus(excel);
		checkProgramStatus(word);
		
				
	}
	
	private static void runProgram(M2A5_Program executableProgram) {
		executableProgram.run();
	}
	
	
	private static void stopProgram(M2A5_Program executableProgram) {
		executableProgram.stop();
	}	
	
	
	private static void checkProgramStatus(M2A5_Program executableProgram) {
		
		if(executableProgram.getIsRunning() ) {
			System.out.println("Program" + executableProgram.getName() + "is running. ");
		} else {
			System.out.println("Program" + executableProgram.getName() + "is stopped. ");
		}
		
		
	}
	
	
	
	
}
