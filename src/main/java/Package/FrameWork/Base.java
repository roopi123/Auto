package Package.FrameWork;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	//public static void main(String[]args) throws MalformedURLException
	public static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> Capabalities(String app) throws IOException
	{
		System.getProperty("user.dir");
		FileInputStream fm=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Package\\FrameWork\\global.properties");
        Properties pr=new Properties();
        pr.load(fm);
        pr.get(app);
	  


	 File f = new File("src");
     File fs = new File(f, (String) pr.get(app));
     DesiredCapabilities cap = new DesiredCapabilities();
    // String device=(String) pr.get("device");
     String device=System.getProperty("devicename");
     cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
     cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
     
  return driver;
	}
	
	public static void getScreenShot(String s) throws IOException
	{
		File ss=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File(System.getProperty("user.dir")+"\\"+s+".png"));
		
	}

}
