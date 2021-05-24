package scanner;
import java.util.Scanner;

public class empDetailsScanner {
	public static void main (String[]args) {
		
	
		Scanner SC= new Scanner (System.in);
		System.out.println("Enter emp id:");
		int A = SC.nextInt();
		System.out.println("emp id is:"+ A);
		SC.nextLine();
	
		System.out.println("Enter emp name:");
		String Name = SC.next();
		System.out.println("emp name is :"+ Name);
	    SC.nextLine();
		System.out.println("Enter email :");
		String email = SC.nextLine();
		System.out.println("emp email id is :"+ email);
		
		System.out.println("Enter emp Phn num:");
		long PHNno = SC.nextLong();
	
		System.out.println("emp Phone number:"+ PHNno);
		

		
	}}

	


