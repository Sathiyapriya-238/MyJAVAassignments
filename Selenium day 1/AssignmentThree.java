package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		dr.findElement(By.id("username")).sendKeys("demosalesmanager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.partialLinkText("CRM/SFA")).click();
		dr.findElement(By.linkText("Accounts")).click();
		dr.findElement(By.linkText("Create Account")).click();
		dr.findElement(By.xpath("//*[@id='accountName']")).sendKeys("Limited Account");
		dr.findElement(By.xpath("//*[@name='description']")).sendKeys("Selenium Automation Tester");
		dr.findElement(By.xpath("//*[@id='groupNameLocal']")).sendKeys("SathiyaPriya");
		dr.findElement(By.xpath("//*[@id='officeSiteName']")).sendKeys("Testleaf");
		dr.findElement(By.xpath("//*[@name='annualRevenue']")).sendKeys("8L");
		WebElement dropdown=dr.findElement(By.name("industryEnumId"));
		Select drop=new Select(dropdown);
		drop.selectByValue("IND_SOFTWARE");
		WebElement dropdown1=dr.findElement(By.name("ownershipEnumId"));
		Select drop1=new Select(dropdown1);
		drop1.selectByVisibleText("S-Corporation");
		WebElement dropdown2=dr.findElement(By.id("dataSourceId"));
		Select drop2=new Select(dropdown2);
		drop2.selectByValue("LEAD_EMPLOYEE");
		WebElement dropdown3=dr.findElement(By.name("marketingCampaignId"));
		Select drop3=new Select(dropdown3);
		drop3.selectByIndex(5);
		WebElement dropdown4=dr.findElement(By.id("generalStateProvinceGeoId"));
		Select drop4=new Select(dropdown4);
		drop4.selectByValue("TX");
		dr.findElement(By.xpath("//*[@class='smallSubmit']")).click();
	}

}
