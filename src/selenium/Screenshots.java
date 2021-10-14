package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class Screenshots {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prem\\workspace\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		s.selectByIndex(0);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//screenshots.png");
		FileUtils.copyFile(screenshotAs, dest);
	
	}

}
