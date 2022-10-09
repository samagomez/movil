package seleniummovil;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestos extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//gesto TAP en elementos 
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		TouchAction t =new TouchAction(driver);
		WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement pn=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		//tap sostenido por 2 segundos
		t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		

	}

}
