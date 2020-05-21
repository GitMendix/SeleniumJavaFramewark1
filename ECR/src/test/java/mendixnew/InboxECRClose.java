package mendixnew;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

  public class InboxECRClose {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {

	  // Headless ChromBrowser 
	  /*   System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
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
  public void testInboxECRClose() throws Exception {
    driver.get("http://13.232.180.243/index.html");
    
 // For Maximize Window 
    driver.manage().window().maximize();
    driver.findElement(By.id("mxui_widget_SidebarToggleButton_0")).click();
    driver.findElement(By.linkText("OnePLM Login")).click();
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("markm@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e2");
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//tr[2]/td")).click();
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    driver.findElement(By.xpath("//div[3]/button")).click();
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("hramacha@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e4");
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//td")).click();
    driver.findElement(By.xpath("//button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/ul/li[2]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("amishra@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e3");
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td/div")).click();
    driver.findElement(By.xpath("//button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/ul/li[2]/a")).click();
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("neilh@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e5");
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td/div")).click();
    driver.findElement(By.xpath("//button[2]")).click();
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/ul/li[2]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("jayh@Mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tarapa3*7e");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//td")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/ul/li[2]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    Thread.sleep(2000);
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
