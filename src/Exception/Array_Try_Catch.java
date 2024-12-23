package Exception;

import java.util.Scanner;

public class Array_Try_Catch {
	public void accept(int b[]) {
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < b.length; i++) {
			System.out.println("enter a value");
			b[i]=s.nextInt();
		}
	}
	public void display(int[]c) {
		try {
			for (int i = 0; i <= c.length; i++) {
				System.out.println(c[i]+"");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int b[]=new int[4];
		Array_Try_Catch bb=new Array_Try_Catch();
		bb.accept(b);
		bb.display(b);
	}
}
