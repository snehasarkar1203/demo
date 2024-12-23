package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Exception {
	void readfile()throws FileNotFoundException{
		File f=new File("example.txt");
		Scanner s=new Scanner(System.in);
	}
	public static void main(String[] args) {
		File_Exception ee=new File_Exception();
		try {
			ee.readfile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
