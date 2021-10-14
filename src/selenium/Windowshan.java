package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Windowshan {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement close= driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("mobiles",Keys.ENTER);
		Actions a=new Actions(driver);
		a.moveToElement(search);
		WebElement parent = driver.findElement(By.xpath("(//div[contains(text(),'GB)'])[1]"));
		parent.click();
	}

}