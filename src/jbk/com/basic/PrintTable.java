package jbk.com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTable {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //opening browser
		driver.get("file:///G:/Selenium%20document/javabykiran-Selenium-Softwares/Offline%20Website/index.html"); //offline website path
		 
		String label = driver.findElement(By.xpath("/html/body/div/div[2]/p")).getText();    // printing text sing in to pages
		System.out.println(label);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");         //email
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");                //pasword
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();            //sign in
	    driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a")).click();       ///dashboard
	    
	  for(int i=2; i<=6; i++)
	    {
	    	String text =driver.findElement(By.xpath("/html/body/div/aside/section/ul/li["+i+"]/a")).getText(); /// printing menu
	    	System.out.println(text);
	    	driver.findElement(By.xpath("/html/body/div/aside/section/ul/li["+i+"]/a")).click();    /// click all menu
	    	Thread.sleep(1000);
		  }
	    	
	    
	    
	     driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click(); ///User
	    
	    for(int i=2; i<=5; i++)      // for printing user table
	    {
	    	for(int j=1; j<=8; j++)
	    	{
	    	String lable= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i +" ]/td["+ j +"]")).getText();
	    	System.out.println(lable);   
	    	}
	    	
	    	System.out.println();
	    	
	    }
	    
	    
		/*
		 * for(int i=2; i<=5; i++) // this is for delete click button {
		 * 
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i
		 * +"]/td[8]/a/span")).click(); Thread.sleep(1000);
		 * 
		 * 
		 * 
		 * }
		 */
	    
	    
	    System.out.println("================================================");
	    driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a")).click();        /// operator
	    
	    for(int i=2; i<=6; i++)      // for printing oprator table
	    {
	    	for(int j=1; j<=6; j++)
	    	{
	    	String lable2= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i +" ]/td["+ j +"]")).getText();
	    	System.out.println(lable2);   
	    	}
	    	
	    	System.out.println();
	    }
	    
	    System.out.println("=================================================");
	    
	    driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a")).click();     ///useful link
	    
	    for(int i=1; i<=1; i++)
	    {
	    	for(int j=1; j<=3; j++)
	    	{
	    
	    
	    String text2 =driver.findElement(By.xpath("html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ i +"]/th["+ j +"]")).getText();
	    System.out.print("  "+text2);
	    
	    	}
	    	
	    	System.out.println();
	    	
	    }
	    System.out.println();
	  
	    for(int r=2; r<=7; r++)
	    {
	    	for(int k=1; k<=3; k++)
	    	{
	    		String text3 =driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+ r +"]/td["+ k +"]")).getText();
	    		System.out.print("  "+text3);
	    	}
	    	System.out.println();
	    }
	   
	    	
	    	
	    	
	    } 	
	}


	    	

	    ///html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]
///html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]
///html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]

///html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]

///html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]


///html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th[1]

///html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[1]
	


