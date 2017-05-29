package cap.demo.tests;

public class leadersOfTheArray {
	
	public static void LeadersOfTheArray(int[] input)
	{
		int[] inputCopy=input;
		int number=inputCopy[inputCopy.length-1];
		for(int i=inputCopy.length-2;i>=0;i--)
		{
			if(inputCopy[i]>number)
			{
				
				System.out.println(inputCopy[i]);
				number=inputCopy[i];
			}
			
			
		}
		
		
		
	}
	public static void main(String n[])
	{
		
		LeadersOfTheArray(new int[] {25,36,56,22,85,95});
	}

}
