package cap.demo.tests;

import java.util.HashSet;

public class DuplicateInArrays {
	
	static int t=2;
	static int st=4;
	 
	 public static void main(String n[])
	 {
		 
		 String[] str=new String[]{"A","B","C","A"};
		 for(int i=0;i<str.length-1;i++)
		 {
			 
			 for(int j=i+1;j<str.length;j++)
			 {
				 
				 if(str[i].equals(str[j])  )
				 {
					 
					 System.out.println(str[j]);
					 
				 }
				
			 }
		 }
		 if((t=3)!=0 )
		 {
			 System.out.println(t);
			 
		 }
		 HashSet<String> hs=new HashSet<String>();
		 for(String ele:str)
		 {
			 
			if(!hs.add(ele))
			{
				
				System.out.println(ele);
				
			}
		 }
		
		 
	 }

}
