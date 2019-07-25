package p;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello package");
		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement e=driver.findElement(By.cssSelector("input#email"));
		driver.findElement(By.cssSelector("input#email")).click();
		Actions a=new Actions(driver);
		//Action o=a.keyDown(Keys.SHIFT).sendKeys("hello").build();
		//Action o=a.keyDown(e,Keys.SHIFT).sendKeys("hello").build();
		//o.perform();
		Action o1=a.sendKeys(Keys.SHIFT).build();
		o1.perform();
		driver.findElement(By.cssSelector("input#email")).sendKeys("hello  world");
		WebElement e2=driver.findElement(By.name("firstname"));
		Action o2=a.sendKeys(e2, Keys.SHIFT).sendKeys("rINI").build();
		o2.perform();
		
		
	}

}
