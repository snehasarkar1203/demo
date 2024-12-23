package Basic;

import java.util.Scanner;

public class patternH {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			if(i==2) {
				System.out.println("#####");
			}else {
				System.out.println("*****");
			}
		}
	}

}
