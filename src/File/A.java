package File;

import java.io.File;
import java.io.IOException;
public class A {
	public static void main(String[] args) {
		File file=new File("c:\\ek\\pragati\\sneha.txt");
	    boolean b1;
	    b1=file.exists();
	    System.out.println(b1);
	    b1=file.isFile();
	    System.out.println(b1);
	    String s;
	    s=file.getAbsolutePath();
	    System.out.println(s);
	    s=file.getName();
	    System.out.println(s);
	    long len=file.length();
	    System.out.println(len);
	    file.delete();
	    /*try{
	        file.createNewFile();
	        //System.out.println("/n File created");
	} catch(IOException e) {
		System.out.println(e);
	}*/	
	}
	}
