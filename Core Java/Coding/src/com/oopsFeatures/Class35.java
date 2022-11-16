package com.oopsFeatures;
/*
 From this point both programs having the same class name like that both are important to understand the concept
 
 OOPS FEATURES
 ===============
 There are 4 types of oops concepts
 (Remember it in the same order)
 1)Encapsulation
 2)Inheritance
 3)Polymorphism
 4)Abstraction
 
 Today we discuss about Encapsulation.
 
 
 Textbook definition
 ===================
"it is a process of wrapping up of data or binding up of data in to a single unit."
 
 Programmers definition(important)<---remember this
 ======================
"it is a process of making fields as private and providing access to those fields with the help 
of public methods i.e,through setters & getters methods"
 
 
 Class35 & Class35A are interlinked
 */
public class Class35 {
	private String studentName;
	 private int studentRollNumber;
	 private String studentDept;
	
	 public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Step-1");
		this.studentName = studentName;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		System.out.println("Step-2");
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		System.out.println("Step-3");
		this.studentDept = studentDept;
	}
	//alt+shift+s ==> Generate getters & setters
	 
}
