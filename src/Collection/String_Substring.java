package Collection;

import java.util.Scanner;

public class String_Substring {
       public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b;
		System.out.println("enter the String");
		b=s.next();
		for (int i = 0; i < b.length(); i++) {
			for (int j = i+1; j <= b.length(); j++) {
				String m= b.substring(i,j);
				System.out.println(m);

			}
				
		}
			}
}
