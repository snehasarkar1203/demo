package Basic;

import java.util.Scanner;

public class Product_of_digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		int y;
		int product=1;
		System.out.println("enter no.=");
		a=s.nextInt();
		while(a>0) {
			y=a%10;
			product=y*product;
			a=a/10;
			}
		System.out.println(product);
		}

}
