package Basic;

import java.util.Scanner;

public class Base_Power {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double base;
		System.out.println(" enter the base number ");
		base=s.nextDouble();
		
		int power;
		System.out.println(" enter the power number ");
		power=s.nextInt();
		
		double result=1;
		for(int i=1; i<=power; i++) {
			result *=base;
		}
		System.out.println(result);
		}

}
