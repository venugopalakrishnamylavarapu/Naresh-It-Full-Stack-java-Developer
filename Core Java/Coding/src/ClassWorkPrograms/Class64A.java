package ClassWorkPrograms;

public class Class64A implements Comparable<Class64A>
{
	String empName;
	int empId;
	String empDept;
	public Class64A(String empName,Integer empId,String empDept)
	{
		this.empName=empName;
		this.empId=empId;
		this.empDept=empDept;
	}
	@Override
	public String toString()
	{
		return empName+" "+empId+" "+empDept;
	}
	@Override
	public int compareTo(Class64A o)
	{
		return this.empId-o.empId;
	}
}
