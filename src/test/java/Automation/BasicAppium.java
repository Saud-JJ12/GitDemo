package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import pageobjects.homepage;

public class BasicAppium extends Base {

	@SuppressWarnings("deprecation")
	@Test
	public void FirstTest() throws IOException, InterruptedException {

		d = Startup();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homepage hg = new homepage(d);

		hg.Preference().click();

		hg.Dependencies().click();

		hg.Checkbox().click();

		hg.Setting().click();

		hg.Field().sendKeys("Saud");

		hg.OKBtn().click();
		

	}

}
