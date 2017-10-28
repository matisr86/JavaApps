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
	private int defaultPasswordLength ; 
	private int length = 8 ; 
	
	Scanner sc = new Scanner (System.in) ; 
	
	public Email (String firstName, String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName ; 
		department = setDepartment();
		email = setEmail() ; 
		alternativeEmail = setAlternativeEmail() ; 
		password = generatePassword(length) ; 
		
	}		
	
	private String setDepartment () {
		System.out.println("LIST OF DEPARTMENT: \n1 - SALE \n2 - DEVELOPMENT \n3 - ACCOUNTING \n0 - NONE \nChose one of them: ");
		int choice = sc.nextInt() ; 
		if ( choice == 1) return "sale" ;
		if ( choice == 2) return "development" ; 
		if ( choice == 3) return "accounting" ; 
		else return "" ; 
	}
	
	private String setEmail() {
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix ;
		return email; 
	}
	
	private String setAlternativeEmail () {
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
	public void info () {
		System.out.println("FIRST NAME: " + firstName +
				"\nLAST NAME: " + lastName + 
				"\nDEPARTMENT: " + department + 
				"\nE-MAIL: " + email + 
				"\nALTERNATIVE EMAIL: " + alternativeEmail + 
				"\nPASSWORD: " + password);
	}
}


