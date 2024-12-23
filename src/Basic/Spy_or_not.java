package Basic;

import java.util.Scanner;

public class Spy_or_not {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a;
		int y;
		int sum=0;
		int product=1;
		System.out.println("enter number=");
		a=s.nextInt();
		while(a>0) {
			y=a%10;
			sum=y+sum;
			product=y*product;
			a=a/10;
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum==product) {
			System.out.println("the no. is spy");
		}
		else {
			System.out.println("the no. is not spy");
		}
	}


}
