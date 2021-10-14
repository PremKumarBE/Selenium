package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("apple");
		Thread.sleep(1000);
		s.selectByVisibleText("Orange");
		Thread.sleep(1000);
		s.deselectByIndex(0);
		s.deselectByVisibleText("Orange");
		s.deselectByValue("apple");
		s.selectByValue("apple");
		//s.deselectAll();
	    WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement a:allSelectedOptions) {
			System.out.println(a.getText());
		}
		
		
	}

}
