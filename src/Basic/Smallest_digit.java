package Basic;

import java.util.Scanner;

public class Smallest_digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=234;
		int d=9;
		System.out.println("enter the number");
		n=s.nextInt();
		while(n!=0) {
		int temp=n%10;
		if(temp<d) {
			d=temp;
		}
		n=n/10;	
	}
		System.out.println("smallest digit is "+ d);
	}
}
