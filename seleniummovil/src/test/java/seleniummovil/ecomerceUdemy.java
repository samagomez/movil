package seleniummovil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import junit.framework.Assert;
public class ecomerceUdemy {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		 final AndroidDriver<MobileElement> driver;
		 final WebDriverWait wait;
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "4200bbd4cc0e439f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.androidsample.generalstore");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 wait = new WebDriverWait(driver, 10);	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
	     driver.hideKeyboard();
	     driver.findElement(By.xpath("//*[@text='Female']")).click();
	     driver.findElement(By.id("android:id/text1")).click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();
	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

	     
	     driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
	     int count=    driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	     for(int i=0;i<count;i++)

	    {

	    String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

	    if(text.equalsIgnoreCase("Jordan 6 Rings"))

	    {
 
	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

	break;

	    }

	    }

	    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	String lastpageText=    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

	//Assert.assertEquals("Jordan 6 Rings", lastpageText);

	     

	     

	     
	}

}
