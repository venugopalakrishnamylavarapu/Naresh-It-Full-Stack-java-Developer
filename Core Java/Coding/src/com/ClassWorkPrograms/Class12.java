package com.ClassWorkPrograms;
/*this class was mostly tasks so check the task package with task12
 * and also check ownmethods for home work*/

public class Class12 {
	String empName;
	int empId;
	static String empCompany="TCS";
	Class12(String name,int id)
	{
		empName=name;
		empId=id;
	}
	public static void main(String[] args) {
		Class12 obj1=new Class12("Venu",1);
		Class12 obj2=new Class12("Gopala",2);
		Class12 obj3=new Class12("Krishna",3);
		
		System.out.println(obj1.empName+" "+obj1.empId+" "+Class12.empCompany);
		System.out.println(obj2.empName+" "+obj2.empId+" "+Class12.empCompany);
		System.out.println(obj3.empName+" "+obj3.empId+" "+Class12.empCompany);
	}

}
