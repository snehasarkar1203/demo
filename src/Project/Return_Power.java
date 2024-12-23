package Project;

import java.util.Scanner;

public class Return_Power {
	public  int power() {
		Scanner s=new Scanner(System.in);
		int power;
		System.out.println("enter a power");
		power =s.nextInt();
		System.out.println("enter a number");
		int n=s.nextInt();
		int pro=1;
		for (int i = 1; i <= power; i++) {
			pro=pro*n;
		}
		return pro;
	}
}
