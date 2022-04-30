package mypackage;

public class BinaryToDecimal {
	public int converttodecimal(String binary)
	{
		int conversion=1;
		int result=0;
		for(int i=0;i<=binary.length();i++)
		{
			if(binary.charAt(binary.length()-i)=='1')
				result+=conversion;
			conversion*=2;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		BinaryToDecimal obj = new BinaryToDecimal();
		System.out.println(obj.converttodecimal("10110"));
	}

}
