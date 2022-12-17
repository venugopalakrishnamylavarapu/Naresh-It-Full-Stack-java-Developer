package ClassWorkPrograms;
//Comaparator interface
public class Class64E {
	String empName;
	int empId;
	String empDept;
	
	public Class64E(String empName, int empId, String empDept) 
	{
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
	}
	public String getEmpName() 
	{
		return empName;
	}
	public int getEmpId() 
	{
		return empId;
	}
	public String getEmpDept() 
	{
		return empDept;
	}
	@Override
	public String toString() 
	{
		return empName + "  " + empId + "  " + empDept;
	}		
}
