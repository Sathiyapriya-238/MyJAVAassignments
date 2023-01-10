package week2.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFour {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.leafground.com/select.xhtml");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropdown=dr.findElement(By.className("ui-selectonemenu"));
		Select drop=new Select(dropdown);
		drop.selectByVisibleText("Selenium");
		
		
		dr.findElement(By.xpath("//label[text()='Select Country']")).click();
		dr.findElement(By.xpath("//li[text()='India']")).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//label[text()='Select City']")).click();
		dr.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@type='button']/span")).click();
		dr.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//label[text()='Select Language']")).click();
		dr.findElement(By.xpath("//li[text()='English']")).click();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//label[text()='Select Values']")).click();
		dr.findElement(By.xpath("//li[text()='Two']")).click();
		
		dr.close();
		
	}

}
