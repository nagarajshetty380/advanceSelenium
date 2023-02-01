package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = WebDriverManager.chromedriver().create();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone13");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	List<WebElement> elements = driver.findElements(By.xpath("//span[@class='rush-component s-latency-cf-section']//div[@data-component-type='s-search-result']/descendant::div//h2"));
	boolean flag=false;
	/*for(int i=0;i<elements.size();i++)
	{
		System.out.println(elements.get(i).getText());
		if(elements.get(i).getText().contains("iPhone 13"))
		{
			flag=true;
		}
	}*/
	if(flag)
	{
		System.out.println("test case is pass");
	}else {
		System.out.println("test case is fail");
		
	}
	}
}
