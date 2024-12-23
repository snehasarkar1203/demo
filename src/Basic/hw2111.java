package Basic;

import java.util.Scanner;

public class hw2111 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y;
		int n;
		int x;
		int rev=0;
		int sum=0;
		System.out.println("enter number");
		y=s.nextInt();
		while(y>0) {
			n=y%10;
			rev=(rev*10)+n;
			y=y/10;
			if(rev%2!=0) {
				int square=n*n;
						
				sum=square+sum;
				
			}
		}
		System.out.println(sum);
	}

}
