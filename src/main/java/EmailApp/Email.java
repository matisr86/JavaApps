package EmailApp;

import java.util.Scanner;

public class Email {

	private String firstName ; 
	private String lastName ; 
	private String email ; 
	private String password ; 
	private String department ; 
	private int mailboxCapacity ; 
	private String alternativeEmail ; 
	private String companySuffix = "polkongres.pl" ; 
	private int length = 8 ; 
	
	Scanner sc = new Scanner (System.in) ; 
	
	public Email (String firstName, String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName ; 
		department = setDepartment();
		email = setEmail() ; 
		alternativeEmail = setAlternativeEmail() ; 
		password = generatePassword(length) ; 
		setMailboxCapacity() ; 
		
	}		
	
	private String setDepartment () {
		System.out.println("LIST OF DEPARTMENT: \n1 - SALE \n2 - DEVELOPMENT \n3 - ACCOUNTING \n0 - NONE \nChose one of them: ");
		int choice = sc.nextInt() ; 
		if ( choice == 1) return "sale" ;
		if ( choice == 2) return "development" ; 
		if ( choice == 3) return "accounting" ; 
		else return "" ; 
	}
	
	
	public int setMailboxCapacity () { 
		System.out.println("Set mailbox capacity"); 
		mailboxCapacity = sc.nextInt() ;
		return mailboxCapacity ; 
	}
	private String setEmail() {
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix ;
		return email; 
	}
	
	public String setAlternativeEmail () {
		System.out.println("Set alternative email addres: ");
		alternativeEmail = sc.next() ; 
		return alternativeEmail ; 
	}
	
	
	private String generatePassword(int length) {
		String choice = "abcdefghijklmnoprstuwxyzABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#$%^&*" ;
		char password [] = new char [length] ; 
		for (int i = 0 ; i < length ; i++) {
			int rand = (int)(Math.random() * choice.length()) ; 
			password [i] =  choice.charAt(rand) ; 
		}
		return new String (password) ; 
	}
	
	public void changePassword () {
		System.out.println("Confirm old password: ");
		 
		String oldPassword = sc.next() ; 
		if ( oldPassword.equals(password)) {
			
			System.out.println("Set new password: ");
			String newPassword1 = sc.next() ; 
			System.out.println("Confirm new password: ");
			String newPassword2 = sc.next() ; 
			if (newPassword1.equals(newPassword2) ) {
				password = newPassword1 ; 
				System.out.println("Password has beeb changed");
				
			}
			else {
				System.out.println("Password mismatch, please try again");
				
			}
		}
			
		else { System.out.println("Wrong passsword!");
			
		
		}
	}
	

	
	
	public void info () {
		System.out.println("FIRST NAME: " + firstName +
				"\nLAST NAME: " + lastName + 
				"\nDEPARTMENT: " + department + 
				"\nE-MAIL: " + email + 
				"\nALTERNATIVE EMAIL: " + alternativeEmail + 
				"\nPASSWORD: " + password + 
				"\n1MAILBOX CAPACITY: " + mailboxCapacity + " mb");
	}
}


