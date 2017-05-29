package cap.demo.tests;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String n[])
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		StringBuilder strb=new StringBuilder();
		
		for(int i=input.length()-1;i>=0;i--)
		{
			
			strb.append(input.charAt(i));
			
		}
		System.out.println(strb);
		
		
	}

}
