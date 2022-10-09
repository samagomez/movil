package seleniummovil;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class fuleacaso2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		// TODO Auto-generated method stub
		 final AndroidDriver<MobileElement> driver;
		 final WebDriverWait wait;

		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "4200bbd4cc0e439f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "com.fulea.app");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appActivity", "com.fulea.app.ui.activities.SplashActivity");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
     
		 wait = new WebDriverWait(driver, 10);
		   
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		   driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Abrir panel de navegación']").click();
	       driver.findElementByXPath("//android.widget.CheckedTextView[@text='Configuración']").click();
	       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Iniciar sesión\"));").click();
	       
	       driver.findElementById("email").sendKeys("apolo@gmail.com");
	       driver.findElementById("password").sendKeys("hol@P1");
	       driver.hideKeyboard();
		   driver.findElementById("btnSignIn").click();
		   //
		   
		   //caso 2
		   driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Abrir panel de navegación']").click();
		   driver.findElementByXPath("//android.widget.CheckedTextView[@text='Configuración']").click();
		   driver.findElementByXPath("//android.widget.TextView[@text='Unidades de distancia']").click();
		   driver.findElementByXPath("//android.widget.CheckedTextView[@text='Millas']").click();
		   driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Desplazarse hacia arriba']").click();
		   driver.findElementById("item_gasStation").click();
		   driver.findElementById("lyoPrincipal").click();
		   driver.findElementById("btn_favorito").click();
		   driver.findElementById("btn_directions").click();
		  // btn_directions
		   
		   
		  

	}

}
