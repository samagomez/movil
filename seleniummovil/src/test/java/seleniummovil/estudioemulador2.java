package seleniummovil;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class estudioemulador2 extends Base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.findElementByAndroidUIAutomator("atributo("value")").click();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//driver.findElementsByAndroidUIAutomator("new UISelector().property(value)").size();
		driver.findElementsByAndroidUIAutomator("new UISelector().clickable(true)").size();
	}

}



