package zachry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {

	@Test(groups={"sanity"})
	public void home()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.zachryconstructioncorp.com/");
	}
	
	@Test(groups={"Regression"})
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARJUN\\Downloads\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
