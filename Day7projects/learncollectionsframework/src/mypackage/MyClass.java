package mypackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyClass {

	public static void main(String[] args) 
	{
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		LinkedList<Integer> data2 = new LinkedList<Integer>();
		
		//for ArrayList
		long start_time1 = System.nanoTime();
		
		for(int i=1;i<=100000;i++)
			data1.add(i);
		for(int i=1;i<100000;i++)
			data1.get(i);
		
		long end_time1 = System.nanoTime();
		double difference1 = (end_time1-start_time1);
		System.out.println(difference1);
		
		//for LinkedList
				long start_time2 = System.nanoTime();
				
				for(int i=1;i<=100000;i++)
					data2.add(i);
				for(int i=1;i<100000;i++)
					data2.get(i);
				
				long end_time2 = System.nanoTime();
				double difference2 = (end_time2-start_time2);
				System.out.println(difference2);
	}

}
