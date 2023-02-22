package Assginments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {
	private static final Object Guest = null;
	

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.get("https://www.nykaa.com/");
			driver.manage().window().maximize();
			WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		    Actions action=new Actions(driver);
		    action.moveToElement(brand).perform();
		    driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		    driver.findElement(By.linkText("L'Oreal Paris")).click();
			driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		    driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
			driver.findElement(By.xpath("//span[text()='Category']")).click();
			driver.findElement(By.xpath("(//span[@class='filter-name '])[2]")).click();
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			driver.findElement(By.xpath("//div[@class='css-43m2vm']")).click();
         	
			Set<String>w1=driver.getWindowHandles();
			for (String newWindow : w1) {
				driver.switchTo().window(newWindow);
             }
        	WebElement Mrp=driver.findElement(By.xpath("//span[@class='css-u05rr']"));
			String MRP1=Mrp.getText();
			System.out.println(MRP1);

			driver.findElement(By.xpath("//span[@class='btn-text']")).click();
			driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
			
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();

			WebElement TotalAmount=driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span"));
			String TotalAmount1=TotalAmount.getText();
			System.out.println(TotalAmount1);
			WebElement findElement = driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]"));
			findElement.click();

			if(Guest.equals(TotalAmount)) {
				System.out.println("same");

			}
			driver.quit();
		}
	}


