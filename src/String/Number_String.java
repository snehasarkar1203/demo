package String;

import java.util.Scanner;

public class Number_String {
	public static void main(String[] args) {
		String a = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		a = s.next();
		int k = 0, count=0;
		char num;
		while (k < a.length()) {

			num = a.charAt(k);
			if (num == '0' || num == '1' || num == '2' || num == '3' || num == '4' || num == '5' || num == '6'
					|| num == '7' || num == '8' || num == '9') {
				System.out.println(num);
			}
			k++;
		}
	}
}
