package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.siteforinfotech.com/handling-static-dynamic-tables-selenium-webdriver/");
		driver.manage().window().maximize();
		//String text=driver.findElement(By.xpath("//table[@class='wp-block-table']/tbody/tr/td[2]")).getText();
		//System.out.println(text);
		//table[@class='wp-block-table']/thead//following-sibling::tbody/tr
		int rows=driver.findElements(By.xpath("//table[@class='wp-block-table']/thead//following-sibling::tbody/tr")).size()+1;
		System.out.println("no of rows="+"  "+rows);
		int cols=driver.findElements(By.xpath("//table[@class='wp-block-table']/thead/tr/th")).size();
		System.out.println("no of columns="+"  "+cols);
		for(int r=1;r<=rows-1;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String o=driver.findElement(By.xpath("//table[@class='wp-block-table']/thead//following-sibling::tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(o+" ");
			}
		
			System.out.println();		
	}
	

}
	
}
