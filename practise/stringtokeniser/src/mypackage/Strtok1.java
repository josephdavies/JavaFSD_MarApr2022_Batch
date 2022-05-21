package mypackage;

import java.util.StringTokenizer;

public class Strtok1 {

	public static void main(String[] args) 
	{
		StringTokenizer st1 = new StringTokenizer("java is a programming language"," ");
		while(st1.hasMoreTokens())
		{
			System.out.println(st1.nextToken());
		}
	}
}
