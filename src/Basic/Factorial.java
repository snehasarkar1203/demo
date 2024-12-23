
package Basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		int factorial=1;
		System.out.println("enter number=");
		a=s.nextInt();
		for( int i=1; i<=a; i++) {
			factorial=factorial*i;	
		}
		System.out.println(factorial);
		}
	

}
