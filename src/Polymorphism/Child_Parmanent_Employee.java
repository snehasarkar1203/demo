package Polymorphism;

public class Child_Parmanent_Employee extends Parent_Employee {
	private double basicpay;
	private double hra;
	private double bonus;
	private double salary;
	
	public Child_Parmanent_Employee(double basicpay, double hra, double bonus) {
		super();
		this.basicpay = basicpay;
		this.hra = hra;
		this.bonus = bonus;
	}
	double calculatesalary() {
		System.out.println("the salary of permanent employee is"+salary);
		return salary;
	}
}
