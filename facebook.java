package HomeAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	
	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver=new ChromeDriver(); 
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Visagan");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("crmsfa");
	        
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Vikas@testmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Vikas@testmail.com");
			
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("We#123Visagan");
			
			Select drpday =new Select (driver.findElement(By.id("day")));
			drpday.selectByValue("14");
			
			Select drpmnth =new Select (driver.findElement(By.id("month")));
			drpmnth.selectByVisibleText("Apr");
			
			Select drpyr =new Select (driver.findElement(By.id("year")));
			drpyr.selectByValue("1999");
			
			driver.close();
						

	}

}
