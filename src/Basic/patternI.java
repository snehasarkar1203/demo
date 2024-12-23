package Basic;

import java.util.Scanner;

public class patternI {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=5;
		int middle=n/2;
		for(int i=0; i<5; i++) {
			if(i==middle) {
				System.out.println("#####");
			}else {
				System.out.println("**#**");
			}
		}
	}

}
