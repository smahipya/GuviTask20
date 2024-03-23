package GuviTask20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ans_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.guvi.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@class,'nav-link btn btn-primary text-white px-4')]")).click();
		driver.findElement(By.id("name")).sendKeys("Test User");
		driver.findElement(By.id("email")).sendKeys("testuser015@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password@123");
		driver.findElement(By.id("mobileNumber")).sendKeys("9677672869");
		driver.findElement(By.id("signup-btn")).click();
		//driver.close();

	}

}
