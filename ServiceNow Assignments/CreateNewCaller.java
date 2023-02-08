package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;


public class CreateNewCaller extends ProjectMethod {
	@Test
	public  void runNewCaller() {
		Shadow shadow=new Shadow(dr);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		WebElement click = shadow.findElementByXPath("//a[@aria-label='Callers']");
		dr.executeScript("arguments[0].click();", click);
		WebElement frame=shadow.findElementByXPath("//iframe[@title='Main Content']");
		dr.switchTo().frame(frame);
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement frame1 = dr.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame1.sendKeys("Sathiya");
		dr.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("S");
		dr.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc@gmail.com");
		dr.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Junior developer");
		dr.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9876543210");
		dr.findElement(By.xpath("//button[@type='submit'][1]")).click();
		dr.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sathiya",Keys.ENTER);
		String text=dr.findElement(By.xpath("(//td[@class='vt'])[2]")).getText();
		System.out.println("The new caller created: "+text);
	}

}
