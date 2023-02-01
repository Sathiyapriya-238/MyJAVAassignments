package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get("https://www.myntra.com/");
		WebElement men = dr.findElement(By.xpath("//a[@data-group='men']"));
		Actions builder =new Actions(dr);
		builder.moveToElement(men).perform();
		dr.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		String count=dr.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("The count: "+count);
		String jackets = dr.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		System.out.println("The jackets count: "+jackets);
		String rainJacket=dr.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		System.out.println("The rainJackets count: "+rainJacket);
		if ((rainJacket+jackets)==count) {
			System.out.println("The count is equal");
		} else {
			System.out.println("The count is not equal");
		}
		WebElement click=dr.findElement(By.xpath("//input[@value='Jackets']"));
		dr.executeScript("arguments[0].click();", click);
		dr.findElement(By.xpath("//div[@class='brand-more']")).click();
		dr.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		dr.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
		dr.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite FilterDirectory')]")).click();
		List<String> duke=new ArrayList<String>();
		List<WebElement> lists = dr.findElements(By.xpath("//div[@class='product-productMetaInfo']//h3"));
		System.out.println("lists size: "+lists.size());
		for(int i=0;i<lists.size();i++) {
			String brand=lists.get(i).getText();
			duke.add(brand);
		}
		if(duke.contains("Duke")) {
			System.out.println("All Jackets are duke brand");
		}
		WebElement sort=dr.findElement(By.xpath("//div[@class='sort-sortBy']"));
		Actions builder1=new Actions(dr);
		builder1.moveToElement(sort).perform();
		dr.findElement(By.xpath("//label[text()='Better Discount']")).click();
		String discountPrice = dr.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		System.out.println("The discout price: "+discountPrice);
		dr.findElement(By.xpath("//img[@alt='Duke Men Grey Bomber Jacket']")).click();
		//h4[text()='Men Bomber Jacket'])[1]
				//img[@alt='Duke Men Grey Bomber Jacket']
		Set<String> handles = dr.getWindowHandles();
		List<String> win=new ArrayList<String>(handles);
		dr.switchTo().window(win.get(1));
		File source=dr.getScreenshotAs(OutputType.FILE);
		File target= new File("snap/duke.png");
		FileUtils.copyFile(source, target);
		dr.findElement(By.xpath("//span[text()='Wishlist']")).click();
		dr.quit();
	}

}
