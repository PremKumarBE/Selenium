package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavAS {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//sendkeys
		js.executeScript("arguments[0].setAttribute('value','prem')",name);
		WebElement findElement3 = driver.findElement(By.xpath("//a[contains(text(),'password?')]"));
		//click
		//js.executeScript("arguments[0].click()",findElement3 );
		//scroll full down
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//scroll like y axis
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-400)");
		//scrol based on element down

		
		
	    WebElement findElement = driver.findElement(By.xpath("//span[contains(text(),' 2021')]"));
	  //scrol based on element up
	    Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView(true)",findElement);
		js.executeScript("arguments[0].scrollIntoView(false);",name);
	
		
	}
}
