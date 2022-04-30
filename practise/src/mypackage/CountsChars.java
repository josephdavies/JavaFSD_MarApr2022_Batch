package mypackage;

public class CountsChars {
	public int countChars(char c, String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == c)
				count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		CountsChars countChars = new CountsChars();
		System.out.println(countChars.countChars('l',"sally sells sea shells on sea shore"));

	}

}
