package HomeAssignment4;

	import java.time.Duration;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class deleteuser 
	{

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'CRM/SFA')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Leads')]")).click();
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7979797975");
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			
			Thread.sleep(4000);
			WebElement Getid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
			String leadid =Getid.getText();
			
			Getid.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			System.out.println(driver.getTitle()+"\n"+"Lead ID: "+leadid);
			String No_data_to_disp=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
			
			if(No_data_to_disp.contains("No records to display"))
			{
				
				System.out.println("Records deleted sucessfully");
			}
			else 
			{
				System.out.println("Record not deleted");
			}
			
			driver.close();			
		}

}
