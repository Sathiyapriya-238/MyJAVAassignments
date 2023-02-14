package salesforce.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditOpportunity {

	public static void main(String[] args) throws InterruptedException {
//		"Test Steps:
//		1. Login to https://login.salesforce.com
//		2. Click on toggle menu button from the left corner
//		3. Click view All and click Sales from App Launcher
//		4. Click on Opportunity tab 
//		5. Search the Opportunity 'Salesforce Automation by *Your Name*'
//		6. Click on the Dropdown icon and Select Edit
//		7. Choose close date as Tomorrow date
//		8. Select 'Stage' as Perception Analysis
//		9. Select Deliver Status as In Progress
//		10. Enter Description as SalesForce
//		11. Click on Save and Verify Stage as Perception Analysis
//
//		Expected Result:
//		The Oppurtunity is Edited Successfully
//		Step Video:
//		https://drive.google.com/file/d/1Xmc9WGxMLOVcTMQeq9UK_gGNSqnrHTON/view?usp=sharing"
//
		ChromeOptions option =new ChromeOptions();
		option.addArguments("---disable notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.get("https://login.salesforce.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		dr.findElement(By.id("password")).sendKeys("Leaf@123");
		dr.findElement(By.id("Login")).click();
		dr.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		dr.findElement(By.xpath("//button[text()='View All']")).click();
		dr.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement st=dr.findElement(By.xpath("//span[text()='Opportunities']"));
		dr.executeScript("arguments[0].click();", st);
		dr.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Salesforce Automation by Sathiyapriya",Keys.ENTER);
		Thread.sleep(2000);
		WebElement click=dr.findElement(By.xpath("(//span[text()='Show Actions'])[1]"));
		dr.executeScript("arguments[0].click();", click);
		dr.findElement(By.xpath("(//li[@data-aura-class='uiMenuItem']//a)[1]")).click();
		WebElement date=dr.findElement(By.xpath("//input[@name='CloseDate']"));
		date.clear();
		date.sendKeys("2/15/2023");
		dr.findElement(By.xpath("(//button[@role='combobox'])[2]")).click();
		WebElement sl=dr.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']"));
		dr.executeScript("arguments[0].click();", sl);
		dr.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		String text=dr.findElement(By.xpath("(//span[@data-aura-class='forceInlineEditCell'])[4]")).getText();
		System.out.println("The  stage is: "+text);
		if (text.contains("Perception")) {
			System.out.println("The opportunity is edited successfully");
		} else {
			System.out.println("The opportunity is not edited successfully");
		}
		
	}

}
