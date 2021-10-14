package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://10.2.52.181:8080/WebAccess/login.html");
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//to find element
		WebElement userName = driver.findElement(By.id("LoginID"));
		
		wait.until(ExpectedConditions.visibilityOf(userName));
		
		userName.sendKeys("Administrator");
		
		WebElement password = driver.findElement(By.id("Password"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("centric8");
		
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		
	
	
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(Exception.class);
		
		
		fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Centric 8']")));
		WebElement home = driver.findElement(By.xpath("//a[text()='Centric 8']"));
		System.out.println(home.getText());
		
	
	}
}
