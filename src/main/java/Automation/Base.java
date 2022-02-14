package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver d;


	public static AndroidDriver Startup() throws IOException {

		File path = new File("src/main/java/resource");
		File app = new File(path, "ApiDemos-debug.apk");

		Properties pr = new Properties();
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resource\\data.properties");
		pr.load(fs);

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.getCapability("emulator");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		return d;

	}

}
