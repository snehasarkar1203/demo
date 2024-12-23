package Array;

import java.util.Scanner;

public class Pairs_Sum_Array {
	public static void accept(int[]a) {
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the value");
			a[i]=s.nextInt();
		}
	}
	static void display(int[]b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(" ");
		}
	}
	static void sortarray(int[]c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i; j < c.length; j++) {
				if(c[i]+c[j]==5) {
				System.out.println(c[i]+" "+c[j]);
			}
		}	
		}
	}
}