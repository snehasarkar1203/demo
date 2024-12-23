package Basic;

import java.util.Scanner;

public class Primitive_data {
	public static void main(String[] args) {
		
		int roll_no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll_no");
		roll_no=sc.nextInt();
		System.out.println("roll_no="+roll_no);
		
		
		double salary;
		Scanner b=new Scanner(System.in);
		System.out.println("enter salary");
		salary=sc.nextDouble();
		System.out.println("salary="+salary);
		
		
		String name;
		Scanner c=new Scanner (System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("name="+name);
		
		long s1;
		Scanner d=new Scanner (System.in);
		System.out.println("enter s1 ");
		s1=sc.nextLong();
		System.out.println("s1="+s1);
		
		short s2;
		Scanner f=new Scanner (System.in);
		System.out.println("enter s2");
		s2=sc.nextShort();
		System.out.println("s2="+s2);
		
		
		float time;
		Scanner g=new Scanner (System.in);
		System.out.println("enter time");
		time=sc.nextFloat();
		System.out.println("time="+time);
		
		byte x=10;
		Scanner h=new Scanner (System.in);
		System.out.println("x");
		x=sc.nextByte();
		System.out.println("x="+x);
		
		
		boolean red;
		Scanner i=new Scanner (System.in);
		System.out.println("This is red");
		red=sc.nextBoolean();
		System.out.println("red="+red);
		
		
	}

}
