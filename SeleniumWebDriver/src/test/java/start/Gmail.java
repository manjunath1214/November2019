package start;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com");	
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("pmanjunathguptha17@gmail.com");             
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();    
        
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("manju143"); 
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
        
        
        driver.quit();
        
                
	}
}
