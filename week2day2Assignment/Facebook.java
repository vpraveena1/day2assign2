package week2day2Assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("PRAVEENA");
		driver.findElement(By.name("lastname")).sendKeys("HARI");
		driver.findElement(By.name("reg_email__")).sendKeys("vpraveena1@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Asdfgh123$");
		WebElement drop1 = driver.findElement(By.id("day"));
		Select dp1= new Select(drop1);
		dp1.selectByIndex(0);
		WebElement drop2 = driver.findElement(By.id("month"));
		Select dp2=new Select(drop2);
		dp2.selectByValue("12");
		WebElement drop3 = driver.findElement(By.id("year"));
		Select dp3= new Select(drop3);
		dp3.selectByVisibleText("1989");
		driver.findElement(By.name("sex")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.close();
		}

}
