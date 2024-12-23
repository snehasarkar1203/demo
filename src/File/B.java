package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class B {
public static void main(String[] args) {
	String dir="c:\\ek\\sneha\\";
	String file_name="khushi.txt";
	File file=new File(dir+file_name);
	try {
		FileOutputStream out=new FileOutputStream(file);
		FileOutputStream out1=new FileOutputStream(new File(dir+file_name));
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
