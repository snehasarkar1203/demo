package Array;

import java.util.Scanner;

public class Integer_Odd {
	public void accept(int[] a) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value");
			a[i]=s.nextInt();
		}
	}
	public void display(int[] b) {
		for(int i=0;i<b.length; i++) {
			if(b[i]%2!=0) {
				System.out.print(b[i]+"");
}
		}
	}
}
