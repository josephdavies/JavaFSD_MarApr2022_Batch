package mypackage;

import java.util.Scanner;
//linear search

public class MyClass {

	public static void main(String[] args) 
	{
		int[] data = new int[] {89,78,65,43,55,67,89,64,43,32,21,91,90,88};
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter element to be searched");
		int se = Integer.parseInt(obj.nextLine());
		
		Boolean isFound=false;
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==se)
			{
				System.out.println("element found at index :"+i);
				isFound=true;
				break;
			}
		}
			
		if(isFound==false)
			System.out.println("element not found");
	}
}
