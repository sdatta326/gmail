package Gmail_login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
//      WebDriver driver= new FirefoxDriver();
		driver.get("www.google.com");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.cssSelector("a.gmail-nav__nav-link:nth-child(2)")).click();
		//driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("rinidatta6@gmail.com");
		driver.findElement(By.xpath("//*[@autocomplete='current-password']")).sendKeys("abc");
		
		
	}

}
