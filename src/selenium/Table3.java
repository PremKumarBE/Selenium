package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {
	//dynamic
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		int size= trow.size();
		System.out.println(size);
		for(int i=1;i<size;i++) {
			List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
			String text = tdata.get(0).getText();
			if(text.contains("Rashtriya Chemicals")) {
				String text2 = tdata.get(3).getTagName();
				System.out.println(text2);
			}
				else {
					System.out.println("no");
				}
		}
	}

}
