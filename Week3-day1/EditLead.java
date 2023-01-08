package wee3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	    ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		dr.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		dr.findElement(By.xpath("//div[@id='label']")).click();
		dr.findElement(By.xpath("//a[text()='Leads']")).click();
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		dr.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sathiyapriya");
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		dr.findElement(By.xpath("//a[text()='10910']")).click();
		String title = dr.getTitle();
		if(title.contains("opentaps")) {
			System.out.println("The title contains the word: "+title);
		}
		else {
			System.out.println("The title does not contain the word opentaps");
		}
		dr.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement driver=dr.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		driver.clear();
		driver.sendKeys("Wipro");
		dr.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		WebElement text=dr.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		System.out.println(text.getText());
	}
}