package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Char_by_Char {
public static void main(String[] args) {
	String dir="c:\\ek\\sneha";
	String file_name="khushi.txt";
	try {
		File file=new File(dir+file_name);
		FileReader r=new FileReader(file);
		int code=r.read();
		char ch=(char)(code);
		System.out.println(ch);
		r.close();
	}catch(FileNotFoundException e) {
		System.out.println(e);	
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
