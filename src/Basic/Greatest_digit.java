package Basic;

import java.util.Scanner;

public class Greatest_digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		int d=0;
		System.out.println("enter the number");
		n=s.nextInt();
		while(n>0) {
		int temp=n%10;
		if(temp>d) {
			d=temp;
		}
		n=n/10;	
	}
		System.out.println("greatest digit is "+ d);
	}

}
