package Mock_Test;

import java.util.Scanner;

public class Mock_5 {
 Scanner s=new Scanner(System.in);
 void accept(int a[]) {
	 for (int i = 0; i < a.length; i++) {
	System.out.println("enter number");	
	int n=s.nextInt();
	if(prime(n)) {
		a[i]=n;
	}
	else {
		i--;
		System.out.println("not valid");
	}
	}
	}
 void display(int a[]) {
	 for (int i = 0; i < a.length; i++) {
		 System.out.println(a[i]+" ");
		
	}
 }
private boolean prime(int n) {
	if(n<=1) {
	return false;
}
	for (int i = 2; i < n; i++) {
		if(n%i==0) {
			return false;
		}
	}
	return false;
		
	}

}
