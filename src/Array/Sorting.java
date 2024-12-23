package Array;

import java.util.Scanner;

public class Sorting {
  public void accept(int[]b) {
	  Scanner s=new Scanner(System.in);
	  for (int k = 0; k < b.length; k++) {
		System.out.println("enter a value");
		b[k]=s.nextInt();
	}
  }
  void display(int[]c) {
	  for (int k = 0; k < c.length; k++) {
		  System.out.println(c[k]+"");
	  }
  }
  public void sort(int[]b) {
	  for (int k = 0; k < b.length; k++) {
		  for (int h =k+1; h < b.length; h++) {
			if(b[k]<b[h]) {
				int t=b[k];
				b[h]=b[k];
				b[k]=t;
			}
		}
	}
  }

}
