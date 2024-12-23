package Basic;

import java.util.Scanner;

public class Print_Odd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for (int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		}

}
