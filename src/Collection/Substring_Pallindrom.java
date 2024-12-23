package Collection;

import java.util.Scanner;

public class Substring_Pallindrom {
	
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b;
		System.out.println("enter the String");
		b=s.next();
		for (int i = 0; i < b.length(); i++) {
			for (int j = i+1; j <= b.length(); j++) {
				String m= b.substring(i,j);
				if(pallindrome(m)) {
					System.out.println(m);
				}
			}
	}
		}
 private static boolean pallindrome(String m) {
	int length = 0;
	int k=length-1;
	String s2="";
	char ch;
	String b = null;
	while(k>=0) {
		ch=m.charAt(k);
		s2=s2+ch;
	    k--; 
	}
	System.out.println(s2);
	if(m.equals(s2)) {
		System.out.println("the string is palindrome");
	}else {
		System.out.println("the string is not palindrome");
	}
		return false;
		 
	 }
			
		}
