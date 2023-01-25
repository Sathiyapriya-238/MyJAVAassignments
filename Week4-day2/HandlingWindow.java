package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.leafground.com/window.xhtml");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = dr.getWindowHandles();
		List<String> handle=new ArrayList<String>(windowHandles);
		dr.switchTo().window(handle.get(1));
		System.out.println(dr.getTitle());
		dr.close();
		dr.switchTo().window(handle.get(0));
		dr.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = dr.getWindowHandles();
		List<String> handle1=new ArrayList<String>(windowHandles1);
		dr.switchTo().window(handle1.get(1));
		System.out.println(dr.getTitle());
		dr.close();
		dr.switchTo().window(handle1.get(0));
		dr.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles2 = dr.getWindowHandles();
		List<String> handle2=new ArrayList<String>(windowHandles2);
		dr.switchTo().window(handle2.get(1));
		System.out.println(dr.getTitle());
		dr.close();
		dr.switchTo().window(handle2.get(0));
		dr.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = dr.getWindowHandles();
		List<String> handle3=new ArrayList<String>(windowHandles3);
		dr.switchTo().window(handle3.get(1));
		System.out.println(dr.getTitle());
		dr.close();
		dr.switchTo().window(handle2.get(0));
		dr.quit();
	}

}
