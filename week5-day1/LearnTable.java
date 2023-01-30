package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearnTable {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://leafground.com/table.xhtml");
		//row count
		List<WebElement> rows = dr.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
		System.out.println("The row size is: "+rows.size());
		//column count
		List<WebElement> column = dr.findElements(By.xpath("(//table[@role='grid'])[2]//tr/th"));
		System.out.println("The column size is: "+column.size());
		//get a particular value
		WebElement text1 = dr.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]/td[4]"));
		System.out.println("The particular value is: "+text1.getText());
		//dynamic value
		System.out.println("Th name of the representative: ");
		for (int i = 1; i < rows.size(); i++) {
			WebElement representative = dr.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td[3]"));
			String names=representative.getText();
			System.out.println(names);
		}
	}

}
