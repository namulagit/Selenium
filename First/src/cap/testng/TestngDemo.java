package cap.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngDemo {
  
	
	@BeforeClass
	public void classBefore()
	{
		
		System.out.println("Before Class");
		
	}
	
	@Parameters({"user1","user2"})
	@Test(groups={"testing","car"},dependsOnMethods={"methodOne"},priority=0)
	  public void paraMeters(String userOne,String userTwo) {
		  System.out.println("ParaMeters- "+userOne);
		  
	  }
	@Test(groups={"testing"},priority=1)
  public void methodOne() {
	  System.out.println("Method one");
	  
  }
	
	@DataProvider(name="userdetails")
	public Object[][] credentials()
	{
		Object[][] ret=null;
		
		ret=ExcelRead.getExcelData("D:/ExcelFolder/Test.xlsx");
		return ret;
		
	}
	@Test(dataProvider="userdetails",enabled=true,groups={"car"})
	public void login(String uname,String pword)
	{
		System.out.println("UsrerName-"+uname +"| PassWord-"+pword);
		
	}
  
  @Test
  public void a()
  {
	  
	  System.out.println("a");
	  
  }
  @Test
  public void b()
  {
	  System.out.println("b");
	  
  }
  @AfterClass
  public void classAfter()
  {
	  System.out.println("After Class");
	  
  }
  @BeforeSuite
  public void suiteBefore()
  {
	  System.out.println("Before Suite");
	  
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("After Suite");
  }
  @BeforeMethod
  public void methodBefore()
  {
	  System.out.println("Before Method");
  }
  @AfterMethod
  public void methodAfter()
  {
	  System.out.println("After Method");
	  
  }
  
}
