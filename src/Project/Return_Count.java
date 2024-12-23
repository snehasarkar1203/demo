package Project;

import java.util.Scanner;

public class Return_Count {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n;
		int count=0;
		n=s.nextInt();
		if(n==0) {
			count=0;
		}else {
			while(n!=0) {
				n=n/10;
				count++;
			}
		}
		System.out.println("number of digit= "+ count);
	}

}
