package cap.demo.tests;

public class TestOne {

	static String name="azam";
private static TestOne instance=null;
private TestOne()
{
	
}

public  void doSomething()
{
System.out.println("Singleton pattern");	
}
public static TestOne getInstance()
{
	
if(instance==null){
	instance =new TestOne();
}
	return instance;

}
	public static void main(String n[])
	{
		TestOne one=TestOne.getInstance();
		
		one.doSomething();
	}
	
	
}
