package Basic;

import java.util.Scanner;

public class Buzz_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		if(number%7==0 || number%10==7) {
			System.out.println(number + "is a Buzz number");
		}else {
			System.out.println(number + " is not a Buzz number");
		}
	}

}
