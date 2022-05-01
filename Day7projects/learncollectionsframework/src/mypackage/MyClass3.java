package mypackage;

import java.util.HashMap;
import java.util.TreeMap;

public class MyClass3 {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> marks = new HashMap<String,Integer>();
		marks.put("Maths", 99);
		marks.put("English", 92);
		marks.put("Science", 91);
		marks.put("Social", 87);
		marks.put("Social", 80);
		
		System.out.println(marks.get("Social"));
		System.out.println(marks.size());
		
TreeMap<String,Integer> marks1 = new TreeMap<String,Integer>();
		
		marks1.put("Maths", 99);
		marks1.put("English", 92);
		marks1.put("Science", 91);
		marks1.put("Social", 87);
		marks1.put("Social", 80);
		
		System.out.println(marks1.get("Social"));
		System.out.println(marks1.size());
		
		var Subjects = marks1.keySet();
		for(var s:Subjects)
			System.out.println(s);

	}

}
