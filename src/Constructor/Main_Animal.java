package Constructor;

import java.util.Scanner;

public class Main_Animal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String n=s.next();
		
		System.out.println("enter age");
		int a=s.nextInt();
		
		System.out.println("enter species");
		String q=s.next();
		
		System.out.println("enter weight");
		float w=s.nextFloat();
		
		System.out.println("isDomestic");
		boolean t=s.nextBoolean();
		
		Animal z=new Animal(n,a,q,w,t);
		z.display();
		
		Animal z1=new Animal(n,a,q,w,t);
		z1.display();
		
		Animal z2=new Animal(n,a,q,w,t);
		z2.display();
}
	
}
