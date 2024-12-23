package Array;

import java.util.Scanner;

public class StringEx {
	public void accept(String[]a) {
	Scanner s=new Scanner(System.in);
	for(int i=0; i<a.length; i++) {
		System.out.println("enter a value");
		a[i]=s.next();
	}
	}
	void display(String[]b) {
	for(int i=0; i<b.length; i++) {
		System.out.println(b[i]+"");
	}
	}
}
	
