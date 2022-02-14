package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

@SuppressWarnings("deprecation")
public class MobileGestures extends Base {

	@Test
	public void Gestures() throws InterruptedException, IOException {

		AndroidDriver d = Startup();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		d.findElement(By.cssSelector("android.widget.TextView[text='Views']")).click();
		d.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Views\"));")).click();

		/* For Tapping on element */
		TouchAction ta = new TouchAction(d);

//		WebElement list = d.findElement(By.cssSelector("android.widget.TextView[text='Expandable Lists']"));
//		Thread.sleep(1000);
//		ta.tap(element(list)).perform();

		/* For Long Pressing */
//		Thread.sleep(1000);
//		d.findElement(By.cssSelector("android.widget.TextView[text='1. Custom Adapter']")).click();
//
//		WebElement p = d.findElement(By.cssSelector("android.widget.TextView[text='People Names']"));
//		ta.longPress(longPressOptions().withElement(element(p)).withDuration(ofSeconds(2))).release().perform();
//		System.out.println(d.findElement(By.id("android:id/title")).isDisplayed());

		/* For Swipping */
//		d.findElement(By.cssSelector("android.widget.TextView[text='Date Widgets']")).click();
//		d.findElement(By.cssSelector("android.widget.TextView[text='2. Inline']")).click();
//		d.findElement(By.xpath("//*[@content-desc='11']")).click();
//		WebElement one = d.findElement(By.xpath("//*[@content-desc='15']"));
//		WebElement two = d.findElement(By.xpath("//*[@content-desc='55']"));
//		ta.longPress(longPressOptions().withElement(element(one)).withDuration(ofSeconds(1))).moveTo(element(two))
//				.release().perform();
//		Thread.sleep(2000);

		/* For Scrolling */
//		d.findElement(MobileBy.AndroidUIAutomator(
//				"new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"WebView\"));")).click();
//		Thread.sleep(1000);

		/* For Drag and Drop */
		d.findElement(By.cssSelector("android.widget.TextView:nth-child(7)")).click();
		Thread.sleep(500);
		WebElement dotone = d.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement dottwo = d.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		ta.longPress(element(dotone)).moveTo(element(dottwo)).release().perform();

	}

}
