package Package.FrameWork;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.ProductsPage;
import Resources.TestData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;


public class FillingForm extends Base{

	@Description(" This test is to login")
	@Severity(SeverityLevel.BLOCKER)
	@Step("Landing on products page")
    @Test(dataProvider="names",dataProviderClass=TestData.class)
	public   void logintoapp() throws IOException
	{
		// TODO Auto-generated method stub
 
		AndroidDriver<AndroidElement> driver=Capabalities("GeneralStore");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage lg=new LoginPage(driver);
		
		lg.name.sendKeys("hello");
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("hello");
		driver.hideKeyboard();
		lg.gender.click();
		//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		lg.country.click();
		//driver.findElement(By.id("android:id/text1")).click();
		Utilities ut=new Utilities(driver);
		ut.Scroll("Benin");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Benin\"))").click();
		lg.shop.click();
		//driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	    ProductsPage pp=new ProductsPage(driver);
	    boolean s=  pp.products.isDisplayed();
	    System.out.println(" Navigating to Products page is"+" "+s);
		//driver.findElementByXPath("//android.widget.TextView[@text='Products']").isDisplayed();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
}
}
