package Exception;

import java.util.Scanner;

public class String_Length {
	Scanner s=new Scanner(System.in);
	void checklength(String str) { 
		try {
			str.length();
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
	}
	public static void main(String[] args) {
		String_Length s=new String_Length();
		String str=null;
		s.checklength(str);
		System.out.println("Successfull");
	}
}
