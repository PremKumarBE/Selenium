package selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement target = driver.findElement(By.xpath("(//ol[@style='list-style:none'])[1]"));
		a.dragAndDrop(bank, target).build().perform();
	    WebElement amount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement target2 = driver.findElement(By.xpath("(//ol[@style='list-style:none'])[2]"));
		a.dragAndDrop(amount, target2).build().perform();
		
		WebElement loan = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement target3 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		a.dragAndDrop(loan, target3).build().perform();
	    WebElement loanamount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	    WebElement target4 = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		a.dragAndDrop(loanamount, target4).build().perform();
		
		
	}
}
