package Array;

import java.util.Scanner;

public class Array {
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
}
