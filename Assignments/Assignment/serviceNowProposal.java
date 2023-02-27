package Assginment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class serviceNowProposal {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140572.service-now.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		
		
		driver.findElement(By.id("filter")).sendKeys("proposal",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Srikanth");
	    driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click(); 
	}

}
