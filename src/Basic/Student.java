package Basic;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		String name;
		Integer roll_no;
		char section;
		String school_name;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter roll_no");
		roll_no=s.nextInt();
		System.out.println("enter section");
		section=s.next().charAt(0);
	    System.out.println("enter school_name");
		school_name=s.next();
		
		System.out.println("name="+name);
		System.out.println("roll_no="+roll_no);
		System.out.println("section="+section);
		System.out.println("school_name="+school_name);
		
		
		
		
		
		
	}
  
}
