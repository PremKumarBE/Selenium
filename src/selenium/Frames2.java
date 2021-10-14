package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement img = driver.findElement(By.id("a077aa5e"));
		js.executeScript("arguments[0].scrollIntoView(true)",img);
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		for(int j=1;j<=2;j++);
		try {
			driver.switchTo().frame(img);
			WebElement img1 = driver.findElement(By.xpath("//img[contains(@src,'Jmeter720.png')]"));
			img1.click();
			
		}
		catch(Exception e){
			System.out.println("there is no element");
		}
	}

				

}
