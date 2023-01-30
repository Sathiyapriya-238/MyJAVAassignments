package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDrop {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.jqueryui.com/droppable/");
		dr.switchTo().frame(0);
		WebElement source = dr.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = dr.findElement(By.xpath("//p[text()='Drop here']"));
		Actions builder = new Actions(dr);
		builder.dragAndDrop(source, target).perform();
	}

}
