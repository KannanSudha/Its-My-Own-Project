package Sudha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class ApplyDemoGuru {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='New Tours']")).click();
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sudha",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rani",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6783835673",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sudhakannan013@gmail.com",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("3/565 Ayyanar Colony",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Sivakasi",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TamilNadu",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("626123",Keys.TAB);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sudhakannan013@gmail.com",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456",Keys.TAB);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

}
