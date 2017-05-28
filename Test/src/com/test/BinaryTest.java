package com.test;


import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
	int test=0;
		
		while(num!=0)
		{
			
			test=test*10+num%10;
			num=num/10;
		}
System.out.println(test);
System.out.println(1/10);
ArrayList<Integer> l=new ArrayList<Integer>();

num=12;
while(num!=0)
{
	test=num%2;
	l.add(test);
	num=num/2;
	
}

System.out.print(Arrays.toString(l.toArray()));

	}

}
