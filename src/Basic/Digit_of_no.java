package Basic;

import java.util.Scanner;

public class Digit_of_no {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y=4126;
		//System.out.println(y);
		int n=0;
		//System.out.println(n);
		while(y>0) {
			System.out.println(y);
			n=y%10;
			System.out.println(n);
			y=y/10;
		}
	}

}
