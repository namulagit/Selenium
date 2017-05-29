package cap.demo.tests;

import java.util.HashMap;
import java.util.Scanner;

import java.util.Set;

public class FrequencyDigit {
	
	public static void main(String n[])
	{
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		while(number!=0)
		{
			int lastDigit=number%10;
			if(hm.containsKey(lastDigit))
			{
				
				hm.put(lastDigit, hm.get(lastDigit)+1);
				
			}
			else
			{
				
				hm.put(lastDigit,1);
				
				
			}
			number=number/10;
			
			
		}
		Set<Integer> keys=hm.keySet();
		for(int keytest:keys)
		{
			
			System.out.println(keytest+" -> "+hm.get(keytest)  );
			
		}
		sc.close();
		
	}

}
