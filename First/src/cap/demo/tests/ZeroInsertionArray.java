package cap.demo.tests;

import java.util.Arrays;

public class ZeroInsertionArray {
	
	public static void zeroInsertion(int[] array)
	{
		int counter=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
			array[counter]=array[i];
			counter++;
			}
		}
		while(counter<array.length)
		{
			
			array[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void zeroInsertionInFront(int[] array)
	{
		int counter=array.length-1;
		
		for(int i=counter;i>=0;i--)
		{
			
			if(array[i]!=0)
			{
				
				array[counter]=array[i];
				counter--;
			}
		}
		while(counter>=0)
		{
			
			array[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(array));
		
		
		
	}
	public static void main(String n[])
	{
		
		zeroInsertion(new int[]{5,6,0,8,0,1,20,0,22});
		zeroInsertionInFront(new int[]{5,6,0,8,0,1,20,0,22});
	}

}
