package cap.demo.tests;

import java.util.Scanner;

public class PrimeNumber {
	
	
	
	public static void main(String n[])
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String primenumbers=" "; 
		for(int i=1;i<number;i++)
		{
			int counter=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter+1;
					
				}
			}
			if(counter==2)
			{
				primenumbers=primenumbers+ i +" ";				
			}
			
			
			
		}
		System.out.println(primenumbers);
		
		
	}

}
