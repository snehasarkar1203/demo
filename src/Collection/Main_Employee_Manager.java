package Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class Main_Employee_Manager {
  public static void main(String[] args) {
	TreeSet<Employee_Manager>employee=new TreeSet<>();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of employee to add:");
	int numberofemployee=s.nextInt();
	s.nextLine();
	
	for (int i = 1; i <= numberofemployee; i++) {
		System.out.println("enter name of employee"+(i)+":");
		String name=s.next();
		System.out.println("enter salary of employee"+(i)+":");
		double salary=s.nextDouble();
		Employee_Manager employees=new Employee_Manager(name, salary);
		employee.add(employees);	
	}
	System.out.println("\nEmployees in treeset(sorted by salary):");
       for(Employee_Manager employees:employee)		{
    	   System.out.println(employees);
	}
}
}
