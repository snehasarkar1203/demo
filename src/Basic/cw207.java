package Basic;

import java.util.Scanner;

public class cw207 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println(n1+""+n2);
		for(int k=1; k<=5; k++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
