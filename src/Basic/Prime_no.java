package Basic;

import java.util.Scanner;

public class Prime_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		 int a=s.nextInt();
		if(a%a==0 && a%2!=0) {
				System.out.println("the no is prime");
			}else {
			System.out.println("the no is not prime");
		}
	}
}
