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


import java.util.List;
import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;



public class examen {
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		 final AndroidDriver<MobileElement> driver;
		 final WebDriverWait wait;

		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "4200bbd4cc0e439f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("appPackage", "org.eniblo.uicatalog");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		cap.setCapability("appActivity", "org.eniblo.uicatalog.MainActivity");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        wait = new WebDriverWait(driver, 10);
        String cadena="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean elementum id neque nec commodo. Sed vel justo at turpis laoreet pellentesque quis sed lorem. Integer semper arcu nibh, non mollis arcu tempor vel. Sed pharetra tortor vitae est rhoncus, vel congue dui sollicitudin. Donec eu arcu dignissim felis viverra blandit suscipit eget ipsum.";
        TouchAction t =new TouchAction(driver);
   // driver= new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    //Thread.sleep(5000);

        //wait.until(ExpectedConditions.visibilityOfElementLocated
          //      (By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto']"))).click();
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/com.android.dialer.widget.OverlappingPaneLayout/android.widget.FrameLayout[1]/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("jelo");
	//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Crear contacto']")).click();
       // noooo wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Nombre"))).sendKeys("salvador");
       
    
    //bueno
   /* AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Buscar en Wikipedia")));
            searchElement.sendKeys("abobo");*/
    
    
    // prueba tecnica 1--
  /*  
    AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Framework7 Material 1.4.0")));
    searchElement.click();
    Thread.sleep(3000);
    AndroidElement searchElement2 = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Accordion ")));
    searchElement2.click();     

    AndroidElement searchElement3 = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Integer semper")));
    searchElement3.click();  


    AndroidElement searchElement4 = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean elementum id neque nec commodo. Sed vel justo at turpis laoreet pellentesque quis sed lorem. Integer semper arcu nibh, non mollis arcu tempor vel. Sed pharetra tortor vitae est rhoncus, vel congue dui sollicitudin. Donec eu arcu dignissim felis viverra blandit suscipit eget ipsum.")));

     searchElement4.getText();
 
    System.out.println(cadena);

*/
    
    
 //   AndroidElement searchElement4 = (AndroidElement) new WebDriverWait(driver, 30).until(
   // 		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Color Themes")));
    //searchElement4.click();
    
    //driver.findElementByName("Color Themes").click();
    //driver.findElementByXPath("").click();
   // driver.findElement(By.name("Color Themes"));
    
  
    /*
    AndroidElement searchElement5 = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.webkit.WebView[@content-desc='Framework7 Material 1.4.0 | UI Framework Catalog']/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[25]")));
    searchElement5.click();
    */
    
    
    /*
    
    AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Framework7 Material 1.4.0")));
    searchElement.click();
    
    AndroidElement searchElement2 = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Forms ")));
    searchElement2.click();
    
    AndroidElement searchElement3 = (AndroidElement) new WebDriverWait(driver, 30).until(
    		ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Form Elements ")));
    searchElement3.click();
    
    Thread.sleep(3000);
    
    
    driver.quit();// fin prueba 1
  
        	*/
        Thread.sleep(2000);
        driver.findElementByXPath("//android.view.View[@content-desc='Framework7 Material 1.4.0']").click();
        WebElement primero=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Forms ']")));
        WebElement segundo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Notifications ']")));
        WebElement tercero=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Swipe To Delete ']")));
        
        t.longPress(longPressOptions().withElement(element(primero)).withDuration(ofSeconds(0))).moveTo(element(segundo)).release().perform(); 
        t.longPress(longPressOptions().withElement(element(segundo)).withDuration(ofSeconds(0))).moveTo(element(tercero)).release().perform(); 
        Thread.sleep(2000);
        WebElement color=driver.findElementByXPath("//android.view.View[@content-desc='Color Themes ']");
		t.tap(tapOptions().withElement(element(color))).perform();
        
        // Media Lists
        
        
        /*
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Accordion ']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Integer semper']"))).click();
   
        driver.findElementByXPath("//android.view.View[@content-desc='Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean elementum id neque nec commodo. Sed vel justo at turpis laoreet pellentesque quis sed lorem. Integer semper arcu nibh, non mollis arcu tempor vel. Sed pharetra tortor vitae est rhoncus, vel congue dui sollicitudin. Donec eu arcu dignissim felis viverra blandit suscipit eget ipsum.']").click();
        System.out.println("valor "+ driver.findElementByXPath("//android.view.View[@content-desc='Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean elementum id neque nec commodo. Sed vel justo at turpis laoreet pellentesque quis sed lorem. Integer semper arcu nibh, non mollis arcu tempor vel. Sed pharetra tortor vitae est rhoncus, vel congue dui sollicitudin. Donec eu arcu dignissim felis viverra blandit suscipit eget ipsum.']").getText());
         
        */
        
	}

}
