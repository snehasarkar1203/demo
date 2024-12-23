package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
	static Scanner s=new Scanner(System.in);
	void dividenumber()throws ArithmeticException,InputMismatchException{
		int divisor,divident;
		System.out.println("enter divisor");
		divisor=s.nextInt();
		System.out.println("enter divident");
		divident=s.nextInt();
		int sol=divident/divisor;
		System.out.println(sol);
	}
	public static void main(String[] args) {
		Exception_2 ee=new Exception_2();
		try {
			ee.dividenumber();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			s.close();
			int n=s.nextInt();
		}
	}

}
