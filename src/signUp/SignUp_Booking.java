package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp_Booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Email = "hamudi.als3di@gmail.com";
		String Password = "Mm12345678";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\web driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a")).click();
		driver.findElement(By.id("username")).sendKeys(Email);
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button"))
				.click();
		Thread.sleep(1000);
//      enter password and confairm password 
		driver.findElement(By.id("new_password")).sendKeys(Password);
		driver.findElement(By.id("confirmed_password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"))
				.click();
		Thread.sleep(3000);

//		click and hold button 

		WebElement book = driver.findElement(By.id("px-captcha"));

		Actions action = new Actions(driver);
		action.moveToElement(book);

		action.clickAndHold().build().perform();

	}

}
