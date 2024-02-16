package HomeAssignment4;

    import java.time.Duration;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class buttonactns {
		public static void main(String[] args) throws InterruptedException { 

			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://leafground.com/button.xhtml");
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          	driver.findElement(By.xpath("//span[text()='Click']")).click();
			String verifytitle= driver.getTitle();

			   if(verifytitle.contains("Dashboard"))
			   {

				System.out.println("Title is got matched");
				} 
			    else 
			    {
				System.out.println("Title is not matched");
			    }
				driver.navigate().back();
				Thread.sleep(4000);

				Boolean disabled =driver.findElement(By.xpath("//div[@class='card'][contains(.,'Confirm if the button is disabled.Disabled')]/button")).isEnabled();

				System.out.println("Button enabled status is:" + disabled);

				WebElement buttonlocation=driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
				System.out.println("ButtonLocation: "+buttonlocation.getLocation());

				WebElement buttoncolor=driver.findElement(By.xpath("//span[text()='Save']"));
				System.out.println(buttoncolor.getCssValue("background-color"));				
				WebElement buttonHeight=driver.findElement(By.xpath("//span[text()='Image']"));

				System.out.println("buttonHeightAndwidth: "+buttonHeight.getSize().getHeight()+":"+buttonHeight.getSize().getWidth());
				driver.close();

			}

}