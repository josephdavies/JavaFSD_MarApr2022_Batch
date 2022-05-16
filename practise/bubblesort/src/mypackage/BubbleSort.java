package mypackage;

public class BubbleSort 
{
	public void sort(int[] numbers)
	{
		for(int i=1;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length-1;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args)
	{
		BubbleSort bubblesort = new BubbleSort();
		int[] numbers =new int[] {5,2,6,3,1};
		bubblesort.sort(numbers);
	}
}
