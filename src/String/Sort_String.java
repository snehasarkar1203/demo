package String;

import java.util.Scanner;

public class Sort_String {
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String a=s.next();
		System.out.println(a);
	    char v[]=a.toCharArray();
          for (int i = 0; i < v.length; i++) {
        	  for (int j = 0; j < v.length-i-1; j++) {
        		  if(v[j]>v[j+1]) {
        			  char t=v[j];
        			  v[j]=v[j+1];
        			  v[j+1]=t;
        		  }
        	  }	
		}
          System.out.println("after sorting");
          for (int i = 0; i < v.length; i++) {
        	  System.out.println(v[i]);
		}
	}
}
