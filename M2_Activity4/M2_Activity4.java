package M2_Activities;

public class M2_Activity4 {

	public static void main(String[] args) {


		M2A4_Executable excel = new M2A4_MSExcel();
		M2A4_Executable word = new M2A4_MSWord();
		
		
		runProgram(excel);
		runProgram(word);
		
		stopProgram(excel);
		stopProgram(word);
		
				
	}

	
	private static void runProgram(M2A4_Executable executableProgram) {
		executableProgram.run();
	}
	
	
	private static void stopProgram(M2A4_Executable executableProgram) {
		executableProgram.stop();
	}	
	
}
