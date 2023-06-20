package practice.comBaseclass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	
	
	public static void browserLaunch(String browser) {
		System.setProperty("https.proxyHost", "myProxy");
		System.setProperty("https.proxyPort", "80");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", browser);
			driver=new EdgeDriver();
		}
windowMax();
	}
	
	public static void windowMax() {
driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static Boolean elementIsDispalyed(WebElement element) {
		boolean flag=false;
		try {
			flag=element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Element not visible : "+e.getMessage());
		}
return flag;
	}
	
	public static void elementSendkeys(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("unable to Enter values : "+e.getMessage());
		}

	}
	
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("unable to Click : "+e.getMessage());
		}

	}
	
	public static String getText(WebElement element) {
		String text=null;
		try {
			text=element.getText();
		} catch (Exception e) {
			System.out.println("Unable to Fecth Text : "+e.getMessage());
		}
return text;
	}
	
	public static void driverQuit() {
		driver.quit();

	}
	
	public static byte[] takescreenshotForReport() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
	
	public static void elementSelect(WebElement element,String option, String value) {
	Select sc=new Select(element);
	
	if (option.equalsIgnoreCase("text")) {
		sc.selectByVisibleText(value);
	}else if (option.equalsIgnoreCase("value")) {
		sc.selectByValue(value);
	}else if (option.equalsIgnoreCase("index")) {
		sc.selectByIndex(Integer.parseInt(value));
	}

	}
	
}
