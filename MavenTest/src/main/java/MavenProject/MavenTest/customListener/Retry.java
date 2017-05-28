package MavenProject.MavenTest.customListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer  {

	int retryCount=0;
	int maxRetryCount=2;
	@Override
	public boolean retry(ITestResult result) {
		if(retryCount< maxRetryCount)
		{
			
			System.out.println("Retrying test "+result.getName()+"with status "+getResultStatusName(result.getStatus())+"for the retry count "+retryCount+1);
			retryCount++;
			return true;
			
		}
		
		return false;
	}
	public String getResultStatusName(int status)
	{
		String resultStatus=" ";
		if(status==1)
		{
			
			resultStatus="Success";
		}
		if(status==2)
		{
			 resultStatus="Failure";
			 
		}
		if(status==3)
		{
			resultStatus="Skip";
			
		}
			
		return resultStatus;
	}
	
	

}
