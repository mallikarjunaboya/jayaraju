package zachry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {

	
	@Test(groups={"sanity"})
	public void regist()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
