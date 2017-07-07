package cap.demo.tests;

public class Child extends Parent
{
	int num=56;
	static  int j=65;
	
	public  int add(int i,int j)
	{
		 int g=10;
		
		g=i+j*2;
		
		return g;
		
	}
	
	public static void main(String n[])
	{
		
		 
		Child c=new  Child();
		
		c.ss();
		Child c2=new  Child();
		c2.ss();
		System.out.println(c.add(10, 10));
		
	}
	
	public static void ss()
	{
		
		
		
		
		
		
	}
	
	
	public static void test()
	{
		
		System.out.println("");
		
	}

}
