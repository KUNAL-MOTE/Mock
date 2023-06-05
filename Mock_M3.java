package Mock;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mock_M3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				 
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
					
					driver.findElement(By.xpath("(//span[text()=' Products'])[1]")).click();
				
					
					
					driver.findElement(By.id("Products_listView_basicAction_LBL_ADD_RECORD")).click();
					
					driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("java");
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_productcode")).sendKeys("7722");
					
					driver.findElement(By.id("Products_editView_fieldName_sales_start_date")).sendKeys("07-07-1999");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
					
					driver.findElement(By.id("s2id_autogen1")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[text()='LexPon Inc.']")).click();
					
					driver.findElement(By.id("s2id_autogen3")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[text()='Hardware']")).click();
					
					driver.findElement(By.id("Products_editView_fieldName_start_date")).sendKeys("07-07-2000");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
					
					driver.findElement(By.id("Products_editView_fieldName_sales_end_date")).sendKeys("07-07-2001");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
					
					driver.findElement(By.id("Products_editView_fieldName_expiry_date")).sendKeys("07-07-2002");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//td[@class='fieldValue'])[1]")).click();
					
					driver.findElement(By.id("Products_editView_fieldName_website")).sendKeys("www.Website.com");
					
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_vendor_part_no")).sendKeys("1234");
					
					driver.findElement(By.id("Products_editView_fieldName_mfr_part_no")).sendKeys("13579");
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_productsheet")).sendKeys("sheet");
					
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,300)");
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_serial_no")).sendKeys("24680");
					
					driver.findElement(By.id("s2id_autogen5")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[text()='301-Sales-Hardware']")).click();
					
					driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("350000");
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_commissionrate")).sendKeys("87.9");
					
					driver.findElement(By.id("tax1_check")).click();
					
					driver.findElement(By.id("tax2_check")).click();
					
					driver.findElement(By.id("tax3_check")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_purchase_cost")).sendKeys("450000");
					
					jse.executeScript("window.scrollBy(0,300)");
					
					driver.findElement(By.id("s2id_autogen7")).click();
					driver.findElement(By.xpath("//div[text()='Dozen']")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("Products_editView_fieldName_qty_per_unit")).sendKeys("12");
					
					driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("34");
					
					driver.findElement(By.id("Products_editView_fieldName_reorderlevel")).sendKeys("5");
					
					driver.findElement(By.id("s2id_autogen9")).click();
					driver.findElement(By.xpath("//div[text()='Support Group']")).click();
					
					driver.findElement(By.id("Products_editView_fieldName_qtyindemand")).sendKeys("9");
					
					jse.executeScript("window.scrollBy(0,300)");
					
				   driver.findElement(By.xpath("//input[@id='MultiFile1']")).sendKeys("C:\\Users\\KUNAL MOTE\\Documents\\ASUS\\document_1");

					
					driver.findElement(By.id("Products_editView_fieldName_description")).sendKeys("Thank You");
					
					driver.findElement(By.xpath("//button[text()='Save']")).click();
					
					driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
					
					driver.findElement(By.linkText("Sign Out")).click();			
					
				}
		}
		
		
		
		
		
	


