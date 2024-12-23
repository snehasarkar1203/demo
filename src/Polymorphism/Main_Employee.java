package Polymorphism;

import java.util.Scanner;

public class Main_Employee {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Parent_Employee p=new Parent_Employee();
		p.calculatesalary();
		System.out.println("enter permanent employee salary");
		double basicpay=s.nextDouble();
		double hra=s.nextDouble();
		double bonus=s.nextDouble();
		
	}

}
