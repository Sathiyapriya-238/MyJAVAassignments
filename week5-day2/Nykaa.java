package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.get("https://www.nykaa.com/");
		WebElement element = dr.findElement(By.xpath("//a[text()='brands']"));	
		Actions bld=new Actions(dr);
		bld.moveToElement(element).perform();
		dr.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		WebElement click = dr.findElement(By.xpath("(//a[contains(text(),'Paris')])[1]"));
		dr.executeScript("arguments[0].click();", click);
		String text=dr.getTitle();
		System.out.println("The title of the page: "+text);
		dr.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		dr.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		dr.findElement(By.xpath("//span[text()='Category']")).click();
		dr.findElement(By.xpath("//span[text()='Hair']")).click();
		dr.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		dr.findElement(By.xpath("//span[text()='Shampoo']")).click();
		dr.findElement(By.xpath("//span[text()='Concern']")).click();
		dr.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String filter=dr.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		System.out.println("The filter is applied: "+filter);
		dr.findElement(By.xpath("//div[contains(text(),'Colour Protect Shampoo')]")).click();
		Set<String> handles = dr.getWindowHandles();
		List<String> win=new ArrayList<String>(handles);
		dr.switchTo().window(win.get(1));
		dr.findElement(By.xpath("//span[text()='180ml']")).click();
		String price=dr.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]")).getText();
		System.out.println("The price: "+price);
		dr.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		dr.findElement(By.xpath("//span[@class='cart-count']")).click();
		dr.switchTo().frame(0);
		String grandTotal=dr.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("The grand total is: "+grandTotal);
		dr.findElement(By.xpath("//span[text()='Proceed']")).click();
		dr.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		dr.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
		dr.findElement(By.xpath("//p[text()='Price Details']")).click();
		String amount = dr.findElement(By.xpath("//p[text()='₹259']")).getText();
		System.out.println("The final amount is: "+amount);
		if (amount.equals(grandTotal)) {
			System.out.println("The price is equal");
		} else {
			System.out.println("The price is not equal");
		}
		dr.switchTo().window(win.get(0));
		dr.quit();
	}
}
		
