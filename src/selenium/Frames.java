package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scrol = driver.findElement(By.id("a077aa5e"));
		js.executeScript("arguments[0].scrollIntoView(true)",scrol);
		//method 1
		driver.switchTo().frame("a077aa5e");
		WebElement img = driver.findElement(By.xpath("//img[contains(@src,'Jmeter720.png')]"));
		img.click();
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
}
