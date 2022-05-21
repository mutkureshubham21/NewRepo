package jbk.com.dropdownlist;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();         /// Dynamic Dispatch
		driver.get("file:///G:/Selenium%20document/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/add_user.html");
		//add user path
		
		WebElement we= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		//path of drop down list
		Select select= new Select(we);
		select.selectByIndex(2);
	
		//	select.selectByIndex(-2);    //runtime error no such element found
		
		select.selectByValue("HP");
	
		//	select.selectByValue("Hp");  //runtime error no such element exception
		
		select.selectByVisibleText("Punjab");
		
		List<WebElement> listEx=select.getOptions();
		
		System.out.println(listEx.size());
		
	
		for (WebElement webElement : listEx) 
			
		{
			String ss="--Select State--";
			if(webElement.getText()!=ss)
			
			
			System.out.println(webElement.getText());
		}
		
		
	}
}



///html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select