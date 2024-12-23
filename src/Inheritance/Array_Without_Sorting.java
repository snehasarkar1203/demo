package Inheritance;

import java.util.Scanner;

public class Array_Without_Sorting {
	public void accept(int[]a) {
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter a value");
			a[i]=s.nextInt();			
		}
	}
	void display(int[]b) {
		for (int j = 0; j < b.length; j++) {	
		}
	}
	public void biggest(int[]a) {
		int temp=0;
		int temp1=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>temp) {
			temp=a[i];
		}
	}
		System.out.println("biggest number"+temp);
		for (int i = 0; i < a.length; i++) {
			if(temp>a[i]&& temp1<a[i]) {
				temp1=a[i];
			}
		}
		System.out.println("second biggest number"+temp1);	
		}
}
