package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewProposal extends ProjectMethod {
	@Test
	public  void runNewProposal() {
		Shadow shadow=new Shadow(dr);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@aria-label='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Proposals");
		WebElement click=shadow.findElementByXPath("//span[@class='item-icon']");
		dr.executeScript("arguments[0].click();", click);
		WebElement frame=shadow.findElementByXPath("//iframe[@title='Main Content']");
		dr.switchTo().frame(frame);
		dr.findElement(By.xpath("//button[@type='submit']")).click();
	    dr.findElement(By.xpath("//input[@data-type='pick_list']")).sendKeys("Request for help");
	    //dr.findElement(By.xpath("//span[text()='Request for help']")).click();
	    dr.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
	    String number=dr.findElement(By.xpath("//a[@class='linked formlink']")).getText();
	    System.out.println("The number is: "+number);
	    String description=dr.findElement(By.xpath("(//td[@class='vt'])[2]")).getText();
	    System.out.println("The template description is: "+description);
	}

}
