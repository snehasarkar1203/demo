package Basic;

import java.util.Scanner;

public class patternM {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=5;
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++) {
				if(a==b) {
					System.out.print("#");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
