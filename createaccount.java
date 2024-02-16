package HomeAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Aradhana");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys( "Selenium Automation Tester.");
		
		Select industype =new Select (driver.findElement(By.xpath("//select[@name='industryEnumId']")));
		industype.selectByValue("IND_SOFTWARE");
		
		Select ownshp = new Select (driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		ownshp.selectByVisibleText("S-Corporation");
		
		Select src = new Select (driver.findElement(By.xpath("//select[@name='dataSourceId']")));
		src.selectByValue("LEAD_EMPLOYEE");
		
		Select mrcham = new Select (driver.findElement(By.xpath("//select[@name='marketingCampaignId']")));
		mrcham.selectByIndex(6);
		
		Select statpr = new Select (driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		statpr.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		WebElement findacctname= driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr[1]/td[2]"));
		findacctname.getText();
		
		Thread.sleep(3000);
		if (findacctname.getText().contains("Aradhana"))
		{
			System.out.println("Account is added successfully");
		}
		else
		{
			System.out.println("Account is not available");
		}
		
		driver.close();	
	}

}
