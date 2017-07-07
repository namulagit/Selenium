package cap.test.testing;

public  class Test {
	
	int i=10;
	public  void show()
	{
		
		System.out.println(i);
		i=20;
		
	}
	
	public static void main(String n[])
	{
		Test t=new Test();
		t.show();
		System.out.println(t.i);
		
	

		
	}

}
