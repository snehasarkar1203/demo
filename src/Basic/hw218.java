package Basic;

import java.util.Scanner;

public class hw218 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y;
		int n;
		int x;
		int rev=0;
		int product=1;
		System.out.println("enter number");
		y=s.nextInt();
		while(y>0) {
			n=y%10;
			rev=(rev*10)+n;
			y=y/10;
			if(rev%2==0) {
				int square=n*n;
				
				product=square*product;
				
			}
		}
		System.out.println(product);
	}

}