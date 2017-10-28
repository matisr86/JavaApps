package bankaccountApp;

public class BankAccountApp {
	public static void main(String[] args) {
		// read a CSV file than create new accounts based on that data
		
		Checking chacc1= new Checking("Mateusz Rostalski" , "159684759" , 8000) ; 
		Savings savacc1 = new Savings ("Sebastian Stroz", "598654789" , 7500) ;
		
		chacc1.showInfo();
		savacc1.showInfo();
	}
}
