package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuesdayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "E:\\Misc2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:/www.google.com");
		//Actions a=new Actions(driver);
		driver.close();
		
	}

}
