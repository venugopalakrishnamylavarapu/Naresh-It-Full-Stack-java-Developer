package ClassWorkPrograms;

import java.util.Comparator;

public class Class64G implements Comparator<Class64E>{
	@Override
	public int compare(Class64E o1, Class64E o2) 
	{
		//return o1.getEmpId()-o2.getEmpId(); // sorting basing on empID
		//return o1.getEmpName().compareTo(o2.getEmpName());// sorting basing on empName
		return o1.getEmpDept().compareTo(o2.getEmpDept());
	}
}
