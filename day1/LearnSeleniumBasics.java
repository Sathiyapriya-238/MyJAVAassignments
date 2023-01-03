package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class LearnSeleniumBasics {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathiyapriya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugam");
	
		WebElement dropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(dropdown);
		drop.selectByVisibleText("Employee");
		WebElement dropdown1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop1=new Select(dropdown1);
		drop1.selectByValue("9001");
		WebElement dropdown3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2=new Select(dropdown3);
		drop2.selectByIndex(4);
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
