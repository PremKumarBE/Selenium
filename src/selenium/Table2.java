package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 { 
	//static
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		int size= trow.size();
		System.out.println(size);
		List<WebElement> cmp= trow.get(1).findElements(By.tagName("td"));
		String webElement = cmp.get(3).getText();
		System.out.println(webElement);
	}

}
