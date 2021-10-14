package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		int size= trow.size();
		System.out.println(size);
		for(WebElement row:trow) {
			List<WebElement> tdata = row.findElements(By.tagName("td"));
			for (WebElement data:tdata) {
				String value = data.getText();
				System.out.println(value);
			}
		}
		
		
	}

}
