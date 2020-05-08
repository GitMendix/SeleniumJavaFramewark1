package login;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.gargoylesoftware.htmlunit.BrowserVersion;


public class Login_Ng1  {
  private WebDriver driver;
  private ExtentReports extent;
 
  public ExtentHtmlReporter htmlReporter;
 
  
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	   
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\alok.gupta\\Desktop\\Mercury\\LoginextentReports1.html");
	    extent = new ExtentReports();
     extent.attachReporter(htmlReporter);   
     
     System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\Mendix-Project\\ECR\\drivers\\Chrome\\chromedriver.exe");
     ChromeOptions options= new ChromeOptions();
	  options.addArguments("--headless");
	  //options.addArguments("window-size=1280,800");
	  driver = new ChromeDriver(options);

	     
	     //  driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);
	 	// driver = new HtmlUnitDriver(BrowserVersion.CHROME);
	//driver = new HtmlUnitDriver(BrowserVersion.FIREFOX);
	
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNegative() throws Exception {
	  

	  // creates a toggle for the given test, adds all log events under it    
    ExtentTest test= extent.createTest("Mendix Application Login","Mendix  Login Condition verify for : Invalid User name");
    
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
   
  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
	 
    driver.quit();

     
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }

    extent.flush();    
    
  }
  
}
