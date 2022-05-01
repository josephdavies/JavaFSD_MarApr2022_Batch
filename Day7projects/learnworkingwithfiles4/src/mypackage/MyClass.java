package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\joseph davies\\Desktop\\simplilearn\\myfiles\\names.txt");
		
		FileWriter fw=new FileWriter(f,true);
		
		fw.write("joseph\n");
		fw.write("davies\n");
		
		fw.close();
		
		System.out.println("Writing Success");

	}
}
