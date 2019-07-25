import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class prac_sel_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//String baseUrl = "http://www.facebook.com/";
		String baseUrl = "http://demo.guru99.com/test/tooltip.html";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(300);
		WebElement e=driver.findElement(By.cssSelector("a#download_now"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		//String at=driver.findElement(By.partialLinkText("notes")).getText();
		String at=driver.findElement(By.xpath("//a[@href='/release-notes']")).getText();
		//System.out.println(at);
		String et="What's new in 3.2";
		if(at.equals(et))
		{
			System.out.println("passed");
		}
		/*WebElement txtUsername = driver.findElement(By.id("email"));
		Actions a=new Actions(driver);
		Action d=
		a.moveToElement(txtUsername).click()
		.keyDown(txtUsername,Keys.SHIFT).sendKeys("hello").keyUp(txtUsername,Keys.SHIFT)
		.doubleClick(txtUsername).contextClick().build();
		d.perform();*/
		
	
		

		
	}

}
