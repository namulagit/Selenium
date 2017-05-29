package cap.demo.tests;

import java.io.IOException;

public class LaunchingExternalApps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Runtime r=Runtime.getRuntime();
String[] str=new String[]{"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "http://javaconceptoftheday.com/"};

r.exec(str);
	}

}
