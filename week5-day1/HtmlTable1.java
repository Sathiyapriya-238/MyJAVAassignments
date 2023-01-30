package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable1 {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://html.com/tags/table/");
		List<WebElement> row1 = dr.findElements(By.xpath("(//div[@class='render'])//tr"));
		System.out.println("The number of row in table 1: "+row1.size());
		List<WebElement> column1 = dr.findElements(By.xpath("(//div[@class='render'])//th"));
		System.out.println("The number of column in table1: "+column1.size());
		List<WebElement> row2 = dr.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("The number of row in table2: "+row2.size());
		List<WebElement> column2 = dr.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("The number of column in table2: "+column2.size());
	}

}
