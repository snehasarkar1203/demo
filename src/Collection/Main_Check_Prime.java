package Collection;

import java.util.Scanner;

public class Main_Check_Prime {
public static void main(String[] args) {
	Check_Prime c=()->{
      int b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	 b=s.nextInt();
	
		int count=0;
		for(int i=1;i<=b;i++) {
			if(b%i==0) {
				count++;	
			}
		}
		if(count==2) {
			System.out.println("the number is prime");
		}else {
			System.out.println("the number is not prime");
		}
	};
	c.show();
}
}
