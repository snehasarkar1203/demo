package Basic;

import java.util.Scanner;

public class patternO {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=5;
		for(int a=0; a<n; a++) {
			for(int b=0; b<n; b++) {
				if(a==b || a+b==n-1) {
					System.out.print("#");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
	}
	}
}