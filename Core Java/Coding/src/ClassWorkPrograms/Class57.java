package ClassWorkPrograms;
//todays class will be about how to pass userdefined objects into arraylist.
public class Class57
{
	String empName;
	int empId;
	String empDept;
	
	//alt+shift+s  ==> Shortcut to Generate constructor using fields...
	
	public Class57(String empName,int empId,String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	
	//alt+shift+s ==>Shortcut to Generate toString()...
	@Override
	public String toString() {
		return empName+" "+empId+" "+empDept;
	}
}
