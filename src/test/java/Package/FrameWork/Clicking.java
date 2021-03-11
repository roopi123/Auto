package Package.FrameWork;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.PrefrencePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Clicking extends Base {

	@Test
	public void click() throws IOException
	{
		AndroidDriver<AndroidElement> driver=Capabalities("APiDemo");
		HomePage h=new HomePage(driver);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	h.prefrence.click();
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	PrefrencePage p=new PrefrencePage(driver);
	p.prefrenceDependencies.click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Roopesh123");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
	}

}
