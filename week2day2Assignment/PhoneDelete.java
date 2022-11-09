package week2day2Assignment;
/*http://leaftaps.com/opentaps/control/main

Delete Lead:
1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Phone
9	Enter phone number
10	Click find leads button
11	Capture lead ID of First Resulting lead
12	Click First Resulting lead
13	Click Delete
14	Click Find leads
15	Enter captured lead ID
16	Click find leads button
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhoneDelete {

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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.id("ext-gen270")).sendKeys("1234567890");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("11684")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
       //driver.findElement(By.linkText("Name and ID")).click();		
		//driver.findElement(By.id("x-form-el-ext-gen246")).sendKeys("11684");
		driver.findElement(By.id("ext-gen246")).sendKeys("11684");
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.close();
	}

}
