package Basic;

import java.util.Scanner;

public class patternQ {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=5;
		for(int i=1; i<=row; i++) {
			for(int b=1; b<=i; b++) {
				System.out.print(b + "");
			}
			System.out.println();
		}
	}

}
