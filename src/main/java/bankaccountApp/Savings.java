package bankaccountApp;

public class Savings extends Account implements IbaseRate{
	// list properties specific to Savings account 
	int safetyDepositBoxID ; 
	int safetyDepositBoxKey ; 
	
		// pconstructor to initialize Savings account properties
		public Savings(String name, String sSN , double initDeposit) {
		super(name , sSN , initDeposit) ; 
		AccountNumber = "1" + AccountNumber ; 


		//list any methods specific to Savings account
		
		}
}
