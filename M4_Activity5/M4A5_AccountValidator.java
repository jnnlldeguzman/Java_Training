package M4_Activities;

class InvalidAccountNumberException extends Exception{
	public InvalidAccountNumberException (String message) {
		super (message);
	}
}

class InvalidAccountFormatException extends RuntimeException{
	public InvalidAccountFormatException (String message) {
		super (message);
	}

}


public class M4A5_AccountValidator {

	public static void validateAccountNumber(String accountNumber) 
	
	
	throws InvalidAccountNumberException{
		
        if (accountNumber == null) {
            throw new NullPointerException("Account number cannot be null");
        }
 
        // Check digits only
        for (char c : accountNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidAccountFormatException("Account number must contain only digits");
            }
        }
 
        // Check length
        if (accountNumber.length() != 10) {
            throw new InvalidAccountNumberException(
                    "Account number must be exactly 10 digits");
        }
 
        // Valid
        System.out.println("Valid account number: " + accountNumber);
    }
		// TODO Auto-generated method stub

	

	
	public static void testValidation(String testName, String accountNumber) {
        System.out.println(testName);
 
        try {
            validateAccountNumber(accountNumber);
 
        } catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
 
        } catch (InvalidAccountFormatException e) {
            System.out.println("Error: " + e.getMessage());
 
        } catch (NullPointerException e) {
            System.out.println("Warning: " + e.getMessage());
        }
 
        System.out.println();
    }
 
    // Step 5: main method
    public static void main(String[] args) {
 
        System.out.println("=== Account Number Validation Test ===\n");
 
        testValidation("Test 1: Valid account (1234567890)", "1234567890");
        testValidation("Test 2: Too short (123)", "123");
        testValidation("Test 3: Contains letters (12345ABC90)", "12345ABC90");
        testValidation("Test 4: Contains space (1234 567890)", "1234 567890");
        testValidation("Test 5: Null value", null);
    }
	
}
