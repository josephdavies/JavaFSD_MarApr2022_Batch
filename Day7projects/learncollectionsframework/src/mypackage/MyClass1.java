package mypackage;

import java.util.LinkedList;

public class MyClass1 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> data = new LinkedList<Integer>();
		data.add(10);
		data.add(20);
		data.add(1,30);
		
		System.out.println(data.indexOf(20));
		System.out.println(data.contains(10));
		
		for(int i=0;i<data.size();i++)
			System.out.println(data.get(i));
		
		for(var d:data)
		{
			System.out.println(d);
		}
		
		data.remove();
		System.out.println("\n");
		for(var d:data)
		{
			System.out.println(d);
		}
		data.remove(1);
		System.out.println("\n");
		for(var d:data)
		{
			System.out.println(d);
		}
		
		
	}

}
