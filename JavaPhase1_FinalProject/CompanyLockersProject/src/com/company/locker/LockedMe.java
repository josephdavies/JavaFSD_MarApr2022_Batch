package com.company.locker;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {

	static final String projectPath="C:\\Users\\joseph davies\\Desktop\\simplilearn\\JAVAFSPROJECTSMARAPR2022\\JavaPhase1_FinalProject\\CompanyLockersProject\\LockedMeFiles";
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int ch;
		do
		{
			displayMenu();
			System.out.println("enter your choice");
			ch=Integer.parseInt(obj.nextLine());
			
			switch(ch)
			{
			case 1: getAllFiles();
					break;
			case 2: createFiles();
					break;
			case 3: deleteFiles();
					break;
			case 4: searchFiles();
					break;
			case 5: System.exit(0);
					break;
			default: System.out.println("invalid option");
					 break;
			}
		}
		while(ch>0);
	}
	
	public static void displayMenu()
	{
		System.out.println("*************************");
		System.out.println("\tWelcome to Company Lockers - LockeMe.com");
		System.out.println("\tDeveloper name : Joseph Davies");
		System.out.println("*************************");
		System.out.println("\t1. Display all the files ");
		System.out.println("\t2. Add files to existing directory ");
		System.out.println("\t3. Delete a file ");
		System.out.println("\t4. Search a file ");
		System.out.println("\t5. Exit ");
		System.out.println("*************************");
	}
	
	public static void getAllFiles()
	{
		File[] listofFiles = new File(projectPath).listFiles();
		if (listofFiles.length == 0) 
		{
		 System.out.println("No files in directory");
		}
		else 
		{
			for(var l:listofFiles) 
				System.out.println(l.getName());
		}
	}
	
	public static void createFiles()
	{
		try 
		{
			Scanner obj = new Scanner(System.in);
			String filename;
			int linescount;
			
			System.out.println("enter filename: ");
			filename = obj.nextLine();
			
			System.out.println("enter how many lines to be added : ");
			linescount = Integer.parseInt(obj.nextLine());
			
			FileWriter fw = new FileWriter(projectPath+"\\"+filename);
			
			for(int i=1;i<=linescount;i++)
			{
				System.out.println("enter file content");
				fw.write(obj.nextLine()+"\n");
			}
			
			System.out.println("file created successfully");
			fw.close();
		}
		catch(Exception ex)
		{
			System.out.println("some error occured");
		}
	}
	
	public static void deleteFiles()
	{
		Scanner obj = new Scanner(System.in);
		try
		{
			String filename;
			System.out.println("enter file to be deleted");
			filename=obj.nextLine();
			
			File fl = new File(projectPath+"\\"+filename);
			
			if(fl.exists())
			{
				fl.delete();
				System.out.println("file deleted successfully");
			}
			else
			{
				System.out.println("file does not exist");
			}
		}
		catch(Exception ex)
		{
			System.out.println("some error occured");
		}
	}
	
	public static void searchFiles()
	{
		Scanner obj = new Scanner(System.in);
		try
		{	
			String filename;
			System.out.println("Enter filename to be searched");
			filename = obj.nextLine();
			
			File fl = new File(projectPath+"\\"+filename);
			
			if(fl.exists())
			{
				System.out.println("file is available");
			}
			else
			{
				System.out.println("file is not available");
			}
		}
		catch(Exception Ex)
		{
			System.out.println("error occured");
		}
	}
}
