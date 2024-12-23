package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Mismatch {
Scanner s=new Scanner(System.in);
    void check() {
    	try {
    	   int a;    		
    	   System.out.println("enter value of a");
    	   a=s.nextInt();
    	   int b;
    	   System.out.println("enter value of b");
    	   b=s.nextInt();
    	   int c=a+b;
    	   System.out.println(c);
    	} catch(InputMismatchException e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    	}
    }
    public static void main(String[] args) {
		Input_Mismatch i=new Input_Mismatch();
		i.check();
		System.out.println("successfull");
	}
}
