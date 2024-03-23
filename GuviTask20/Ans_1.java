package GuviTask20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ans_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath(" //span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
		String drive=driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value");
		System.out.println("The selected date is : "+ drive);
		driver.quit();
	}

}


//Output is -  The selected date is : 04/15/2024