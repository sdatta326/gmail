package Gmail_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
		driver.findElement(By.name("identifier")).sendKeys("rinidatta6@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#identifierNext > content:nth-child(3) > span:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@autocomplete='current-password']")).sendKeys("abc");
		driver.findElement(By.xpath("//span[.='Next']")).click();

	}

}
