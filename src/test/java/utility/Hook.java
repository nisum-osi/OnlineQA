/**
 * 
 */
package utility;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * @author CHIRAG
 *
 */
public class Hook {

	private static WebDriver driver;
	
	@Before("@web")
	public void setUp()
	{
	    System.out.println("in hook file");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

//	public Hook()
//	{
//		System.out.println(System.getProperty("in hook class"));
////		System.out.println(System.getProperty("user.dir"));
////		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
//////		driver= new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//	}
	
//	@Before("@appium")
//	public void setUpAppium() throws MalformedURLException
//	{
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 9");
//		cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"//App//ApiDemos.apk");
//		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
	
//	@After
//	public void tearDown()
//	{
//		driver.quit();
//	}

//	public void browserclose(){driver.quit();}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
