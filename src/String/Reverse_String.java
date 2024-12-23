package String;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		System.out.println("original string ="+s1);
		int len=s1.length();
		System.out.println("length ="+len);
		int k=len-1;
		char ch;
		while(k>=0) {
			ch=s1.charAt(k);
			System.out.println(ch);
			k--;	
		}
	}
}
