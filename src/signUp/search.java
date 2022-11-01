package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
//		Thread.sleep(3000);
		driver.findElement(By.id("ss")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]")).click();
		driver.findElement(By.className("sb-searchbox__button")).click();
	}

}
