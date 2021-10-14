package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement countryname = driver.findElement(By.name("country"));
		Select s=new Select(countryname);
		//s.selectByIndex(3);
		//s.selectByValue("ALBANIA");
		s.selectByVisibleText("albania");
		Thread.sleep(2000);
		
		
	}
}