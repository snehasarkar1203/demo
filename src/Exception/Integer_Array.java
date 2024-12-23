package Exception;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class Integer_Array {
	public void accept (int[]a) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value");
			a[i]=s.nextInt();
		}	
	}
	void display(int[]b) {
		try {
		for(int i=0;i<=b.length; i++) {
			System.out.print(b[i]+"");
		}
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int b[]=new int[4];
		Integer_Array i=new Integer_Array();
		i.accept(b);
		i.display(b);
	}
}
