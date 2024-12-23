package Array;

import java.util.Scanner;

public class Prime_from_Integer {
	public static void main(String[] args) {
		
	int a[]=new int[5];
	Prime_from_Integer.accept(a);
	Prime_from_Integer.display(a);
	}
	static void accept(int[]a) {
		Scanner s=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter prime number from integer");
			a[i]=s.nextInt();
		}
	}
		 static void checkprime(int a) {
			int count=0;
			for (int i = 1; i <= a; i++) {
				if(a%i==0) {
					count++;
				}	
			}
			if(count==2) {
				System.out.println(a);
			} 
		}
		 static void display(int[]a) {
			for(int i=0;i<a.length; i++) {
            checkprime(a[i]);
			}
}
		}