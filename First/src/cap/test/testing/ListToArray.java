package cap.test.testing;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(5);
		ar.add(6);
		ar.add(8);
		Integer num[]=new Integer[ar.size()];
		num=ar.toArray(num);
		for(int s:num)
		{
			System.out.print(s);
		}
		
		for(int i=0;i<6;i++)
		{
			
			System.out.println("-"+i);
		}
		
		
		
			
		
		
	}

}
