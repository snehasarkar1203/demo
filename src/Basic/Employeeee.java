package Basic;

public class Employeeee {
	//properties
	String name;
    double salary;
	
	//constructor
	Employeeee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	//getter for name
	 String getName() {
		return name;
	}
	//setter for name
	void setName(String name) {
		this.name=name;
	}
	//getter for salary
	 double getSalary() {
		return salary;
	}
	//setter for salary
    void setSalary(double salary) {
		this.salary=salary;
	}
	//method to calculate PF
       double calculatePF() {
		return salary*0.12;
	}
	//main method for testing
	public static void main(String[] args) {
		Employeeee emp=new Employeeee("sneha sarkar",50000);
		System.out.println("Employeeee name"+emp.getName());
		System.out.println("Employeeee salary"+emp.getSalary());
		System.out.println("Employeeee PF"+emp.calculatePF());
		
	}

}
