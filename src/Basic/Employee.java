package Basic;

import java.util.Scanner;

public class Employee {
	
	public static void main(String[] args) {
		
		String name;
		double salary;
		Scanner s=new Scanner(System.in);
		
		System.out.println("entername");
		name=s.next();
		System.out.println("enter salary");
		salary=s.nextDouble();
		System.out.println("name="+name);
		System.out.println("salary="+salary);
	}

}
