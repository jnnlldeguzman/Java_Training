package M4_Activities;

public class M4A1_BankAccount {

	public static String getAccountName(String accountNumber) {
		// TODO Auto-generated method stub

		
		
		if (accountNumber == "ACC-001") {
			return "Juan Dela Cruz";
		} else if (accountNumber == "ACC-002") {
			return "Maria Santos";
		}else {
			return null;
		}
		
		
	
	}
	
	
	public static void displayAccount(String accountNumber) {
		System.out.println("Looking up Account: " + accountNumber);
		try {
			String names = getAccountName(accountNumber);
			String upperName = names.toUpperCase();
			System.out.println("Account Holder: " + upperName + "\n");
		} catch (NullPointerException e) {
			System.out.println("Error: Account not found! \n");
		}
		
	}
	
	
}
