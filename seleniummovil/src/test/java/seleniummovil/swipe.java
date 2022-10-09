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

public class swipe extends Base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		TouchAction t =new TouchAction(driver);
		//driver.findElementByXPath("//Tagname[@atribute='value']") aplicando ****
		//driver.findElementByXPath("//*[@content-desc='9']").click(); no funciona debido a que cambio la interfaz
		WebElement primero=driver.findElementByXPath("//android.widget.Button[@text='11']");
		WebElement segundo=driver.findElementByXPath("//android.widget.Button[@text='1']");
		//driver.findElementByXPath("//android.widget.EditText[@text='12']").clear();
		//driver.findElementByXPath("//android.widget.EditText[@text='12']").sendKeys("8");
		//driver.findElementByXPath("//android.widget.EditText[@text='15']").sendKeys("20");
		// hace swipe pero no bien 
	//	t.longPress(longPressOptions().withElement(element(primero)).withDuration(ofSeconds(0))).moveTo(element(segundo)).release().perform(); 
		//es la correcta per esta sentencia no se acomoda  por el cambio en la interfaz
		t.longPress(longPressOptions().withElement(element(primero)).withDuration(ofSeconds(0))).release().perform();

		
	}

}
