package cap.demo.tests;


import java.util.HashSet;

public class Union {
	
	public static void addArrays(int[]...inputArrays)
	{
		
		HashSet<Integer> union=new HashSet<Integer>();
		for(int[] ar :inputArrays)
		{
			for(int i:ar)
			{
				
				union.add(i);
			}
			
		}
		System.out.println(union);
		
		
	}
	
	
	public static void main(String n[])
	{
		int[] array1=new int[]{1,2,3,4,5,6};
		int[] array2=new int[]{7,8,9,10,11};
		int[] array3=new int[]{12,13,14};
		
		addArrays(array1,array2,array3);
		
		
		
	}
	

}
