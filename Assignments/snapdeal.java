package Assginments;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {
	private static final String FileUtils = null;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		WebElement ele1 = driver.findElement(By.xpath("(//span[contains(text(),' Fashion')])[1]"));
		Actions bulider = new Actions(driver);
		bulider.moveToElement(ele1).perform();
		driver.findElement(By.className("linkTest")).click();
		WebElement text = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		

		
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		WebElement ele2 = driver.findElement(By.className("navFiltersPill"));
		System.out.println(ele2.getText());
		WebElement ele3 = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		bulider.moveToElement(ele3).perform();
		driver.findElement(By.xpath("(//div[@supc='SDL901001171'])[2]")).click();
		String price = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
		System.out.println(price);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snap/img.png");
		
	//	FileUtils.copyFile(screenshotAs, destination);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		driver.quit();
		
		
		
		

	}
	
}

