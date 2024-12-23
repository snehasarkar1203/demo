package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Create_File {
public static void main(String[] args) throws FileNotFoundException {
	String myfile="test.txt";
	File file=new File(myfile);
	try {
		file.createNewFile();
	}catch(IOException e) {
		e.printStackTrace();
	}
	System.out.println("Success");
	
	try {
	FileWriter fileWriter = new FileWriter(myfile);
	fileWriter.write("java by kiran");
	fileWriter.close();
}catch(IOException e) {
	e.printStackTrace();
}
	Scanner s=new Scanner(file);
	while(s.hasNextLine()) {
		String line=s.nextLine();
		System.out.println(line);
	}
	System.out.println("success");
}
}
