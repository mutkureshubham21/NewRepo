package jbk.com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //opening browser
		driver.get("file:///G:/Selenium%20document/javabykiran-Selenium-Softwares/Offline%20Website/index.html"); //offline website path
		 
		String label = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();    // printing text sing in to pages
		System.out.println(label);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");         //email
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");                //pasword
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();           //sign in
		
		 driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();    ///User
		List<WebElement>  listEle=driver.findElements(By.tagName("a"));                        //using anchor tag click all anchor tag in page
		System.out.println(listEle.size());                                                    // count of all anchor tag
		
		for( WebElement element : listEle)
		{
			element.click();                                                                   //click all anchor tag sequntially
			
			Thread.sleep(1000);
		}
		    
		
	}

}
