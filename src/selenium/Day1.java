package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String a=driver.getCurrentUrl();
		System.out.println(a);
		String b=driver.getTitle();
		System.out.println(b);
		WebElement c=driver.findElement(By.id("email"));
		c.sendKeys("premgthala867@gmail.com");
		WebElement d=driver.findElement(By.name("pass"));
		d.sendKeys("1234");
		
	}
	

}
