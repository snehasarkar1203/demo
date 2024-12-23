package Basic;

import java.util.Scanner;

public class cw201 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y;
		System.out.println("enter no.=");
		y=s.nextInt();
		int n=0;
		while(y<0) {
			n=y%10;
			y=y/10;
			if(n%2==0) {
				System.out.println(n);
			}
		}
	}

}
