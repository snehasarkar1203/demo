package Exception;

import java.util.Scanner;

public class Throws {
	void m1()throws ArithmeticException{
		int a=10,b=0;
		int d=a/b;
	}
	void m2()throws ArithmeticException{
		m1();
	}
    void m3()throws ArithmeticException{
    	m2();
    }
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Throws t=new Throws();
		try {
			t.m3();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			s.close();
		}
	}
}
