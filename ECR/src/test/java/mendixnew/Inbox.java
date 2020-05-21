package mendixnew;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Inbox {
 private WebDriver driver;
   private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
 public void setUp() throws Exception {
	 
  // Headless ChromBrowser 
	  /* System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
	 ChromeOptions options= new ChromeOptions();
	  options.addArguments("--headless");
		  //options.addArguments("window-size=1280,800");
	driver = new ChromeDriver(options); */
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
	
	/*	  System.setProperty("webdriver.gecko.driver","E:\\eclipse\\Java-projects\\First_Maven_project\\drivers\\gecodriver\\geckodriver.exe" );
	    driver = new FirefoxDriver(); */
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testInbox() throws Exception {
    driver.get("http://13.232.180.243/index.html");
    
    // For Maximize Window 
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-menu-hamburger")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("a.mx-name-159b6aef-dbc3-5b23-a735-cf99f8341771-7.dropdown")).click();
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("markm@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e2");
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(3000);
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
