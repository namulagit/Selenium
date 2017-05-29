package cap.demo.tests;

import java.util.Arrays;

public class SeparateZeros {

	
	public static void separateZeros(int[] input)
	{
		int[] copy=input;
		int counter=0;
		for(int i=0;i<copy.length-1;i++)
		{
			
			if(copy[i]!=0)
			{
				copy[counter]=copy[i];
				counter++;
			}
		}
		while(counter<copy.length-1)
		{
			copy[counter]=0;
			counter++;
			
		}
		System.out.println(Arrays.toString(copy));
		
	}
	public static void main(String[] args) {
		separateZeros(new int[]{12,88,0,55,1,0,56,0});
	
	}

}
