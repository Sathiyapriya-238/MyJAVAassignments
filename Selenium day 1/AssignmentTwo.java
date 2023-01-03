package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwo {

	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.findElement(By.id("username")).sendKeys("demosalesmanager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.partialLinkText("CRM/SFA")).click();
		dr.findElement(By.linkText("Leads")).click();
		dr.findElement(By.linkText("Create Lead")).click();
		dr.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		dr.findElement(By.id("createLeadForm_firstName")).sendKeys("Sathiya");
		dr.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		dr.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
		dr.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		dr.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium");
		dr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc123@gmail.com");
		dr.findElement(By.name("submitButton")).click();
		String title=dr.getTitle();
		System.out.println(title);
		dr.findElement(By.linkText("Duplicate Lead")).click();
		dr.findElement(By.id("createLeadForm_companyName")).clear();
		dr.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTap");
		dr.findElement(By.id("createLeadForm_firstName")).clear();
		dr.findElement(By.id("createLeadForm_firstName")).sendKeys("SathiyaPriya");
		dr.findElement(By.name("submitButton")).click();
		String title1=dr.getTitle();
		System.out.println(title1);
	}
}

