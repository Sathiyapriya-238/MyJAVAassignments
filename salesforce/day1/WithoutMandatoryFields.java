package salesforce.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutMandatoryFields {

	public static void main(String[] args) throws InterruptedException {
//		"Test Steps:
//		1. Login to https://login.salesforce.com
//		2. Click on toggle menu button from the left corner
//		3. Click view All and click Sales from App Launcher
//		4. Click on Opportunity tab 
//		5. Click on New button
//		6. Choose Close date as Tomorrow Date
//		7. Click on save 
//		8. Verify the Alert message (Complete this field) displayed for Name and Stage
//		Expected Result:
//		Complete this field message should be displayed for Name and Stage fields
//		Step Video:
//		https://drive.google.com/file/d/1wHnOAbyBfjU5zIb1AY62nsefNucxMK4t/view?usp=sharing"
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--diable-notifications");
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
		dr.findElement(By.xpath("//div[@title='New']")).click();
		dr.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("2/15/2023");
		dr.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		String field=dr.findElement(By.xpath("//ul[contains(@class,'errorsList slds-list_dotted')]//a")).getText();
		System.out.println("Review the following field: ");
		System.out.println(field);
		String field1=dr.findElement(By.xpath("(//ul[contains(@class,'errorsList slds-list_dotted')]//a)[2]")).getText();
		System.out.println(field1);
	}

}
