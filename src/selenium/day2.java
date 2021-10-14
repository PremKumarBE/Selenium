package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.FindElements;

public class day2{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text = findElement2.getText();
		System.out.println(text);
		WebElement findElement = driver.findElement(By.xpath("//button[@name='login']"));
		//findElement.click();
		String a=findElement.getAttribute("name");
		System.out.println(a);
		WebElement findElement3 = driver.findElement(By.xpath("//a[contains(text(),'password?')]"));
		String text2 = findElement3.getText();
		System.out.println(text2);
		WebElement findElement4 = driver.findElement(By.xpath("//a[starts-with(text(),'Forg')]"));
		String text3 = findElement4.getText();
		System.out.println(text3);
		
		
		
	}

}
