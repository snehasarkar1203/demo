package Basic;

import java.util.Scanner;

public class patternP {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=5;
		for(int i=1; i<=row; i++) {
			for(char ch='A'; ch<'A'+i; ch++) {
				System.out.print(ch + "");
			}
			System.out.println();
		}
	}

}
