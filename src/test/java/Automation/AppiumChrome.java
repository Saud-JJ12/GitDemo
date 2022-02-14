package Automation;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

public class AppiumChrome extends Base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		AndroidDriver d = Startup();

		d.get("https://www.google.com/");
//		d.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Chrome\"]")).click();
	}

}
