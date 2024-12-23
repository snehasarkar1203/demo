package Project;

import java.util.Scanner;

public class Return_Sum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n;
		int sum=0;
		n=s.nextInt();
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}

}
