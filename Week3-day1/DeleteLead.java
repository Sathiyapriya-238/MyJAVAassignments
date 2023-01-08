package wee3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		dr.findElement(By.xpath("//span[text()='Phone']")).click();
		dr.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("987654321");
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement driver=dr.findElement(By.xpath("(//td[contains(@class,'x-grid3-col x-grid3-cell x')]//a)[1]"));
		String id = driver.getText();
		System.out.println("Lead ID: "+id);
		driver.click(); 
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[text()='Delete']")).click();
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		dr.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement driver1=dr.findElement(By.xpath("//div[@class='x-paging-info']"));
		String title1 = driver1.getText();
		if (title1.contains("No records to display")) {
			System.out.println("The Record deleted successfuly");
		} else {
			System.out.println("The record does not deleted");
		}
		dr.close();
	}

}
