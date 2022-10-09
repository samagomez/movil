package seleniummovil;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class ScriptMobile {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "4200bbd4cc0e439f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		
		
    driver= new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    Thread.sleep(5000);

  
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/com.android.dialer.widget.OverlappingPaneLayout/android.widget.FrameLayout[1]/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("jelo");
	driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto']")).click();
   	
  
        		Thread.sleep(2000);
		driver.quit();
		
		//android.widget.ImageButton[@content-desc="Crear contacto"]
 
	}

}
