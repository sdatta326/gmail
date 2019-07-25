import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Rscreenshot {
	static WebDriver driver;
	static int i=1;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		 driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();



		WebElement wb=driver.findElement(By.name("userName"));
		wb.sendKeys("a@gmail.com");
		WebElement ln=driver.findElement(By.name("password"));
		ln.sendKeys("1234");
		getScreenshot();

		
	}

	
	public static void getScreenshot() throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile,new File("c:\\OUTPUT\\screensd\\pic_"+i+".png"));
		
		
	}
	}

/*public static void getScreenshot() throws IOException
{
    File scrFile;
    scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    Files.copy(scrFile, new File("c:\\screens\\steps" + i + ".png"));
    i++;
}*/
