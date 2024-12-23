package String;

import java.util.Scanner;

public class Count_Vowels {
	public static void main(String[] args) {
		String s1=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		s1=s.nextLine();
		int k=0,count=0;
		char ch;
		while(k<s1.length()) {
			ch=s1.charAt(k);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
			}
			k++;
		}
		System.out.println(count);
	}
}
