package TasksInClass;

import java.util.ArrayList;
import java.util.List;

/*
 Task:
 ----
 Let us consider we have a list of employees,where each employee has
 attributes like age,name and salary WAP to increase the salary of each employee
 whose age is greater than 25 by 10% and print the update employee details in the ascending order.[Use Stream API]
 
 */
public class Task67 {
	public static void main(String[] args) {
		List<Task67A> li=new ArrayList<Task67A>();
		li.add(new Task67A("Venu",25,35000));
		li.add(new Task67A("Suresh",24,17000));
		li.add(new Task67A("Ramesh",27,47000));
		li.add(new Task67A("Suresh",22,23375));
		
		
		
	}
}
