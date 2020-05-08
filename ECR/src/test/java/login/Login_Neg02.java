package login;

 
//import org.testng.Assert;
import org.testng.annotations.*;

//import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
 
import org.openqa.selenium.*;
 


public class Login_Neg02 extends BaseTest {
    WebDriver driver;
 
   

  
  @Test
  public void testNegative() throws Exception {

	  // creates a toggle for the given test, adds all log events under it    
     test= extent.createTest("Mendix Application Login","Mendix  Login Condition verify for : Blank Field");
     
    driver.get("http://13.232.180.243/login.html");
    
    test.pass("NAvigated to login page2");
    
    // log(Status, details)
    test.log(Status.INFO, "This step shows usage of log2(status, details)");
    
    driver.findElement(By.id("usernameInput")).click();
    driver.findElement(By.cssSelector("#usernameInput")).clear();
    driver.findElement(By.cssSelector("#usernameInput")).sendKeys("");
    driver.findElement(By.cssSelector("#passwordInput")).clear();
    driver.findElement(By.cssSelector("#passwordInput")).sendKeys("");
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-eye-close")).click();
    driver.findElement(By.id("loginButton")).click();
   // String passvalue=driver.findElement(By.cssSelector("#usernameInput")).getAttribute("#usernameInput");
    driver.findElement(By.cssSelector("#loginMessage")).click();
    
    String uservalue=driver.findElement(By.cssSelector("#usernameInput")).getAttribute("value");
    String passvalue=driver.findElement(By.cssSelector("#passwordInput")).getAttribute("value");
    String Errormessage =driver.findElement(By.cssSelector("#loginMessage")).getText();
    System.out.println("Page Title Name :"+driver.getTitle());
    System.out.println("Validation message :"+Errormessage);
    System.out.println("UserName input value:"+uservalue);
    System.out.println("Password input value :"+passvalue);
    System.out.println("Condition verify for : Blank Field ");
    
      }
   
  
  
}
