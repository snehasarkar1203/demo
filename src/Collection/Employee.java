package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
	private String name;
	private int salary;
	
	private static List employee_list=new ArrayList();
	
	public Employee() {
		
	}
	public Employee(String name,int salary) {
		this.setSalary(salary);
		this.setName(name);
		employee_list.add(this);
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void printEmployee() {
		Iterator itr=employee_list.iterator();
		while(itr.hasNext()) {
			Object o=itr.next();
			Employee e=(Employee) (Employee)(o);
			System.out.println("name="+e.getName());
			System.out.println("salary="+e.getSalary());
		}
	}
}
