package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/waits.xhtml");
		//visibility
		WebElement visible = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
        visible.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(visible));
        String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
        System.out.println(text);
        //invisibility
        WebElement visible1 = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
        visible1.click();
        //WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait1.until(ExpectedConditions.invisibilityOf(visible1));
        //wait for click
        //WebElement visible2=driver.findElement(By.xpath("//span[text()='Click First Button']"));
        //visible2.click();
        //wait for textchange
        WebElement visible3=driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
        visible3.click();
        //WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(5));
        //wait2.until(ExpectedConditions.invisibilityOf(visible3));
        
        	}

}
