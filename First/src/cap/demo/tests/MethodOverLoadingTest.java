package cap.demo.tests;


public class MethodOverLoadingTest {
	
	public static int add(int x,int y)
	{
		int c=0;
		c=x+y;
		return c;
		
		
	}
	
	public static double add(float x,int y)
	{
		double c=0;
		c= (x+y);
		return c;
		
	}
	
	
	public static void main(String n[])
	{
		
		System.out.println(add(2.0f, 10));
		
	}

}
