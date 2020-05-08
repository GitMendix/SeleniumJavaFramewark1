package login;

 
import org.testng.Assert;
import org.testng.annotations.*;
 
import org.openqa.selenium.*; 
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Login_Neg01 extends BaseTest {
  private WebDriver driver;
   
 

  @Test
  public void testNegative() throws Exception {
	
	  // creates a toggle for the given test, adds all log events under it    
     test= extent.createTest("Mendix Application Login","Mendix  Login Condition verify for : XXXXXXX User name");
     
    driver.get("http://13.232.180.243/login.html");
    
    
     test.pass("Navigated to login page1");
    
    // log(Status, details)
    test.log(Status.INFO, "This step shows usage of log1(status, details)");
    
    driver.findElement(By.cssSelector("#usernameInput")).click();
    driver.findElement(By.cssSelector("#usernameInput")).clear();
    driver.findElement(By.cssSelector("#usernameInput")).sendKeys("ADMNN");
    driver.findElement(By.cssSelector("#passwordInput")).clear();
    driver.findElement(By.cssSelector("#passwordInput")).sendKeys("Mendix257@");
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-eye-close")).click();
    driver.findElement(By.id("loginButton")).click();
    driver.findElement(By.cssSelector("#loginMessage")).click();
    
   // String uservalue=driver.findElement(By.cssSelector("#usernameInput")).getAttribute("value");
    //String passvalue=driver.findElement(By.cssSelector("#passwordInput")).getAttribute("value");
    //String Errormessage =driver.findElement(By.cssSelector("#loginMessage")).getText();
    //System.out.println("Page Title Name :"+driver.getTitle());
    //System.out.println("Validation message :"+Errormessage);
  //  System.out.println("UserName input value :"+uservalue);
   // System.out.println("Password input value :"+passvalue);
    System.out.println("Condition verify for : Invalid User name ");
    
 // log(Status, details)
    test.log(Status.INFO, "This step shows usage of log(status, details)");

    // info(details)
    test.info("This step shows usage of info(details)");
    
    // log with snapshot
    test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    
    // test with snapshot
   // test.addScreenCaptureFromPath("screenshot.png");
    
   }
   
 
}
