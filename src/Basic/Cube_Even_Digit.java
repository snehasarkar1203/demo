package Basic;

import java.util.Scanner;

public class Cube_Even_Digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number=");
		int num =s.nextInt();
		int y=1;
		for(int i=0; i<y; i++) {
			
			if(i%2==0) {
				int cube=num*num*num;
				System.out.println("the cube of even digit "+ num +" is " +cube);
				
			}
		}
	}

}
