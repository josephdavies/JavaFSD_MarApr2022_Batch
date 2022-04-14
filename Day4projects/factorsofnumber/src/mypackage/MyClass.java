package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		int n;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number");
		n=obj.nextInt();
		
		System.out.print("factors of "+n+" are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
	    }

     }
}	
