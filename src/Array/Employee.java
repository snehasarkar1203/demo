package Array;

import java.util.Scanner;

public class Employee {
	private String name;
	private double salary;
	public Employee(String n,double s) {
		name=n;
		salary=s;
	}
	public Employee(){
	}
void accept(Employee e[]){
    Scanner s=new Scanner(System.in);
	for (int i = 0; i < e.length; i++) {
		System.out.println("enter name");
		name=s.next();
	    System.out.println("enter salary");
	    salary=s.nextDouble();
	    e[i]=new Employee(name,salary);
	}
}
void sortEmployee(Employee e[]) {
	for (int i = 0; i < e.length; i++) {
		for (int j = 0; j < e.length; j++) {
			if(e[j].salary>e[j+1].salary) {
				Employee temp=e[j];
				e[j]=e[j+1];
				e[j+1]=temp;
			}
		}
	}
}
void display(Employee[]e) {
	for (int i = 0; i < e.length; i++) {
		System.out.println("name="+e[i].name);
		System.out.println("salary="+e[i].salary);
	}
}
}