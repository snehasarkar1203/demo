package Basic;

import java.util.Scanner;

public class Sum_of_digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int y;
	    int a;
		int sum=0;
		System.out.println("enter no.=");
		y=s.nextInt();
		while(y>0) {
			
			a=y%10;
			sum=a+sum;
			y=y/10;
			
			
		}
		System.out.println(sum);
		
		
	}

}
