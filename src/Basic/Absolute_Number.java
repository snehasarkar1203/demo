package Basic;

import java.util.Scanner;

public class Absolute_Number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first number");
	int num1=s.nextInt();
	
	System.out.println("enter the second number");
	int num2=s.nextInt();
	
	int difference=(num1-num2);
	System.out.println("the absolute difference between"+num1+"and"+num2+"is"+difference);
}
}
