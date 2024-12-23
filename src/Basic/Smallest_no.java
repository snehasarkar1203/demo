package Basic;

import java.util.Scanner;

public class Smallest_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=s.nextInt();
		System.out.println("enter the second number");
		int num2=s.nextInt();
		System.out.println("enter the third number");
		int num3=s.nextInt();
		
		int smallest;
		if(num1<=num2 && num1<=num3) {
			smallest=num1;	
		}
		else if(num2<=num1 && num2<=num3) {
			smallest=num2;	
		}else {
			smallest=num3;
		}
		System.out.println("the smallest number is "+  smallest );
	}

}
