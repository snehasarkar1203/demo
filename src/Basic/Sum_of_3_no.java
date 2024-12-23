package Basic;

import java.util.Scanner;

public class Sum_of_3_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum =0;
		System.out.println("enter the first number");
		int num1=s.nextInt();
		System.out.println("enter the second number");
		int num2=s.nextInt();
		System.out.println("enter the third number");
		int num3=s.nextInt();
		
	sum=num1+num2+num3;
		System.out.println("the sum of "+num1+num2+num3 +"is "+sum);
	}

}
