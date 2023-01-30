package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Menuleaf {

	public static void main(String[] args) throws IOException {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.leafground.com/menu.xhtml");
		dr.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
		//mouseHover
		WebElement element = dr.findElement(By.xpath("(//span[text()='New'])[1]"));
		Actions builder = new Actions(dr);
		builder.moveToElement(element).perform();
		WebElement element1 = dr.findElement(By.xpath("(//span[text()='Orders'])[1]"));
		Actions builder1 = new Actions(dr);
		builder1.moveToElement(element1).perform();
		WebElement element2 = dr.findElement(By.xpath("(//span[text()='Shipments'])[1]"));
		Actions builder2 = new Actions(dr);
		builder2.moveToElement(element2).perform();
		//right click-->contextClick()
		WebElement element3 = dr.findElement(By.xpath("//h5[text()='Context Menu']"));
		Actions builder3=new Actions(dr);
		builder3.contextClick(element3).perform();
		//take screenShot
		File source=dr.getScreenshotAs(OutputType.FILE);
		File target= new File("snap/rightclick.png");
		FileUtils.copyFile(source, target);
	}

}
