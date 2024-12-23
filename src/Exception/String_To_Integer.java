package Exception;

import java.util.Scanner;

public class String_To_Integer {
	void checklength(String str) { 
		try {
		int num=Integer.parseInt(str);
		System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
	public static void main(String[] args) {
		String_To_Integer a=new String_To_Integer();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		a.checklength(str);
		System.out.println("successfull");
	}
}
