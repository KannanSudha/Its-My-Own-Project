package Sudha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement mbl = driver.findElement(By.xpath("//input[@type='text']"));
		mbl.sendKeys("Realme Mobiles",Keys.ENTER);
		
		List<WebElement> realme = driver.findElements(By.xpath("//*[contains(text(),'realme')]"));
		System.out.println("No.of Count in Realme Mobiles "+realme.size());
		for (int i = 0; i < realme.size(); i++) {
			WebElement size = realme.get(i);
			System.out.println(size.getText());
		}
			
	}

}
