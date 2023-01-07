package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappal {

	ChromeDriver driver;
	@BeforeTest
	
	public void beforetest() {
	//link opening
		driver = new ChromeDriver();
    driver.get("https://www.wappalyzer.com");
    }
		
		@Test
		public void verification() throws InterruptedException {
			
			driver.get("https://www.wappalyzer.com/");{
				driver.manage().window().maximize();
				Thread.sleep(2500);
				driver.findElement((By.xpath("//*[@class='v-list-item__title subtitle-2']"))).click();
				driver.findElement(By.xpath("//*[@class='Shopify]/['/html/body/div[1]/div/div/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
				driver.findElement(By.xpath("//*[@class='v-icon notranslate v-icon--left theme--dark']")).click();
				driver.findElement(By.xpath("//*[@class='v-expansion-panel-header subtitle-2 v-expansion-panel-header--active']")).clear();
				driver.findElement(By.xpath("@id='input-1771']")).sendKeys("java");
				
		 
			}
			
		
		}}
	
		
