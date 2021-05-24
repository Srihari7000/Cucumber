package org.emp;

public class Employee {
	
		 public void empName() {
		 
	 String epName="srihari";
		 System.out.println("empname =" +epName);
	 }
	 public void Dob () {
		 
		 String  Db = "5.10.1995";
		 System.out.println("Dob ="+ Db);
	 }
	  public void empPhone () {
		  String GG = "9094766357";
		  System.out.println("emp phone number is:"+ GG);
		
	}
	 public static void main(String[] args){
			Employee emp = new Employee();
			emp.empPhone();
		emp.empName();
			emp.Dob();
			
		}
}
	


 	

