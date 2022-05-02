package mypackage;

import java.util.Scanner;

public class MyClass1 {

	public static void main(String[] args) 
	{
		int[] data = new int[] {1,2,3,5,6,7,67,78,89,90};
		int low,mid,high;
		/*Scanner obj = new Scanner(System.in);
		System.out.println("enter element to be searched");
		int se = Integer.parseInt(obj.nextLine());
*/
		int se=67;
		Boolean isFound=false;
		
		low=0;
		high=data.length;
		mid=(low+high)/2;
		
		while(true)
		{
			if(se==data[mid])
			{
				System.out.println("element found at index :"+mid);
				isFound=true;
				break;
			}
			else 
			{
				if(se>data[mid])
				{
					low=mid;
				}
				else 
				{
					high=mid;
				}
			}
		mid=(low+high)/2;
	    }
}}
