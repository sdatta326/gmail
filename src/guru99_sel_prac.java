import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class guru99_sel_prac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String mainWindow=driver.getWindowHandle();
		Set<String> wa=driver.getWindowHandles();
		Thread.sleep(300);
		Iterator<String> i1=wa.iterator();
		while(i1.hasNext())
		{
			String childWindow=i1.next();
			if(!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("a@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
			
		}
		driver.switchTo().window(mainWindow);
		String text=driver.findElement(By.xpath("//a[text()='Click Here']")).getText();
		System.out.println(text);
		
		//driver.get("http://demo.guru99.com/selenium/deprecated.html");
		//driver.navigate().to("http://jsbin.com/usidix/1");
		//driver.get("https://www.facebook.com/");
		//driver.get("http://demo.guru99.com/test/radio.html");
		//driver.get("https://www.facebook.com/");
		//driver.get("http://demo.guru99.com/v1/");
		/*driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("abcd");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(300);
		String stt=driver.switchTo().alert().getText();
		System.out.println(stt);
		driver.switchTo().alert().accept();
		Thread.sleep(300);
		driver.switchTo().alert().accept();*/
		
		
		//driver.findElement(By.xpath("//input[@type='text']//following::input[1]")).sendKeys("abcd1234");
		//driver.findElement(By.xpath("//input[@type='text']//following::input[1]")).sendKeys("abcd1234");
		//driver.findElement(By.xpath("//input[@type='text']//following::input[2]")).click();
		//driver.findElement(By.xpath("//input[@type='submit']//following-sibling::input")).click();
		
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

		//driver.findElement(By.xpath("//input[@type='submit' or @type='reset']")).click();
		
		//String s=driver.findElement(By.xpath("//label[starts-with(@id,'message')]")).getText();
		
		//System.out.println(s+" "+"hello");
		
		Thread.sleep(300);
		
		//driver.findElement(By.xpath("//input[@type='submit' or @type='reset']")).click();
		//String s1=driver.findElement(By.xpath("//td[text()='UserID']")).getText();
		//System.out.println(s1);
		
		//driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		//Select s=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		//Select s=new Select(driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple]'")));
		
		
		//Thread.sleep(300);
		
		
		/*s.selectByValue("ANDORRA");
		Thread.sleep(300);
		s.selectByIndex(0);
		Thread.sleep(300);
		s.selectByVisibleText("AMERICAN SAMOA");
		Thread.sleep(300);
		if(s.isMultiple())
			s.deselectAll();/*




		System.out.println(driver.getTitle());

		//driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("lastname");
		/*List<WebElement> elements=driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(300);

		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getAttribute("value"));
		}*/

		//List<WebElement> ele=driver.findElements(By.cssSelector("input#checkbox"));
		/*List<WebElement> ele=driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(300);
		System.out.println(ele.size());
		for(int j=0;j<ele.size();j++)
		{
			System.out.println(ele.size());
			Thread.sleep(300);
			ele.get(j).click();
			if(ele.get(j).isSelected())
			{
				System.out.println("system is now toggled on"+" "+ele.get(j));
			}
			Thread.sleep(300);
			ele.get(j).click();
			if(!ele.get(j).isSelected())
			{
				System.out.println("system is now toggled off"+ele.get(j));
			}
		}*/



		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("input#email")).sendKeys("username");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("username");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("1234");
		//WebDriverWait w=new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("username")));
		//driver.findElement(By.id("username")).sendKeys("tutorial");

		/*String at=driver.getTitle();
		String et="guru99";
		if(at.equals(et))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");	
		}
		driver.switchTo().frame("classFrame");
		Thread.sleep(300);
		WebElement w=driver.findElement(By.linkText("Tree"));
		Assert.assertTrue(w.isDisplayed());

		driver.findElement(By.linkText("Tree")).click();*/
		//driver.findElement(By.tagName("input")).click();
		//String t=driver.switchTo().alert().getText();
		//System.out.println(t);

		//driver.switchTo().alert().accept();


		//driver.findElement(By.id("html5div")).clear();
		//driver.findElement(By.id("html5div")).click();
		//driver.findElement(By.id("html5div")).sendKeys("hello");



		//driver.close();





	}

}
