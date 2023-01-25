package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.findElement(By.id("username")).sendKeys("demosalesmanager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.partialLinkText("CRM/SFA")).click();
		dr.findElement(By.xpath("//a[text()='Contacts']")).click();
		dr.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		dr.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
		Set<String> windowHandles = dr.getWindowHandles();
		List<String> handles=new ArrayList<String>(windowHandles);
		dr.switchTo().window(handles.get(1));
		dr.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		dr.switchTo().window(handles.get(0));
		dr.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = dr.getWindowHandles();
		List<String> handles1=new ArrayList<String>(windowHandles1);
		dr.switchTo().window(handles1.get(1));
		dr.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[2]")).click();
		dr.switchTo().window(handles1.get(0));
		dr.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = dr.switchTo().alert();
		alert.accept();
		String title = dr.getTitle();
		System.out.println(title);
	}

}
