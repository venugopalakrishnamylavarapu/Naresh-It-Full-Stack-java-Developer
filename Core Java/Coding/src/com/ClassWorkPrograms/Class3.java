package com.ClassWorkPrograms;
/*### equals() method
 * ==================
 * 1)return type is boolean
 * 2)checks whether both the object are present in the same address 
 * location or not
 * 3)returns true if they are present 
 * (or) returns false if they are not*/
/*
 * getClass() method
 * =================
 * it provides the fully qualified class name
 * 
 * toString() method
 * =================
 * it converts java class object into a string object
 * returns getclass().getName()+@+hexadecimal integer 
 * 
 * internal implementation
 * =======================
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    finalize method
    ================
    check the Class3A(sub class in 3rd class)
  */


public class Class3 {
	public static void main(String[] args) {
		Class3 obj1=new Class3();
		Class3 obj2=new Class3();
		System.out.println(obj1.equals(obj2));//false
		System.out.println(obj1.equals(obj1));//true
		System.out.println(obj1.equals(new Class3()));//false
		System.out.println(new Class3().equals(new Class3()));//false
		System.out.println(obj1.equals(new Class3()));//false
		System.out.println(obj2.equals(obj2));//true
		
		System.out.println("------------------------------------");
		
		System.out.println("getClass() :- " +obj1.getClass());
		System.out.println("getClass() :- " +obj2.getClass());
		
		System.out.println("------------------------------------");
		
		System.out.println("toString():- "+obj1.toString());
		System.out.println("toString():- "+obj2.toString());		
	}

}
