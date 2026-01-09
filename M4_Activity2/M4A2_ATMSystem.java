package M4_Activities;

public class M4A2_ATMSystem {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=== ATM Withdrawal System ===");
		 
        System.out.println("\n--- Test 1: Valid Withdrawal ---");

        processWithdrawal("1", "5000");
 
        System.out.println("\n--- Test 2: Invalid Account Index ---");

        processWithdrawal("abc", "5000");
 
        System.out.println("\n--- Test 3: Account Not Found ---");

        processWithdrawal("10", "5000");
 
        System.out.println("\n--- Test 4: Insufficient Funds ---");

        processWithdrawal("1", "20000");
 
        System.out.println("\n=== All tests completed! ===");
 
	}
	
	 static double[] accounts = {10000, 15000, 20000};
	
	public static void processWithdrawal(String accountIndex, String amountInput) {
     
      try {
    	  System.out.println("Accounts = " + accountIndex + ", ");
    	  System.out.println("Amount = " + amountInput + ", ");
    	  double balance = accounts[Integer.parseInt(accountIndex)];
    	  System.out.println("Current Balance : " + balance);
    	  double amount = Double.parseDouble(amountInput);
    	  System.out.println("Withdrawal : " + amount);
    	  
    	  if (amount > balance) {
    		  System.out.println("Insufficient Funds! Cannot Withdraw : " + amount);
    	  } else {
    		  double newbalance = balance - amount;
    		  System.out.println("New Balance : " + newbalance);
    		  System.out.println("Withdrawal Successful! ");
    	  }
    	  
    	  
      } catch (NumberFormatException e) {
          System.out.println("Error: Invalid input!");
          System.out.println("Please enter valid numbers.");

      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Error: Account not found!");
          System.out.println("Invalid account index.");

      } catch (Exception e) {
          System.out.println("Transaction failed!");
      }
	}
	

}
