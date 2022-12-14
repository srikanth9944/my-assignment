package week3dayy2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;

public class LunchBrowser {
	public static void main(String[] args) {
		
		
		
		 ChromeDriver driver=new  ChromeDriver();
		  
		 driver.get("http:leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("Democsr");
		 
		 
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		//////Creat lead;
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SRIKANTH");
		
		driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Other");

		driver.findElement(By.name("firstNameLocal")).sendKeys("Srikanth");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Selenium Web Project");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LunchChromeDriver");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3lak");
		
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Press");
		
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Public Corporation");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("5138");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("seleniumWebDriver");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("LunchChromeDriver");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Car and Driver");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("P");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("19/06/2001");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SoftwareTester");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("6");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("heart");
		
		//Contact Imformation;
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2/285");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sriasha777@gamil.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9944885337");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Srikanth");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		
		//primary address
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("srikanth");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Dharmapuri");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Harur");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635305");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("635305");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Srikanth");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Srikanth");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("india");
		
		
				
		
	
		
		
}
}