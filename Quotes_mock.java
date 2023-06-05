package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quotes_mock{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("(//div[@class='row app-navigator'])[1]")).click();
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		
		WebElement sys = driver.findElement(By.xpath("//span[text()=' SALES']"));
		a.moveToElement(sys).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' Quotes']")).click();
		
		driver.findElement(By.id("Quotes_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Quotes_editView_fieldName_subject")).sendKeys("Subject");
		
		driver.findElement(By.id("s2id_autogen1")).click();
		driver.findElement(By.xpath("//div[text()='Delivered']")).click();
	
		driver.findElement(By.id("Quotes_editView_fieldName_validtill")).click();
		driver.findElement(By.xpath("(//th[text()='Today'])[1]")).click();
		
		driver.findElement(By.id("select2-chosen-4")).click();
		driver.findElement(By.xpath("//div[text()='UPS']")).click();
		
		driver.findElement(By.id("Quotes_editView_fieldName_shipping")).sendKeys("Shipping");
		
		driver.findElement(By.id("Quotes_editView_fieldName_account_id_create")).click();
		
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("kunal");
		
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.java.com");
		
		driver.findElement(By.id("select2-chosen-25")).click();
		
		driver.findElement(By.xpath("//div[text()='Atlas Jeniffer']")).click();
		
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("12345678905");
		
		driver.findElement(By.name("saveButton")).click();
		
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
		driver.findElement(By.id("select2-chosen-6")).click();
		driver.findElement(By.xpath("//div[text()='Marketing Group']")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//jse.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.name("copyAddressFromRight")).click();
		
		driver.findElement(By.name("copyAddressFromLeft")).click();
		 
		driver.findElement(By.id("Quotes_editView_fieldName_bill_street")).sendKeys("pune, Pune");
		
		driver.findElement(By.id("Quotes_editView_fieldName_ship_street")).sendKeys("Nagaon,pusad");
		
		driver.findElement(By.id("Quotes_editView_fieldName_bill_pobox")).sendKeys("ABs1");
		
		driver.findElement(By.id("Quotes_editView_fieldName_ship_pobox")).sendKeys("ABS2");
		
		driver.findElement(By.id("Quotes_editView_fieldName_bill_city")).sendKeys("Goa");
		
		driver.findElement(By.id("Quotes_editView_fieldName_ship_city")).sendKeys("xyz");
		
		driver.findElement(By.id("Quotes_editView_fieldName_bill_state")).sendKeys("abc");
		
		driver.findElement(By.id("Quotes_editView_fieldName_ship_state")).sendKeys("Maharastra");
		
		driver.findElement(By.id("Quotes_editView_fieldName_bill_code")).sendKeys("123456");
		
		driver.findElement(By.id("Quotes_editView_fieldName_ship_code")).sendKeys("6");
		
		driver.findElement(By.id("Quotes_editView_fieldName_bill_country")).sendKeys("India");
		
		driver.findElement(By.id("Quotes_editView_fieldName_ship_country")).sendKeys("India");
		
		driver.findElement(By.id("Quotes_editView_fieldName_description")).sendKeys(" do study");
		
//		jse.executeScript("window.scrollBy(0,100)");
//		
//		driver.findElement(By.xpath("(//span[@class='lineItemPopup cursorPointer'])[3]")).click();
//		
//		driver.findElement(By.xpath("(//input[@class='entryCheckBox'])[1]")).click();
//		
//		driver.findElement(By.xpath("//button[@class='select btn btn-default']")).click();
//		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@title='Products'])[3]")).click();
		driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
//		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("oops");
//		driver.findElement(By.name("qty_per_unit")).sendKeys("10");
//		driver.findElement(By.name("product_no")).sendKeys("AS1"); 
//		driver.findElement(By.id("s2id_autogen43")).click();
//		driver.findElement(By.xpath("(//div[text()='Hardware'])[1]")).click();
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign Out")).click();
		
	
		
		
		
		
		
		
		
		
	}

}
