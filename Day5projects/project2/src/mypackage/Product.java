package mypackage;

import java.util.Scanner;

public class Product 
{
	public int id;
	public String name;
	public int price;
	public static String company="microsoft";
	
	public static void printCompany()
	{
		System.out.println(company);
	}
	
	public Product()
	{
		id=0;
		name=null;
		price=0;
	}
	
	public Product(int pid,String pname,int pprice)
	{
		id=pid;
		name=pname;
		price=pprice;
	}
	
	public void readData()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter product id: ");
		id=Integer.parseInt(obj.nextLine());
		System.out.println("enter product name: ");
		name=obj.nextLine();
		System.out.println("enter product price: ");
		price=Integer.parseInt(obj.nextLine());
	}
	
	public void printData()
	{
		System.out.println("Id : "+id);
		System.out.println("name : "+name);
		System.out.println("price : "+price);
		System.out.println("comapany : "+company);
	}
}
