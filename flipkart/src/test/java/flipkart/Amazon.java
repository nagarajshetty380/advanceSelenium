package flipkart;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone13");
		  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 List<WebElement> element = driver.findElements(By.xpath("//span[@class='rush-component s-latency-cf-section']//div[@data-component-type='s-search-result']/descendant::div//h2"));
			//boolean flag=false;
		 
		 assertEquals(false, "iphone13");
		 
		if(element.contains("iphone13")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		driver.close();
	}

}
