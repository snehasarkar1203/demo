package String;

import java.util.Scanner;

public class Vowles_String {
	public static void main(String[] args) {
		String s1=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		s1=s.nextLine();
		//System.out.println("String");
		int k=0;
		char ch;
		while(k<s1.length()) {
			ch=s1.charAt(k);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				System.out.println(ch);
			}
			k++;
		}	
	}
}
