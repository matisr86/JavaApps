package bankaccountApp;

public class Checking extends Account{
	// list properties specific to Chcecking account 
	int debitCardNumber ; 
	int debitCardPin ; 
	
	// constructor to initialize checking account properties
	public Checking (String name, String sSN , double initDeposit) {
		super(name , sSN , initDeposit) ; 
		AccountNumber = "2" + AccountNumber ; 

	}
	
	//list any methods specific to Checking account
	

}
