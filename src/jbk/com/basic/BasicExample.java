package jbk.com.basic;

import java.util.ArrayList;



import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); /// Dynamic Dispatch
		
		driver.get("file:///G:/Selenium%20document/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		String label = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();
		System.out.println(label);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");         //email
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");                //pasword
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();              //sign in
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).click();            //logout
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");         
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();          //user
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click(); //add user
		
		/*
		 * System.out.println("----getUserTableValue() method UrlTest Class...----");
		 * int i=1; // List tablerow = new ArrayList<WebElement>(); List<WebElement>
		 * tablerow=driver.findElements(By.tagName("tr"));
		 * System.out.println("Web Element --> "+tablerow);
		 * System.out.println("Web Element Size --> "+tablerow.size()); for(WebElement
		 * tr: tablerow){ System.out.println("----****----");
		 * System.out.println(" I = "+i+" --> "+tr.toString());
		 * System.out.println(" I = "+i+" --> "+tr.getText()); i++; }
		 */
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("shubhamcse21");                          //add username
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("7798732248");                              //add mobno
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shubhamcse21@gmail.com");                   //add email
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Java");                                    //course
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();                                               //radio button male
		
		Select listbox= new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"))); 
		listbox.selectByIndex(3);         ///for listbox 
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345**@");                    //password
		
		
		//driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("99999456"); //friend mob no. I removed friend mob no. from website
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button")).click(); /// submit button
		
		driver.switchTo().alert().accept();     ////this for pop-up message ok
		
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a")).click();        /// operator
		
		WebElement frame1 = driver.findElement(By.id("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]"));
		driver.switchTo().frame(frame1);
		List<WebElement> rowelements = driver.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]"));
			System.out.println(rowelements.size());
		
		
			
			
			//driver.findElement(By.id("Male")).click(); ///this is also for radio button
				
	
	
		
		
		
		
		
		
		
	}
}
	
