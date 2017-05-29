package cap.demo.tests;

public class SubArrayNumber {
	
	public static void subArray(int[] input,int number)
	{
		int[] array=input;
		int sum=array[0];
		int start=0;
		int nbr=number;
		for(int i=1;i<array.length;i++)
	{
			sum=sum+array[i];
			while(sum>number&& start<=i-1)
			{
				
				
				sum=sum-array[start];
				start++;
			}
			if(sum==number)
			{
				
				for(int j=start;j<=i;j++)
				{
					
					System.out.println(array[j]);
					
				}
				
			}
	}
		
		
	}
	public static void main(String n[])
	{
		subArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
		
	}
}
