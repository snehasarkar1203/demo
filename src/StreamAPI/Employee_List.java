package StreamAPI;

import java.util.ArrayList;

public class Employee_List implements Comparable<Employee_List> {
private String name;
private String post;
private double Salary;
private static ArrayList<Employee_List>Employee_List=new ArrayList<Employee_List>();
  
public Employee_List() {
	// TODO Auto-generated constructor stub
}
  public Employee_List(String name,String post,Double Salary) {
//	  this.setName(name);
//	  this.setPost(post);
//	  this.setSalary(getSalary());
	  this.name=name;
	  this.post=post;
	  this.Salary=Salary;
	  Employee_List.add(this);
	  
  }
  public void  display() {
	 // System.out.println(Employee_List);
  }
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}

@Override
public String toString() {
	return "Employee_List [name=" + name + ", post=" + post + ", Salary=" + Salary + "]";
}
@Override
public int compareTo(Employee_List s) {
	if(this.getSalary()>s.getSalary())
	return -1;
	else if(this.getSalary()<s.getSalary())
		return 1;
	else
		return 0;
}}
