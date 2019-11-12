package start;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("+919603753139"); 
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Manju@143"); 
        Robot robot = new Robot();
        
        
        driver.findElement(By.xpath("//input[@id='u_0_b']")).click();         
        driver.findElement(By.xpath("_2s25']"));
	
	}
}
