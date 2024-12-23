package Array;

import java.util.Scanner;

public class Decending_Array {
	public void accept (int[]a) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value");
			a[i]=s.nextInt();
		}
	}
	void display(int[]b) {
		for(int i=0;i<b.length; i++) {
			System.out.print(b[i]+"");
		}
	}
	public void sort(int[] a) {
		for (int k = 0; k < a.length; k++) {
			for (int h = k + 1; h < a.length; h++) {
				if (a[k] < a[h]) {
					int t = a[k];
					a[k] = a[h];
					a[h] = t;
				}
			}
		}
	}
	public void biggest(int[]a) {
		System.out.println("biggest no in array is "+a[0]);
		System.out.println("2nd biggest no in array "+a[1]);
		System.out.println("smallest no in array "+a[3]);
		System.out.println("2nd smallest no in array "+a[4]);
	}
}
