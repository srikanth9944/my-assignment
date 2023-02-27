package Assginment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class category {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140572.service-now.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@name='user_name' and @class='form-control']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("P-qQ7@umSYz8");
	    driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("filter")).sendKeys("My Service Categories",Keys.ENTER);
	    driver.findElement(By.xpath("//div[text()='My Service Categories']")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//button[text()='New']")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("submit_button")).click();
	}

}
