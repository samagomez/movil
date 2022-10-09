package seleniummovil;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class estudioemulador {

	public static void main(String[] args) throws MalformedURLException {
		
		final AndroidDriver<MobileElement> driver;
		 final WebDriverWait wait;

		//File appDir = new File("src");
	    //File app = new File(appDir, "ApiDemos-debug.apk");
	     
		DesiredCapabilities cap= new DesiredCapabilities();
		/*cap.setCapability("deviceName", "Android Emulator");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		cap.setCapability("platformVersion", "4.4.2");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		*/
		cap.setCapability("deviceName", "Android Emulator");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("platformVersion", "4.4.2");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
	    //cap.setCapability("app", app.getAbsolutePath());
		
		// driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	   driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
       wait = new WebDriverWait(driver, 10);
		// TODO Auto-generated method stub
       driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
       driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
       driver.findElement(By.id("android:id/checkbox")).click();
 
       driver.findElement(By.xpath("//android.widget.LinearLayout[2]")).click();
       System.out.println("hollaa");
       //driver.findElement(By.id("android:id/edit")).click();//funciona
       //driver.findElement(By.id("android:id/edit")).sendKeys("valor");//funciona
      driver.findElementByClassName("android.widget.EditText").sendKeys("parara");
      driver.findElementsByClassName("android.widget.Button").get(1).click();
       
       
	}

}
