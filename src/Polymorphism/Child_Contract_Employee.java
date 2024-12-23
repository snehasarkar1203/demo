package Polymorphism;

public class Child_Contract_Employee extends Parent_Employee{
	private double hourlyrate;
	private double hoursworked;
	private double salary;
	
	public Child_Contract_Employee(double hourlyrate, double hoursworked) {
		super();
		this.hourlyrate = hourlyrate;
		this.hoursworked = hoursworked;
	}
	double calculatesalary() {
		System.out.println("the salary of contract employee is"+salary);
		return salary;
	}
}
