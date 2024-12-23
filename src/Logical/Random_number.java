package Logical;

import java.util.Random;
import java.util.Scanner;

public class Random_number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n3=1;
		Random a=new Random();
		int n2=a.nextInt(8);
		
		while(n3<=3) { 
			System.out.println("enter the number");
			int n=s.nextInt();
			if(n==n2) {
				System.out.println("you win");
				break;
			}else {
				System.out.println("you loose");
				n3++;
			}
		}
		System.out.println(n2);
	}

}
