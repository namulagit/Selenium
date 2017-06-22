package cap.demo.tests;

public class Child extends Parent
{
	public  int add(int i,int j)
	{
		 int g=10;
		
		g=i+j*2;
		return g;
		
	}
	
	public static void main(String n[])
	{
		
		Child c=new  Child();
		
		System.out.println(c.add(10, 10));
		
	}

}
