package Collection;

public class Employee_Manager implements Comparable<Employee_Manager>{
 private String name;
 private double salary;
 
 public Employee_Manager(String name,double salary) {
	 this.name=name;
	 this.salary=salary;
 }

@Override
public String toString() {
	return "Employee_Manager [name=" + name + ", salary=" + salary + "]";
}

@Override
public int compareTo(Employee_Manager o) {
	return Double.compare(this.salary,o.salary);
}
 
}
