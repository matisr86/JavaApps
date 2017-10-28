package bankaccountApp;

public abstract class Account {

	String name ;
	String sSN ; 
	double ballance ; 
	static int index = 10000 ; 
	
	String AccountNumber ; 
	double rate; 
	// list common properties for Savings and Checking accounts
	
	// Constructor to set base properties and initialize the account
	public Account (String name, String sSN , double initDeposit) {
		this.name = name ; 
		this.sSN = sSN ;
		ballance = initDeposit ; 
		index++ ; 
		
		this.AccountNumber = setAccountNumber() ; 

	}
	
	//set account number
	private String setAccountNumber () {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length()) ;
		int uniqueID = index ; 
		int randNumber =(int) (Math.random() * Math.pow(10, 3)) ; 
		return lastTwoOfSSN + uniqueID + randNumber ; 
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name + 
				"\nACCOUNT NUMBER: " + AccountNumber + 
				"\nBALLANCE: " + ballance);
		
	}
	
	// List common methods
}
