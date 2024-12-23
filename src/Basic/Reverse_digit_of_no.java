package Basic;

import java.util.Scanner;

public class Reverse_digit_of_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		int y;
		int rev=0;
		System.out.println("enter no.=");
		a=s.nextInt();
		while(a>0) {
			y=a%10;
			a=a/10;
			rev=(rev*10)+y;

			
		}
		System.out.println(rev);
			}

}
