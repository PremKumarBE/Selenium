package selenium;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taskrobot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@id='email']"));
		Actions a=new Actions(driver);
		a.sendKeys(username,"prem");
		a.doubleClick(username).build().perform();
		Robot b=new Robot();
		b.keyPress(KeyEvent.VK_CONTROL);
		b.keyPress(KeyEvent.VK_C);
		b.keyRelease(KeyEvent.VK_CONTROL);
		b.keyRelease(KeyEvent.VK_C);
		WebElement password= driver.findElement(By.xpath("//input[@name='pass']"));
		password.click();
		b.keyPress(KeyEvent.VK_CONTROL);
		b.keyPress(KeyEvent.VK_V);
		b.keyRelease(KeyEvent.VK_CONTROL);
		b.keyRelease(KeyEvent.VK_V);
		
		
	}

}
