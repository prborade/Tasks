package ExceptionDemo;

import java.io.File;
import java.io.FileWriter;

public class fileD {

	public static void main(String[] args)throws Exception {
		FileWriter w= new FileWriter("abc.txt");{
		w.write("welcome in edubridge.com");
		System.out.println("file update");
			}
	}

}
