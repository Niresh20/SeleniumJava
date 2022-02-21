package org.system;

public class Student extends Department{
  
	public void studentName() {
	  System.out.println("Niresh Kumar");
  }
    public void studentDepartment() {
    	System.out.println("ECS");
    }
    public void studentID() {
    	System.out.println("47");
    	
    }
    
    public static void main(String[] args) {
		Student studentInfo = new Student();
	
		studentInfo.collegeName();
		studentInfo.collegeCode();
		studentInfo.collegeRank();
		studentInfo.studentName();
		studentInfo.studentDepartment();
		studentInfo.studentID();
		studentInfo.departmentName();
	}
    
    
    
}
