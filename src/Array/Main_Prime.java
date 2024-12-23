package Array;

import java.util.Scanner;

public class Main_Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		Prime p=new Prime();
		p.checkprime(n);
	
	}

}
