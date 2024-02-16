package HomeAssignment4;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver; 

	public class scforcheckbox {

		public static void main(String[] args) throws InterruptedException
		{

			ChromeDriver driver= new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://leafground.com/checkbox.xhtml");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement DG=driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"));

			DG.click();
			DG.isSelected();

			driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[2]")).click();

			String checkmsg=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();

			if(checkmsg.contains("Checked")) 
			{

				System.out.println("Expected message got displayed");
			}
			else 
			{

				System.out.println("Expected message is not displayed");
			}

			WebElement lang=driver.findElement(By.xpath("(//table[@class='ui-selectmanycheckbox ui-widget']/tbody/tr/td/div)[1]"));

			lang.click();
			lang.isSelected();

			Thread.sleep(3000);
			WebElement tricolour=driver.findElement(By.xpath("//div[contains(@data-iconstates,'[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]')]"));

			tricolour.click();

			String tricolourstate=driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();

			if(tricolourstate.contains("state= 1"))
			{

				System.out.println("State 1 message displayed");
			}
			else 
			{ 
				System.out.println("State message is not displayed");
			}
			WebElement toggleswitch=driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
            toggleswitch.click();
            
            String toggleswitchtext=driver.findElement(By.xpath("//div[@class='ui-growl-message']")).getText();

			if(toggleswitchtext.contains("Checked")) 
			{

				System.out.println("Message displayed");
			}
			else 
			{

				System.out.println("Message not got displayed");
			}
			Boolean disabledcheckbox=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
			System.out.println("Button enabled Status is : "+disabledcheckbox);			
			WebElement multiselect=driver.findElement(By.xpath("//div[@role='combobox']"));

			multiselect.click();

			WebElement checkbox=driver.findElement(By.xpath("//div[contains(@class,'ui-widget-header ui-corner-all ui-selectcheckboxmenu-header ui-helper-clearfix')]/div[@class='ui-chkbox ui-widget']"));

			checkbox.click();
            System.out.println(driver.getTitle());

			driver.close();

			}

}
