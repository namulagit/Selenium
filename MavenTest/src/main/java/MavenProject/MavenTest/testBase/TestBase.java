package MavenProject.MavenTest.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.log4j.Logger;

import MavenProject.MavenTest.customListener.Listener;

public class TestBase {
	
	public static final Logger log =Logger.getLogger(TestBase.class.getName());
		public  WebDriver driver;
		public String url="http://automationpractice.com/index.php";
		public String browser="chrome";
		Properties OR;
		//Listener lis;

public void initDriver() throws IOException
{
loadData();
selectBrowser(OR.getProperty("browser"));
//lis=new Listener(driver);
getUrl(OR.getProperty("url"));
String log4jConfPath="log4j.properties";
PropertyConfigurator.configure(log4jConfPath);


}

public void loadData() throws IOException
{
OR=new Properties();
File file=new File(System.getProperty("user.dir")+"/src/main/java/MavenProject/MavenTest/config/config.properties");
FileInputStream fi=new FileInputStream(file);
OR.load(fi);

}
		
public void selectBrowser(String browsername)
{
	
	switch(browsername)
	
	{
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("Browser is "+browser);
		break;
	case "firefox":
		driver=new FirefoxDriver();
	break;
	}
	
}

public void getUrl(String url)
{
	log.info(url);
	driver.get(url);
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}
}
