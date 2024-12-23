package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text_File {
public static void main(String[] args) throws IOException {
	String myfile="C:\\jbk\\sneha.txt";
	File file=new File(myfile);
	Scanner s=new Scanner(System.in);
	String input;
	FileWriter fileWriter = new FileWriter(myfile);
	System.out.println("enter text");
	boolean iswrite=true;
     while(true) {
    	 input=s.nextLine();
    	 if(input.equalsIgnoreCase("exit")) {
    		 break;
    	 }
		 fileWriter.write(input);
		 fileWriter.close();
     }
     System.out.println("success");
}}
    	 