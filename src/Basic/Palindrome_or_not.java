package Basic;

import java.util.Scanner;

public class Palindrome_or_not {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		int y;
		int x;
		int rev=0;
		System.out.println("enter no.=");
		a=s.nextInt();
		x=a;
		while(a>0) {
			y=a%10;
			rev=(rev*10)+y;
			a=a/10;
		}
		if(x==rev) {
			System.out.println("the no is palindrome ");
		}
		else {
			
		System.out.println("the no is not palindrome ");
	}
	}
}
