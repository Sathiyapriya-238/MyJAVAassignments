package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltable2 {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://html.com/tags/table/");
		
		List<WebElement> text = dr.findElements(By.xpath("(//div[@class='render'])//tr[2]/td"));
		for (int i = 0; i < text.size(); i++) {
			String text1= text.get(i).getText();
			System.out.println(text1);
		}
	}

}
