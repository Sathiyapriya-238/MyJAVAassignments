package wee3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notificaions");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABCDEFG");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ABC@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ABC@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    Select drop=new Select(dropdown);
	    drop.selectByValue("23");
	    
	    WebElement dropdown1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	    Select drop1=new Select(dropdown1);
	    drop1.selectByVisibleText("Aug");
		
	    WebElement dropdown2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select drop2=new Select(dropdown2);
	    drop2.selectByVisibleText("1996");
	    
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
