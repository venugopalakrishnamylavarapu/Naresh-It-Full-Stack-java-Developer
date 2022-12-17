package ClassWorkPrograms;
//Comparable Interface
public class Class64C implements Comparable<Class64C> {
	String empName;
	int empId;
	String empDept;
	
	public Class64C(String empName, int empId, String empDept) 
	{
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
	}

	@Override
	public String toString() 
	{
		return empName + "  " + empId + "  " + empDept;
	}

	@Override
	public int compareTo(Class64C o) 
	{
		//return this.empId-o.empId; // sorting basing on empId
		//return this.empName.compareTo(o.empName); // sorting basing on empName
		return this.empDept.compareTo(o.empDept); // sorting basing on empDept
	}	
}
