package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("prem");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Error is-  "+text);
		alert.accept();
		String text2 = alert.getText();
		System.out.println("message is-  "+text2);
		alert.accept();
		driver.close();
		
		
	}
}
