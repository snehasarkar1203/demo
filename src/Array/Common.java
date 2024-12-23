package Array;

import java.util.Scanner;

public class Common {
	public void accept(int[]a) {
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.println("enter a value");
			a[i]=s.nextInt();
				
		}
		}
		void display(int[]b) {
			for(int j=0;j<b.length; j++) {
				System.out.println(b[j]+" ");
			}
		}
		public void common(int[]y,int[]h,int[]c) {
			int l=0;
			for(int i=0; i<y.length; i++) {
				for(int j=0;j<h.length; j++) {
					if(y[i]==h[j]) {
						c[l]=h[i];
                           l++;
					}
				}	
}
		}
}
