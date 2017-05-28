package com.test;

public class PerfectNumber {
	
	public static  boolean isPerFect(int number)
	{	
		boolean flag=false;
		int temp=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				temp=temp+i;
			}
			
		}
		if(number==temp)
		{
			return flag=true;
		}
		
		return flag;
	}
	
	public static void main(String args[])
	{
		
		boolean result =isPerFect(27);
		if(result)
		{
			System.out.println("perfect");
			
		}
		else
		{
			System.out.println("Not");
		}
	}

}
