package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class OrderingMobile extends ProjectMethod {
	@Test
	public  void runOrderMobile()  {
		Shadow shadow=new Shadow(dr);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		WebElement click=shadow.findElementByXPath("//span[text()='Service Catalog']");
		dr.executeScript("arguments[0].click();", click);
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
	    dr.switchTo().frame(frame);
	    dr.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	    dr.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
	    dr.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
	    WebElement dropdown=dr.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	    Select drop= new Select(dropdown);
	    drop.selectByIndex(2);
	    dr.findElement(By.xpath("//label[text()='Blue']")).click();
	    dr.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
	    dr.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	    String text=dr.findElement(By.xpath("//span[@aria-live='assertive']")).getText();
	    System.out.println(text);
	    String text1=dr.findElement(By.xpath("//a[@id='requesturl']")).getText();
	    System.out.println(text1);
	    
	    
	}

}
