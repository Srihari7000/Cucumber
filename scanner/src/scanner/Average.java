package scanner;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner R = new Scanner (System.in);
		 System.out.println("Enter student Id");
		 
		int a = R.nextInt();
		System.out.println("you have enter:" + a);
		 
		R.nextLine();
		System.out.println("Enter student name");
		String N = R.nextLine();
		
		System.out.println("enter marks m1 to m5");
		int m1= R.nextInt();
		int m2 = R.nextInt();
		int m3 = R.nextInt();
		int m4 = R.nextInt();
		int m5 = R.nextInt();
		
		System.out.println("sum of marks ="+(m1+m2+m3+m4+m5));
		System.out.println("average of marks ="+ (m1+m2+m3+m4+m5)/5);
}

}
