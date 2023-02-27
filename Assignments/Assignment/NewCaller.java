package Assginment2;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Collection.ArrayList;

public class NewCaller {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://dev140572.service-now.com");
		driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
     	driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("filter")).sendKeys("all",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='sys_user.first_name']")).sendKeys("Srikanth");
		driver.findElement(By.xpath("//input[@name='sys_user.last_name']")).sendKeys("P");
	
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Junoir Developer");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("9965703619");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9944885337");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("sriasha77@gmail.com");
		
	//	driver.findElement(By.xpath("//a[text()='Junior Developer']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
		
		
		
	}

}
