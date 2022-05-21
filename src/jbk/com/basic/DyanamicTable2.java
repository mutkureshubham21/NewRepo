package jbk.com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicTable2 {
	
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
				/*
				 * List<WebElement> listoftr =driver.findElements(By.xpath(
				 * "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr"));
				 * 
				 * for(int i=2; i<=listoftr.size(); i++) { String text
				 * =driver.findElement(By.xpath("/html/body/div/aside/section/ul/li["+ i
				 * +"]/a")).getText(); /// printing menu System.out.println(text);
				 * driver.findElement(By.xpath("/html/body/div/aside/section/ul/li["+i+"]/a")).
				 * click(); /// click all menu Thread.sleep(1000); }
				 */
			 
			List<WebElement> listofdata =driver.findElements(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]"));
			 
			   for(int r=2; r<=listofdata.size(); r++)
			    {
			    	for(int j=1; j<=listofdata.size(); j++)
			    	{
			    	String lable= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ r +" ]/td["+ j +"]")).getText();
			    	System.out.println(lable);   
			    	}
			    	
			    }
               
		}
		
}