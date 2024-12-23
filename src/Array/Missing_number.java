package Array;

import java.util.Scanner;

public class Missing_number {
	public void accept(int[] a) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value");
			a[i]=s.nextInt();
			}
	}

	public void display(int[] a) {
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]+"");	
}
}
	public int missingnumber(int a[]) {
		int sum=0,sum1=0,n=5,result=0;
		for (int i = 0; i < a.length; i++) {
			sum =sum+a[i];
		}
			sum1=n*(n+1)/2;
			result=sum1-sum;
			return result;
		}
}