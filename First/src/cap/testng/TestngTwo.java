package cap.testng;

import org.testng.annotations.Test;

public class TestngTwo {
  @Test(groups={"testing"})
  public void method1() {
	  System.out.println("Testng Two Class method1");
  }
  @Test(groups={"testing","car"})
  public void method2()
  {
	  System.out.println("Testng Two class method2 ");
  }
  @Test(groups={"car"})
  public void method3()
  {
	  System.out.println("Testng Two class car ");
	  
  }
}
