package Array;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	int a[]=new int[3];
	Reverse.accept(a);
	Reverse.reverse(a);
}
static void accept(int[]a) {
	Scanner s=new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter number in array");
		a[i]=s.nextInt();
	}
}
static void reverse(int[]a) {
	for (int i = a.length-1; i >= 0; i--) {
		System.out.println(a[i]);
		
	}	
}
}
