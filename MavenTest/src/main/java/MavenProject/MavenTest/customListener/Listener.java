package MavenProject.MavenTest.customListener;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import MavenProject.MavenTest.testBase.TestBase;

public class Listener extends TestBase implements ITestListener {

	WebDriver driver;
	/*public Listener(WebDriver driver) 
	{
		this.driver=driver;
		
	}*/
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat format=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName=result.getName();
		if(!result.isSuccess())
		{
			File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try
			{
				String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/MavenProject/MavenTest/screenshot";
				File destFile=new File((String)reportDirectory+"/failure_screenshots/"+methodName+"_"+format.format(calendar.getTime())+".png");
				FileUtils.copyFile(srcFile, destFile);
				Reporter.log("<a href='"+destFile.getAbsoluteFile()+"'><img src='"+destFile.getAbsoluteFile()+ "' height='100' width='100'></a>");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
