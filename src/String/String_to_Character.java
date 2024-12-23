package String;

import java.util.Scanner;

public class String_to_Character {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string");
       String a=s.next();
       char[] ch=a.toCharArray();
       for(int i=0; i<ch.length;i++) {
       System.out.println(ch[i]);
       }
       for(int i = 0; i<ch.length;i++) {
           char str2=a.charAt(i);
       System.out.println(str2);
       }

     int count=0,k=0;
     while(k<a.length()){
    	 count++;
    	 k++; 
     }
     System.out.println(count);
     
	}
}
