package seleniummovil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;


public class Ecomercemio {

	public static void main(String[] args)throws MalformedURLException, InterruptedException {
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
		String columnas[] = { "Converse All Star","Air Jordan 9 Retro" };
		driver.findElementById("spinnerCountry").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bahamas\"));").click();
		driver.findElementById("nameField").sendKeys("hola");
		driver.hideKeyboard();
		driver.findElementById("radioFemale").click();
		driver.findElementById("btnLetsShop").click();
		//obtiene el mensaje de error cuando no se escribe el nombre
		//String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		//  String toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		//System.out.println(toastMessage);


		double amountifvalue=0;
		double  montototalcompra=0;
		//agregando solo un producto el primer producto
		//text: ADD TO CART  id:productAddCart
		String Valor=driver.findElementById("productPrice").getText();
		String value= Valor.substring(1);
		amountifvalue=Double.parseDouble(value);
		driver.findElementById("productAddCart").click();
		;
		for( int i=0;i<=1;i++){
			MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true))" +
							".scrollIntoView(new UiSelector().text(\"" + columnas[i] + "\"))"));

			String Valor1= driver.findElementsById("productPrice").get(i).getText();
			String valueif= Valor1.substring(1);
			amountifvalue=amountifvalue+Double.parseDouble(valueif);
			driver.findElementsById("productAddCart").get(i).click();
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		String Montocompra=  driver.findElementById("totalAmountLbl").getText();
		String Montocompras= Montocompra.substring(1);
		montototalcompra=Double.parseDouble(Montocompras);

		if(montototalcompra==amountifvalue){
			System.out.println("Compra correcta");
		}
		else {
			System.out.println("Compra Fallida"); 
		}

		driver.findElementByClassName("android.widget.CheckBox").click();
		TouchAction t=new TouchAction(driver);
		WebElement tc=driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
		driver.findElement(By.id("button1")).click();
		driver.findElementById("btnProceed").click();

	}

}
