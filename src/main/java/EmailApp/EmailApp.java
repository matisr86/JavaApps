package EmailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		String firstName , lastName ; 
		Scanner sc = new Scanner (System.in) ; 
		
		System.out.println("Set first name: ");
		 firstName = sc.nextLine() ; 
		 System.out.println("Set last name: ");
		 lastName = sc.nextLine() ; 
		 
		 Email em1 = new Email (firstName, lastName) ; 
		 em1.info();
		 
	}

}
