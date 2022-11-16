package com.OopsTasks;
/*
 Task35 & Task35A are interlinked
 
 Take 3 variables
 empName
 empSalary
 empExperience
 
 provide encapsulation for this variable
 ask the user to provide the information for the 3 using getters and setters.
 if exp is 5 or more than 5 u need to increase the sal by 10% and print it
 
 u should not write any kind of logic in class b
 class b must be used to ask the user and print the data.
 */
public class Task35 {
	private String empName;
	private int empSalary;
	private int empExperience;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(int empExperience) {
		this.empExperience = empExperience;
	}
	public int getEmpSalary() {
		 int incrSal = 0;
	        if(empExperience>=5)
	        {
	            int temp=empSalary*10/100;
	            incrSal=empSalary+temp;
	            return incrSal;
	        }
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary =empSalary ;
	}
	
	
	

}
