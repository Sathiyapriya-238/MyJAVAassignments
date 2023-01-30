package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.chittorgarh.com/");
		dr.findElement(By.xpath("//a[@title='Stock Market']")).click();
		dr.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> row = dr.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr"));
		System.out.println(row.size());
		List<String> names = new ArrayList<String>();
		for(int i=1;i<row.size();i++) {
			String text= dr.findElement(By.xpath("//table[contains(@class,'table table-bordered table')]//tr["+i+"]/td[3]")).getText();
			names.add(text);
			System.out.println(text);
		}
		System.out.println("The size of the security list is: "+names.size());
		Set <String> names1= new LinkedHashSet<String>(names);
		System.out.println("The size of set is: "+names1.size());
		if(names.size()!=names1.size()) {
			System.out.println("There is no duplicate");
		}
		else {
			System.out.println("Duplicate is present");
		}
	}

}
