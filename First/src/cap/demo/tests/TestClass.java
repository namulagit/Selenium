package cap.demo.tests;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello";
		System.out.println(removeDuplicates(s));
		

	}
	
	public static String removeDuplicates(String s)
	{
		String returnValue="";
		
		
		for(char c:s.toCharArray())
		{
			
			if(returnValue.indexOf(c)==-1)
			{
				
				returnValue+=c;
				
			}
		}
		
		
		return returnValue;
		
	}

}
