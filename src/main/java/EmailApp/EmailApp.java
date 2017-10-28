package EmailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		String firstName , lastName ; 
		int choice ;
		Scanner sc = new Scanner (System.in) ; 
		
		System.out.println("Set first name: ");
		 firstName = sc.nextLine() ; 
		 System.out.println("Set last name: ");
		 lastName = sc.nextLine() ; 
		 
		 Email em1 = new Email (firstName, lastName) ; 
		 
		 do {
		 System.out.println("\nMENU: \n1 - show info \n2 - change password \n3 - change mailbox capacity "
		 					+ "\n4 - change alternative email \n0 - exit");
		 
		 choice = sc.nextInt() ; 
		 if ( choice == 1) em1.info();
		 else if ( choice == 2 ) em1.changePassword(); 
		 else if ( choice == 3) em1.setMailboxCapacity() ; 
		 else if ( choice == 4) em1.setAlternativeEmail() ; 
		 else if (choice == 0) System.exit(0);
		 else System.out.println("Try again");
		 
		 }while ( choice != 0 ) ; 
		 
		 
	}

}
