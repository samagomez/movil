package seleniummovil;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class Base {

	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	//public static void main(String[] args) throws MalformedURLException 
	{
	AndroidDriver<AndroidElement>  driver;

	// TODO Auto-generated method stub
	//File appDir = new File("src");
	  // File app = new File(appDir, "Fulea.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	    
	     capabilities.setCapability("deviceName", "Android Emulator");
	     capabilities.setCapability("platformName", "Android");
	     capabilities.setCapability("appPackage", "io.appium.android.apis");
	     capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	     capabilities.setCapability("noSign", true);
	     capabilities.setCapability("autoGrantPermissions", true);
	     capabilities.setCapability("platformVersion", "4.4.2");
	     capabilities.setCapability("noReset", true);
	     capabilities.setCapability("fullReset", false);
	    //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	   
	   return driver;
	
	
}
}
