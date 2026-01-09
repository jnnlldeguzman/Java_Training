package M4_Activities;

public class M4A4_AccountValidator {
	// TODO Auto-generated method stub
	public static void main (String[] args) {
		
		runDisplay("1234567890");
		runDisplay("123");
		runDisplay(null);
	}
	

	public static void validateAccountNumber(String accountNumber) throws Exception {
		
		if (accountNumber == null) {
			throw new NullPointerException("Cannot be null");
		} else if (accountNumber.length() != 10) {
			throw new Exception("Must be 10 digits");
		}else {
			System.out.println("Valid Account: " + accountNumber);
		}
	}
		
	public static void runDisplay(String accountNumber) {
		try {
			validateAccountNumber(accountNumber);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	
	}
	

}
