package Array;

import java.util.Scanner;

public class Add_2_Array {
	public void accept(int[]a) {
	Scanner s=new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter a value");
		a[i]=s.nextInt();		
	}
	}
	 public void display(int[]b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+"");
		}
	 }	
	 public void add(int[]a,int[]b,int[]c) {
		 int k=0;
		 for (int i = 0; i < a.length; i++){
			 c[k]=a[i];
			 k++;	
		}
		 for (int i = 0; i < b.length; i++) {
			c[k]=b[i];
			k++;
		}
	 }
}
