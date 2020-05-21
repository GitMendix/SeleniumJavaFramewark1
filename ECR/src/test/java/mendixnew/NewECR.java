package mendixnew;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
//import java.security.acl.Owner;
//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

  public class NewECR {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {

	  // Headless ChromBrowser 
	  /*  System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
		 ChromeOptions options= new ChromeOptions();
		  options.addArguments("--headless");
			  //options.addArguments("window-size=1280,800");
		driver = new ChromeDriver(options);*/
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
			 driver = new ChromeDriver();
		
		/*	  System.setProperty("webdriver.gecko.driver","E:\\eclipse\\Java-projects\\First_Maven_project\\drivers\\gecodriver\\geckodriver.exe" );
		    driver = new FirefoxDriver(); */

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewECR() throws Exception {
	  Robot robot =new Robot();
    driver.get("http://13.232.180.243/index.html");
    
 // For Maximize Window 
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[@id='mxui_widget_SidebarToggleButton_0']/span")).click();
    driver.findElement(By.linkText("OnePLM Login")).click();
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("markm@mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e2");
    driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton1.btn-success")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("ECR")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[2]/div/button[2]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='mxui_widget_DataView_1']/div/div[2]/div/div[2]/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='mxui_widget_DataView_1']/div/div[2]/div/div[2]/div/select"))).selectByVisibleText("DUL");
    
    driver.findElement(By.xpath("//select")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div/div/div/input")).sendKeys("2D RADAR 5 ECR");
    driver.findElement(By.id("mxui_widget_ReferenceSelector_0_input")).click();
    Thread.sleep(3000);
    new Select(driver.findElement(By.id("mxui_widget_ReferenceSelector_0_input"))).selectByVisibleText("2D RADAR 4");
    driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_0_input")).click();
    driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/input")).sendKeys("2D RADAR 5 Affected item");
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-calendar")).click();
    driver.findElement(By.xpath("//tr[4]/td[3]")).click();
    driver.findElement(By.xpath("//div[2]/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//tr[4]/td[3]")).click();
    driver.findElement(By.xpath("//div[5]/div/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[5]/div/div/select"))).selectByVisibleText("Open");
    driver.findElement(By.xpath("//div[5]/div/div/select")).click();
    driver.findElement(By.xpath("//div[2]/div/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[2]/div/div/select"))).selectByVisibleText("Critical");
    driver.findElement(By.xpath("//div[2]/div/div/select")).click();
    driver.findElement(By.xpath("//div[6]/div/div/div/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[6]/div/div/div/div/select"))).selectByVisibleText("Mech Environmental Design Issue");
    driver.findElement(By.xpath("//div[6]/div/div/div/div/select")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Radar Requesting");
    driver.findElement(By.xpath("//textarea")).click();
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("Radar reason for change");
    driver.findElement(By.xpath("//div[2]/div[2]/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[2]/div[2]/div/select"))).selectByVisibleText("Major Change");
    driver.findElement(By.xpath("//div[2]/div[2]/div/select")).click();
    driver.findElement(By.xpath("//div[3]/div/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[3]/div/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[3]/div/div/div/textarea")).sendKeys("Radar Physical Description of Change");
    driver.findElement(By.xpath("//div[2]/div/textarea")).click();
    driver.findElement(By.xpath("//div[2]/div/textarea")).clear();
    driver.findElement(By.xpath("//div[2]/div/textarea")).sendKeys("Radar Functional Description ");
    driver.findElement(By.xpath("//div[4]/div/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[4]/div/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[4]/div/div/div/textarea")).sendKeys("Radar Comments");
    driver.findElement(By.xpath("//div[2]/div/div/div/div/button")).click();
    driver.findElement(By.xpath("//td/div/input")).click();
    driver.findElement(By.xpath("//td/div/input")).clear();
    driver.findElement(By.xpath("//td/div/input")).sendKeys("MDF item");
    driver.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/input")).click();
    driver.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/input")).clear();
    driver.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/input")).sendKeys("1");
    driver.findElement(By.xpath("//td[2]/div/input")).click();
    driver.findElement(By.xpath("//td[2]/div/input")).clear();
    driver.findElement(By.xpath("//td[2]/div/input")).sendKeys("1");
    driver.findElement(By.xpath("//td/div/select")).click();
    new Select(driver.findElement(By.xpath("//td/div/select"))).selectByVisibleText("Rework");
    driver.findElement(By.xpath("//td/div/select")).click();
    driver.findElement(By.xpath("//td[2]/div/select")).click();
    new Select(driver.findElement(By.xpath("//td[2]/div/select"))).selectByVisibleText("Rework");
    driver.findElement(By.xpath("//td[2]/div/select")).click();
    driver.findElement(By.xpath("//td[3]/div/select")).click();
    new Select(driver.findElement(By.xpath("//td[3]/div/select"))).selectByVisibleText("Rework");
    driver.findElement(By.xpath("//td[3]/div/select")).click();
    driver.findElement(By.xpath("//td[4]/div/select")).click();
    new Select(driver.findElement(By.xpath("//td[4]/div/select"))).selectByVisibleText("Rework");
    driver.findElement(By.xpath("//td[4]/div/select")).click();
    driver.findElement(By.xpath("//td/div/textarea")).click();
    driver.findElement(By.xpath("//td/div/textarea")).clear();
    driver.findElement(By.xpath("//td/div/textarea")).sendKeys("MDF Comment");
   driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
   
   
   
   driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
    driver.findElement(By.id("mxui_widget_Button_6")).click();
    
    robot.setAutoDelay(2000);
    StringSelection stringSelection = new StringSelection("C:\\Users\\alok.gupta\\Desktop\\Mercury\\ECR-demo.txt");
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
     robot.setAutoDelay(2000);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);

    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_V);

    robot.setAutoDelay(1000);

    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
    
    
   //driver.findElement(By.name("mxdocument")).clear();
  // driver.findElement(By.name("mxdocument")).sendKeys("C:\\Users\\alok.gupta\\Desktop\\Mercury\\test.txt");
   driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
   Thread.sleep(3000);
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
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
