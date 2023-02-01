package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.amazon.in/");
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price=dr.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("The price: "+price);
		String customerRate=dr.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[2]")).getText();
		System.out.println("The customer rating: "+customerRate);
		WebElement customerPercent = dr.findElement(By.xpath("(//span[@class='a-icon-alt'])[2]"));
		Actions builder=new Actions(dr);
		builder.moveToElement(customerPercent).perform();
		System.out.println("The customer Perentage: "+customerPercent.getText());
		dr.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color')])[2]")).click();
		Set<String> handles = dr.getWindowHandles();
		List<String> win=new ArrayList<String>(handles);
		dr.switchTo().window(win.get(1));
		File source=dr.getScreenshotAs(OutputType.FILE);
		File target= new File("snap/oneplus.png");
		FileUtils.copyFile(source, target);
		dr.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		String subTotal=dr.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The subtotal: "+subTotal);
		if (subTotal.equals(price)) {
			System.out.println("The price is equal");
		} else {
			System.out.println("The price is not equal");
		}
		dr.quit();
	}

}
