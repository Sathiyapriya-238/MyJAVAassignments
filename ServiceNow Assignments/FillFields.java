package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class FillFields extends ProjectMethod {
	@Test
	public  void runFields()  {
		Shadow shadow=new Shadow(dr);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge");
		WebElement click = shadow.findElementByXPath("//mark[text()='Knowledge']");
		dr.executeScript("arguments[0].click();", click);
		WebElement frame=shadow.findElementByXPath("//iframe[@title='Main Content']");
		dr.switchTo().frame(frame);
		dr.findElement(By.xpath("//span[text()='Create an Article']")).click();
		dr.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
		dr.findElement(By.xpath("(//span[text()='IT'])[1]")).click();
		//dr.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("Jav");
		//dr.findElement(By.xpath("//button[@name='lookup.kb_knowledge.kb_category']")).click();
		//WebElement frame1=dr.findElement(By.xpath("//iframe[@title='AC kb_knowledge kb_knowledge_base']"));
		//dr.switchTo().frame(frame1);
		//dr.findElement(By.xpath("(//div[@class='list-item arrow']/following-sibling::div)[3]")).click();
		//dr.findElement(By.xpath("//div[@class='list-item colview-active']")).click();
		//dr.findElement(By.id("ok_button")).click();
		dr.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("To describe about the advantages ofJava");
		dr.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
	}

}
