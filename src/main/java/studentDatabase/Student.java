package studentDatabase;

import java.util.Scanner;

public class Student {
	
	private String firstName ; 
	private String lastName ; 
	private int gradeYear ; 
	private String studentID ; 
	private String courses = "";
	private int tuitionBallance = 0 ; 
	private int costOfCourse = 600 ; 
	private static int ID1 = 1000 ; 
	private static int ID2 = 1000 ; 
	private static int ID3 = 1000 ; 
	private static int ID4 = 1000 ; 
 
	// Constructor : prompt user to enter sstudent's name and password 
	public Student () {
		Scanner sc = new Scanner (System.in) ;
		System.out.print("Enter student first name: "); 
		this.firstName = sc.nextLine() ;
		System.out.print("Enter student last name: "); 
		this.lastName = sc.nextLine() ;
		System.out.print("1 - Freshmen \n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter a student class level:  "); 
		this.gradeYear = sc.nextInt() ;
		setStudentId();
		
		
		
		
	}
	
	// generate an ID
	private void setStudentId() {
		if (gradeYear == 1) {ID1 ++ ; studentID = gradeYear + "" + ID1 ; }
		else 	if (gradeYear == 2) {ID2 ++ ; studentID = gradeYear + "" + ID2 ; }
		else 	if (gradeYear == 3) {ID3 ++ ; studentID = gradeYear + "" + ID3 ; }
		else 	if (gradeYear == 4) {ID4 ++ ; studentID = gradeYear + "" + ID4 ; }
		
	}
	
	// Enroll in curses
	public void enroll () {
		do {
			System.out.print("Enter course to enroll ( q to quit)");
			Scanner in = new Scanner (System.in)  ;
			String course = in.nextLine(); 
			if (!course.equals("q")) {
				courses += course +", " ; 
				tuitionBallance += 600 ; 
			}
			else break; 
		}while ( 1 != 0 ) ;
		

		
	}
	
	public void viewBallance() {
		System.out.println("Your ballance is: " + tuitionBallance + " zl");
	}
	
	public void payTuition () {
		viewBallance();
		Scanner in = new Scanner(System.in) ; 
		System.out.print("How many would you like to pay? ");
		int payment = in.nextInt() ; 
		tuitionBallance -=payment ; 
		System.out.println("Thank you for your payment of " + payment + " zl" );
		viewBallance();
		
	}
	
	public String showInfo () {
		 return "Name: " + firstName + " " + lastName + 
				 "\nGrade level: " + gradeYear + 
				 "\nStudent ID: "  + studentID+ 
				 "\nCourses Enrolled: " + courses + 
				 "\nTuition Ballance: " + tuitionBallance + " zl"; 
	}
}

