package Basic;

import java.util.Scanner;

public class Average_of_3_no {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=s.nextInt();
		System.out.println("enter the second number");
		int num2=s.nextInt();
		System.out.println("enter the third number");
		int num3=s.nextInt();
		
		double average=num1+num2+num3/3.0;
		System.out.println("the average of "+num1+num2+num3 +"is "+average);
		
	}

}
