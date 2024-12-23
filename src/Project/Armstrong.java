package Project;

import java.util.Scanner;

public class Armstrong {
	int n;
	int temp;
	int count=0;
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		temp=n;
	}
	void power() {
		while(n>0) {
			count++;
			n=n/10;
		}
	}
	void checkarms() {
		n=temp;
		System.out.println(count);
		System.out.println(n);
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+calculate(count,d);
			n=n/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
	}
		
		private int calculate(int p,int b) {
			int pro=1;
			for (int i = 1; i <=p; i++) {
				pro=pro*b;
			}
			return pro;
	}

}
