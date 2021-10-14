package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
	public static void  main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement c=driver.findElement(By.id("email"));
		c.click();
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		
	}


		
	
}
