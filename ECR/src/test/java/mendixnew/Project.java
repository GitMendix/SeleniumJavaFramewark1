package mendixnew;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Project {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {

	  // Headless ChromBrowser 
	  /*      System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
		 ChromeOptions options= new ChromeOptions();
		  options.addArguments("--headless");
			  //options.addArguments("window-size=1280,800");
		driver = new ChromeDriver(options);
		*/
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\alok.gupta\\git\\SeleniumJavaFramewark1\\ECR\\drivers\\Chrome\\chromedriver.exe");
			 driver = new ChromeDriver();
		
		/*	  System.setProperty("webdriver.gecko.driver","E:\\eclipse\\Java-projects\\First_Maven_project\\drivers\\gecodriver\\geckodriver.exe" );
		    driver = new FirefoxDriver(); */

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateProject() throws Exception {
    driver.get("http://13.232.180.243/login.html");
    
 // For Maximize Window 
    driver.manage().window().maximize();
    driver.findElement(By.id("usernameInput")).click();
    driver.findElement(By.id("usernameInput")).clear();
    driver.findElement(By.id("usernameInput")).sendKeys("admin");
    driver.findElement(By.id("passwordInput")).clear();
    driver.findElement(By.id("passwordInput")).sendKeys("Mendix257@");
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(3000);  
    driver.findElement(By.xpath("//button[@id='mxui_widget_SidebarToggleButton_0']/span")).click();
    driver.findElement(By.linkText("Set Superadmin")).click();
    driver.findElement(By.xpath("//div[@id='mxui_widget_DataGrid_0']/div[3]/table/tbody/tr[4]/td")).click();
    driver.findElement(By.id("mxui_widget_ControlBarButton_2")).click();
    Thread.sleep(3000);  
    driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
    Thread.sleep(3000);  
    driver.findElement(By.linkText("Mendix Sign Out")).click();
    Thread.sleep(3000);  
    driver.findElement(By.xpath("//button[@id='mxui_widget_SidebarToggleButton_0']/span")).click();
    Thread.sleep(3000);  
    driver.findElement(By.linkText("OnePLM Login")).click();
    driver.findElement(By.xpath("//input")).click();
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("markm@Mendix.local");
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Tappa3*2e2");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    Thread.sleep(2000);  
    driver.findElement(By.linkText("Project")).click();
    Thread.sleep(3000);  
    driver.findElement(By.id("mxui_widget_ControlBarButton_1")).click();
    Thread.sleep(3000);  
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(2000);  
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("2D RADAR 5");
    Thread.sleep(2000);  
    driver.findElement(By.xpath("//div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("2D RADAR 5des");
    Thread.sleep(2000);  
    driver.findElement(By.xpath("//div[2]/div[2]/input")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/input")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/input")).clear();
    driver.findElement(By.xpath("//div[2]/div[2]/input")).sendKeys("jayh");
    Thread.sleep(2000);  
    driver.findElement(By.xpath("//div[3]/input")).click();
    driver.findElement(By.xpath("//div[3]/input")).clear();
    driver.findElement(By.xpath("//div[3]/input")).sendKeys("hramaca");
    Thread.sleep(2000);  
    driver.findElement(By.xpath("//div[2]/div[4]/input")).click();
    driver.findElement(By.xpath("//div[2]/div[4]/input")).clear();
    driver.findElement(By.xpath("//div[2]/div[4]/input")).sendKeys("amishr");
    Thread.sleep(2000);  
    driver.findElement(By.xpath("//div[2]/div[6]/input")).click();
    driver.findElement(By.xpath("//div[2]/div[6]/input")).clear();
    driver.findElement(By.xpath("//div[2]/div[6]/input")).sendKeys("neil");
    Thread.sleep(2000);  
    driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton1.btn-success")).click();
    Thread.sleep(3000);  
    driver.findElement(By.cssSelector("a.mx-name-159b6aef-dbc3-5b23-a735-cf99f8341771-8.dropdown")).click();
    Thread.sleep(3000);  
    driver.findElement(By.xpath("//div[3]/button")).click();
    Thread.sleep(1000);  
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
