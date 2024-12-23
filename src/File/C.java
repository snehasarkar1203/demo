package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class C {
	public static void main(String[] args) {
		String dir="c:\\ek\\sneha\\";
		String file_name="khushi.txt";
		File file=new File(dir+file_name);
		try {
			FileWriter Writer=new FileWriter(file);
			//FileOutputStream out=new FileOutputStream(file);
			//FileOutputStream out1=new FileOutputStream(new File(dir+file_name));
			String s1="I am a good java programmer";
			Writer.write(s1);
			Writer.close();
			Writer.flush();
			System.out.println("Writing is done.....");
		}catch(IOException e) {
			System.out.println(e);
		}
}
}