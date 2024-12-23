package String;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		int length=s1.length();
	    System.out.println("length ="+length);
		int k=length-1;
		String s2="";
		char ch;
		while(k>=0) {
			ch=s1.charAt(k);
			s2=s2+ch;
		    k--; 
		}
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("the string is palindrome");
		}else {
			System.out.println("the string is not palindrome");
		}
	}
}
