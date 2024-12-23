package Array;

import java.util.Scanner;
public class DoubleEX {
	
	public void accept(DoubleEX[] a) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value");
		}
	}

	public void display(DoubleEX[] b) {
		for(int i=0;i<b.length; i++) {
			System.out.print(b[i]+"");
		}
	}
}
