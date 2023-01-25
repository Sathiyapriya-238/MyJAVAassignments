package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.leafground.com/frame.xhtml");
		dr.switchTo().frame(0);
		WebElement click1=dr.findElement(By.xpath("(//button[@id='Click'])[1]"));
		click1.click();
		System.out.println(click1.getText());
		dr.switchTo().defaultContent();
		
		
		dr.switchTo().frame(2);
		
		dr.switchTo().frame("frame2");
		WebElement click2=dr.findElement(By.xpath("//button[text()='Click Me']"));
		click2.click();
		System.out.println(click2.getText());
	}

}
