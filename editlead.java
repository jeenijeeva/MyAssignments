package HomeAssignment4;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editlead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestChrome");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Anu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Danny");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sharma");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("SRILAN");
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("EGR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Tester@gmail.com");
		
		WebElement State=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		
		Select selectstate = new Select(State);
		selectstate.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Add important notes");
		driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
