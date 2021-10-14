package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3Actions {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			Actions a=new Actions(driver);
			WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
			//a.click(findElement2).perform();
			a.moveToElement(findElement2);
			WebElement c=driver.findElement(By.id("email"));
			a.sendKeys(c,"prem").perform();
			a.doubleClick().perform();
			a.contextClick().perform();

}
}