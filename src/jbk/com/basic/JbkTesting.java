package jbk.com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;

public class JbkTesting {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
		
		for(int i=1; i<=10; i++)
		{
		
		String label = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav[2]/div/div/div/div/div/div/div/nav[1]/ul/li["+i+"]/a")).getText();
		System.out.println(label);
		
		}
		
		for(int j=2; j<=9; j++)
		{
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/nav[2]/div/div/div/div/div/div/div/nav[1]/ul/li["+j+"]/a")).click();
		Thread.sleep(1000);
		//driver.switchTo().alert().accept(); 
		
		}
	}

}







///html/body/div[1]/div[1]/div/div/nav[2]/div/div/div/div/div/div/div/nav[1]/ul/li[2]/a
///html/body/div[1]/div[1]/div/div/nav[2]/div/div/div/div/div/div/div/nav[1]/ul/li[1]/a









///html/body/div[1]/div[1]/div/div/nav[1]/div/div/div[2]/div/div/div/div/nav[2]/ul/li[1]/a
///html/body/div[1]/div[1]/div/div/nav[1]/div/div/div[2]/div/div/div/div/nav[2]/ul/li[2]/a



