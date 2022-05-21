package mypackage;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MyClass {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String userstring = obj.nextLine();
		
		StringTokenizer st = new StringTokenizer(userstring," ");
		
		System.out.println(st);
		System.out.println("vowel count for each word in the sentence is :");
		
		while(st.hasMoreTokens())
		{
			String word = st.nextToken();
			System.out.println("processing word is :"+word);
			int vowelcount = 0;
			for(char c:word.toCharArray())
			{
				c= Character.toLowerCase(c);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					vowelcount++;
			}
		System.out.println("the word '"+word+"' has vowel count: "+vowelcount);
		} 		

	}

}
