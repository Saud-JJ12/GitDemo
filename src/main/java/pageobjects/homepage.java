package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class homepage {

	AndroidDriver d;

	public homepage(AndroidDriver d) {

		this.d = d;
	}

	private By Preference = By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]");
	private By Dependencies = By.cssSelector("android.widget.TextView:nth-child(2)");
	private By Checkbox = By.id("android:id/checkbox");
	private By Setting = By.cssSelector("android.widget.TextView[text='WiFi settings']");
	private By Field = By.id("android:id/edit");
	private By OKBtn= By.id("android:id/button1");

 	public WebElement Preference() {

		return d.findElement(Preference);
	}

	public WebElement Dependencies() {

		return d.findElement(Dependencies);
	}

	public WebElement Checkbox() {

		return d.findElement(Checkbox);
	}
	
	public WebElement Setting() {

		return d.findElement(Setting);
	}
	
	public WebElement Field() {

		return d.findElement(Field);
	}
	
	public WebElement OKBtn() {

		return d.findElement(OKBtn);
	}
	
}
