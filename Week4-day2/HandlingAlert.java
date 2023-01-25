package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("https://www.leafground.com/alert.xhtml");
		//Simple alert
		dr.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Alert alert1 = dr.switchTo().alert();
		alert1.accept();
		WebElement text=dr.findElement(By.xpath("//span[@id='simple_result']"));
		System.out.println(text.getText());
		//Alert Confirm dialog
		dr.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert alert2 = dr.switchTo().alert();
		alert2.dismiss();
		WebElement text1=dr.findElement(By.xpath("//span[@id='result']"));
		System.out.println(text1.getText());
		//sweet alert Inspectable
		//dr.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		//dr.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
		//dr.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		//dr.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		//Alerts
		dr.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert3 = dr.switchTo().alert();
		alert3.sendKeys("Sathiyapriya");
		alert3.accept();
		WebElement text3=dr.findElement(By.xpath("//span[@id='confirm_result']"));
		System.out.println(text3.getText());
		//Sweet Alert Confirmation inspectable
		//WebElement click1=dr.findElement(By.xpath("//span[text()='Delete']"));
		//dr.executeScript("arguments[0].click();", click1);
		//dr.findElement(By.xpath("//span[text()='Yes']")).click();
		dr.close();
			}

}
