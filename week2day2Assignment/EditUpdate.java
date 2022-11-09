package week2day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*http://leaftaps.com/opentaps/control/main

* 1	Launch the browser
* 2	Enter the username
* 3	Enter the password
* 4	Click Login
* 5	Click crm/sfa link
* 6	Click Leads link
* 7	Click Find leads
* 8	Enter first name
* 9	Click Find leads button
* 10 Click on first resulting lead
* 11 Verify title of the page
* 12 Click Edit
* 13 Change the company name
* 14 Click Update
* 15 Confirm the changed name appears
* 16 Close the browser (Do not log out)
*/
public class EditUpdate {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.id("ext-gen248")).sendKeys("praveena");
		driver.findElement(By.id("ext-gen250")).sendKeys("hari");
		driver.findElement(By.id("ext-gen252")).sendKeys("Testleaf");
		driver.findElement(By.id("ext-gen334")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("praveena")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tech Park");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		}

}
