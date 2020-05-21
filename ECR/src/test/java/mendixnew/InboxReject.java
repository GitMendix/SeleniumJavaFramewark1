package mendixnew;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class InboxReject {
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
  public void testInboxReject() throws Exception {
    driver.get("http://13.232.180.243/index.html");
    
 // For Maximize Window 
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-menu-hamburger")).click();
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
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("hramacha@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e4");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("div.mx-datagrid-data-wrapper")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.mx-datagrid-data-wrapper")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/div/div[2]/div/div/div/div/div/div")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/ul/li[2]/a")).click();
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("amishra@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e3");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("td.mx-name-column112.mx-left-aligned")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.mx-datagrid-data-wrapper")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[3]")).click();
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='mxui_widget_DataView_3']/div/div/div/div/input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("neilh@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e5");
    driver.findElement(By.xpath("//div[2]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div.mx-datagrid-data-wrapper")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("OnePLM Sign Out")).click();
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("markm@Mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e2");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Inbox")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/ul/li[3]/a")).click();
    Thread.sleep(4000);
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
