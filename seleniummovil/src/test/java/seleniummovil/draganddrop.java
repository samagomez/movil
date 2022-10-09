package seleniummovil;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class draganddrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		

		AndroidDriver<AndroidElement> driver=capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
	     WebElement origenuno=driver.findElementById("drag_dot_1");//drag_dot_2
	   WebElement destino=driver.findElementById("drag_dot_2");
	   
	    TouchAction t =new TouchAction(driver);
	    
	t.longPress(longPressOptions().withElement(element(origenuno)).withDuration(ofSeconds(2))).moveTo(element(destino)).release().perform(); 
		
		
	    
	}

}
