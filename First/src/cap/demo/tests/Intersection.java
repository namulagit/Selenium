package cap.demo.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
	
	public static void intersection(Integer[]...inputArrays)
	{
	
		HashSet<Integer> intersection=new HashSet<Integer>(Arrays.asList(inputArrays[0]));
		for(int i=1;i<inputArrays.length;i++)
		{
			ArrayList<Integer> set=new ArrayList<>(Arrays.asList(inputArrays[i]));
			intersection.retainAll(set);
			
		}
		
		
		System.out.println(intersection);
		
	}
public static void main(String n[])
{
	Integer[] array1={1,2,3,55,66,88};
	Integer[] array2={1,2,3,56,66,55,89};
	Integer[] array3={1,2,56,252,65};
	 
	intersection(array1,array2,array3);
	
	

}
}
