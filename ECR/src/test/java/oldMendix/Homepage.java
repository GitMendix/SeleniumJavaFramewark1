package oldMendix;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class Homepage {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chrome\\chromedriver.exe");
	  // driver = new ChromeDriver();
	   ChromeOptions options= new ChromeOptions();
		  options.addArguments("--headless");
		  //options.addArguments("window-size=1280,800");
		  driver = new ChromeDriver(options);
	  
	// System.setProperty("webdriver.gecko.driver","E:\\eclipse\\Java-projects\\First_Maven_project\\drivers\\gecodriver\\geckodriver.exe" );
    //driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
   
    
  }

  @Test
  public void testHomepage() throws Exception {
    driver.get("http://13.232.180.243/login.html");
    Thread.sleep(3000);  
    driver.findElement(By.id("usernameInput")).click();
    driver.findElement(By.id("usernameInput")).clear();
    driver.findElement(By.id("usernameInput")).sendKeys("admin");
    driver.findElement(By.id("passwordInput")).clear();
    driver.findElement(By.id("passwordInput")).sendKeys("Mendix257@");
    driver.findElement(By.id("passwordInput")).click();
    Thread.sleep(3000);    
    driver.findElement(By.id("loginButton")).click();
    driver.findElement(By.linkText("Admin Tools")).click();
    driver.findElement(By.linkText("Project Approval")).click();
    Thread.sleep(4000);    
    driver.findElement(By.cssSelector("#mxui_widget_ControlBarButton_1")).click();
    Thread.sleep(4000);    
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    
    driver.findElement(By.xpath("//input")).sendKeys("ProjectECR");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("test");
    driver.findElement(By.xpath("//div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/div/input")).sendKeys("test");
    driver.findElement(By.xpath("//div[2]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/div[2]/div/input")).sendKeys("test");
    driver.findElement(By.xpath("//div[3]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div/div/div/input")).sendKeys("test");
    driver.findElement(By.xpath("//div[3]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div/div[2]/div/input")).sendKeys("test");
    driver.findElement(By.xpath("//div[4]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[4]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[4]/div/div/div/input")).sendKeys("e");
    driver.findElement(By.xpath("//div[4]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[4]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[4]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[5]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[5]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[5]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[5]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[5]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[5]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[6]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[6]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[6]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[6]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[6]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[6]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[7]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[7]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[7]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[7]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[7]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[7]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[8]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[8]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[8]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[8]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[8]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[8]/div/div[2]/div/input")).sendKeys("r");
    driver.findElement(By.xpath("//div[9]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[9]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[9]/div/div/div/input")).sendKeys("r");
    driver.findElement(By.xpath("//div[9]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[9]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[9]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[10]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[10]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[10]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[10]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[10]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[10]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[11]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[11]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[11]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[11]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[11]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[11]/div/div[2]/div/input")).sendKeys("t");
    driver.findElement(By.xpath("//div[12]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[12]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[12]/div/div/div/input")).sendKeys("t");
    driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton3.btn-primary")).click();
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
  }
}
