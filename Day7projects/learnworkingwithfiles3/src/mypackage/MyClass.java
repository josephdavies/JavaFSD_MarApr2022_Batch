package mypackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyClass 
{
	public static void main(String[] args) throws IOException 
	{
		var allLines = Files.readAllLines(Paths.get("C:\\Users\\joseph davies\\Desktop\\simplilearn\\myfiles\\scores.txt"));

		for(var r:allLines)
			System.out.println(r);
		
	}
}