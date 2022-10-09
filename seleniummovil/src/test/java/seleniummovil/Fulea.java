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


public class Fulea {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		Integer valor=0;
		
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Abrir panel de navegación']").click();
       driver.findElementByXPath("//android.widget.CheckedTextView[@text='Configuración']").click();
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Iniciar sesión\"));").click();
       
       /* funciona validacion al inicio
       Thread.sleep(2000);
       driver.findElementById("btnSignIn").click();
	   driver.findElementById("email").sendKeys("smg581986@gmail.com");
	   driver.findElementById("btnSignIn").click();
	   driver.findElementById("password").sendKeys("smg581986");
	   driver.findElementById("btnSignIn").click();
	   
	   
	   driver.findElementById("email").clear();
	   driver.findElementById("email").sendKeys("smg581986");
	   Thread.sleep(1000);
	   driver.findElementById("btnSignIn").click();
	   
	  */
       Thread.sleep(2000);
       driver.hideKeyboard();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Regístrate']"))).click();
       
       //validando los valores requeridos 
       driver.hideKeyboard();
       Thread.sleep(2000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkTOS"))).click();
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Regístrate\"));").click();
       valor= driver.findElements(By.id("textinput_error")).size();
      
       //implementar testNG para colocar assert
       if(valor==3)
       {System.out.println("se requirieron correctamente los campos");}
       else 
       {
    	   System.out.println("No se requirieron correctamente los campos!!!!!");
       }
      
       
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Usuario']"))).sendKeys("apolonio");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Nombre']"))).sendKeys("polo");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Apellido']"))).sendKeys("Gomez");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Correo electrónico']"))).sendKeys("smg");
       driver.hideKeyboard();
      
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Regístrate\"));");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkTOS"))).click();
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Regístrate\"));").click();
       
       
       
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Usuario']"))).sendKeys("salvador");
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Nombre']"))).sendKeys("Salvador");
      // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Apellido']"))).sendKeys("Gomez");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Correo electrónico']"))).clear();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Correo electrónico']"))).sendKeys("apolo@gmail.com");
       driver.hideKeyboard();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edtPassword"))).sendKeys("hol@P1");
       driver.hideKeyboard();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edtPasswordVerify"))).sendKeys("hol@P1");
       
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//TextInputLayout[@text='Contraseña']"))).sendKeys("Masago586");
       driver.hideKeyboard();
       Thread.sleep(2000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkTOS"))).click();
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chkTOS"))).click();
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Regístrate\"));").click();
       
       
       /*funciona no se usara 
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='22/6/2021']"))).click();
      */
      // Thread.sleep(1000);
       //driver.switchTo().activeElement();
     //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='2021']"))).click();
      // WebElement primero= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='2021']")));
      
	   //WebElement segundo=driver.findElementByXPath("//android.widget.Button[@text='1']");
       
       //Correo electrónico
       //android.widget.TextView --text 2017
      // driver.findElementByXPath("//android.widget.TextView[@text='Regístrate']").click();
      // driver.findElementByXPath("//TextInputLayout[@text='Usuario']").sendKeys("salvadior");
      
       Thread.sleep(1000);
       driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Abrir panel de navegación']").click();
       System.out.println(""+wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txv_nombreusuario_menu_drawer"))).getText()) ;
       System.out.println(""+wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txv_username_menu_drawer"))).getText()) ;
       
	   //android.widget.TextView
       //txv_nombreusuario_menu_drawer
       //text Salvador Gomez
       
       //android.widget.TextView
       //txv_username_menu_drawer
       //text salvador
       
       driver.findElementByXPath("//android.widget.CheckedTextView[@text='Configuración']").click();
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cerrar sesión\"));").click();
       
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
	   
	}
	
}
