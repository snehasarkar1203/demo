package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string 1");
		String a=s.next();
		System.out.println("enter string 2");
		String a1=s.next();
		a=a.toLowerCase();
		a1=a1.toLowerCase();
		char d[]=a.toCharArray();		
        for (int i = 0; i < d.length; i++) {
      	  for (int j = 0; j < d.length-i-1; j++) {
      		  if(d[j]>d[j+1]) {
      			  char t=d[j];
      			  d[j]=d[j+1];
      			  d[j+1]=t;
      		  }
      	  }
        }
        System.out.println("after sorting");
        for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
        char d1[]=a.toCharArray();		
        for (int i = 0; i < d.length; i++) {
        	  for (int j = 0; j < d.length-i-1; j++) {
        		  if(d[j]>d[j+1]) {
        			  char t=d[j];
        			  d[j]=d[j+1];
        			  d[j+1]=t;
        		  }
        	  }
        }	
        System.out.println("after sorting");
        for (int i = 0; i < d1.length; i++) {
        	System.out.println(d1[i]);
		}
        Arrays.equals(d, d1);
        System.out.println("its Anagram");
	}
}
