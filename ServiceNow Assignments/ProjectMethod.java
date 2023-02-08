package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProjectMethod {
	public ChromeDriver dr;
	@Parameters({"url","username","password"})
	@BeforeMethod 
	public  void runProject(String url,String username, String password) {
		
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
		dr.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		dr.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		

	}
	@AfterMethod
	public void runMethod() {
		dr.close();
	}

}
