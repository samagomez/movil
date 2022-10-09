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

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class ScriptMobile2 {
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		 final AndroidDriver<MobileElement> driver;
		 final WebDriverWait wait;

		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "4200bbd4cc0e439f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "org.wikipedia.alpha");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appActivity", "org.wikipedia.main.MainActivity");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        wait = new WebDriverWait(driver, 10);
		
   // driver= new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    Thread.sleep(5000);

        //wait.until(ExpectedConditions.visibilityOfElementLocated
          //      (By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto']"))).click();
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/com.android.dialer.widget.OverlappingPaneLayout/android.widget.FrameLayout[1]/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("jelo");
	//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto']")).click();
       // noooo wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Nombre"))).sendKeys("salvador");
        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Buscar en Wikipedia")));
            searchElement.sendKeys("abobo");
       
       
        driver.quit();
  
        		//Thread.sleep(2000);
	
		//android.widget.ImageButton[@content-desc="Crear contacto"]
 
	}

}
