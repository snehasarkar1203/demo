package Basic;

import java.util.Scanner;

public class Cube_of_number {
       public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
				int cube=num*num*num;
		System.out.println("the cube of "+num+"is"+cube);
	}

}
