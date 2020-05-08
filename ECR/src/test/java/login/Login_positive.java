package login;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Login_positive {
	  private WebDriver driver;
	  private ExtentReports extent;
	  public ExtentHtmlReporter htmlReporter;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\alok.gupta\\Desktop\\Mercury\\LoginextentpositiveReports.html");
		 extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);   
	    
	  

	    System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\Mendix-Project\\ECR\\drivers\\Chrome\\chromedriver.exe");
	    ChromeOptions options= new ChromeOptions();
		  options.addArguments("--headless");
		  //options.addArguments("window-size=1280,800");
		  driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginPositive() throws Exception {
	  ExtentTest test= extent.createTest("Mendix Application Login","Mendix  Login Condition verify for : valid user & Password");
	  driver.get("http://13.232.180.243/login.html");
	test.pass("NAvigated to login page");
	 test.log(Status.INFO, "This step shows usage of log(status, details)");
    driver.findElement(By.id("usernameInput")).click();
    driver.findElement(By.cssSelector("#usernameInput")).clear();
    driver.findElement(By.cssSelector("#usernameInput")).sendKeys("admin");
    //driver.findElement(By.cssSelector("#loginButton")).click();
   // driver.findElement(By.cssSelector("#passwordInput")).click();
    driver.findElement(By.cssSelector("#passwordInput")).clear();
    driver.findElement(By.cssSelector("#passwordInput")).sendKeys("Mendix257@");
    //System.out.println("Password :"+driver.findElement(null));
    driver.findElement(By.cssSelector("#loginButton")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
	  System.out.println("Page Title Name :"+driver.getTitle());    
	  driver.quit();
	      System.out.println("Test Complete Successfully");
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
    extent.flush(); 
    
  }
}
