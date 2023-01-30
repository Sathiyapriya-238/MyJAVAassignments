package week5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDrag {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.leafground.com/drag.xhtml");
		//drag me around
		WebElement drag1 = dr.findElement(By.xpath("//div[@id='form:conpnl_content']"));
		System.out.println("Befor drag: "+drag1.getLocation());
		Actions builder=new Actions(dr);
		builder.dragAndDropBy(drag1, 200, 0).perform();
		System.out.println("After drag: "+drag1.getLocation());
		//move to target
		WebElement source = dr.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement target = dr.findElement(By.xpath("//p[text()='Drop here']"));
		Actions builder1=new Actions(dr);
		builder1.dragAndDrop(source, target).perform();
		//range slider
		WebElement  drag3 = dr.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle')])[1]"));
		System.out.println(drag3.getLocation());
		Actions builder3=new Actions(dr);
		builder3.dragAndDropBy(drag3, 50, 0).perform();
	}

}
