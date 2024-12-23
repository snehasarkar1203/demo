package Basic;

import java.util.Scanner;

public class Square_Odd_Digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number=");
		int num =s.nextInt();
		int y=1;
		for(int i=0; i<y; i++) {
			
			if(i%2!=1) {
				int square=num*num;
				System.out.println("the square of odd digit "+ num +" is " +square);
				
	}
	
		}
	}
}
