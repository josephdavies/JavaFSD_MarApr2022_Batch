package mypackage;

import java.util.LinkedList;
import java.util.TreeSet;

public class MyClass2 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> data = new TreeSet<Integer>();
		 data.add(10);
		 data.add(9);
		 data.add(10);
		 data.add(8);
		 for(var d:data)
			{
				System.out.println(d);
			}

	}

}
