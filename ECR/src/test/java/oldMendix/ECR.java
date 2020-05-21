package oldMendix;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ECR {
  private WebDriver driver;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	//  System.setProperty("webdriver.gecko.driver","E:\\eclipse\\Java-projects\\First_Maven_project\\drivers\\gecodriver\\geckodriver.exe" );
    //driver = new FirefoxDriver();
    
    System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chrome\\chromedriver.exe");
	   ChromeOptions options= new ChromeOptions();
		  options.addArguments("--headless");
		  //options.addArguments("window-size=1280,800");
		  driver = new ChromeDriver(options);
	
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testECR() throws Exception {
    driver.get("http://13.232.180.243/login.html");
    driver.findElement(By.id("usernameInput")).click();
    driver.findElement(By.id("usernameInput")).clear();
    driver.findElement(By.id("usernameInput")).sendKeys("admin");
    driver.findElement(By.id("passwordInput")).click();
    driver.findElement(By.id("passwordInput")).clear();
    driver.findElement(By.id("passwordInput")).sendKeys("Mendix257@");
    Thread.sleep(5000);
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(7000);
    driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton1.btn-primary")).click();
    Thread.sleep(4000);
    driver.findElement(By.cssSelector("#mxui_widget_ControlBarButton_1")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input")).clear();
    driver.findElement(By.xpath("//input")).sendKeys("Origdemo");
    driver.findElement(By.xpath("//div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//select[@id='mxui_widget_ReferenceSelector_0_input']")).click();
    new Select(driver.findElement(By.xpath("//select[@id='mxui_widget_ReferenceSelector_0_input']"))).selectByVisibleText("ProjectECR");
    driver.findElement(By.xpath("//select[@id='mxui_widget_ReferenceSelector_0_input']")).click();
    driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/input")).click();
    driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/input")).clear();
    driver.findElement(By.xpath("//div[3]/div[2]/div/div/div/input")).sendKeys("Affitemdemo");
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-calendar")).click();
    driver.findElement(By.cssSelector("td.mx-calendar-day-month-current.mx-calendar-day-active.mx-calendar-day-today")).click();
    driver.findElement(By.xpath("//div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("tm");
    driver.findElement(By.cssSelector("div.mx-name-datePicker5.mx-datepicker.form-group.no-columns > div.mx-compound-control > button.btn.mx-button > span.glyphicon.glyphicon-calendar")).click();
    driver.findElement(By.cssSelector("td.mx-calendar-day-month-current.mx-calendar-day-selected.mx-calendar-day-active.mx-calendar-day-today")).click();
    driver.findElement(By.xpath("//div[2]/div/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[2]/div/div/select"))).selectByVisibleText("Critical");
    driver.findElement(By.xpath("//div[2]/div/div/select")).click();
    driver.findElement(By.xpath("//div[6]/div/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[6]/div/div/select"))).selectByVisibleText("Submitted");
    driver.findElement(By.xpath("//div[6]/div/div/select")).click();
    driver.findElement(By.xpath("//div[9]/div/div/div/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[9]/div/div/div/div/select"))).selectByVisibleText("Mech Physical Design Issue");
    driver.findElement(By.xpath("//div[9]/div/div/div/div/select")).click();
    driver.findElement(By.xpath("//div[9]/div/div[2]/div/input")).click();
    driver.findElement(By.xpath("//div[9]/div/div[2]/div/input")).clear();
    driver.findElement(By.xpath("//div[9]/div/div[2]/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//div[9]/div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//div[9]/div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[9]/div[2]/div/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//div[2]/div/select")).click();
    new Select(driver.findElement(By.xpath("//div[2]/div/select"))).selectByVisibleText("Major Change");
    driver.findElement(By.xpath("//div[2]/div/select")).click();
    driver.findElement(By.xpath("//textarea")).click();
    driver.findElement(By.xpath("//textarea")).clear();
    driver.findElement(By.xpath("//textarea")).sendKeys("tm");
    driver.findElement(By.xpath("//div[2]/div/textarea")).click();
    driver.findElement(By.xpath("//div[2]/div/textarea")).clear();
    driver.findElement(By.xpath("//div[2]/div/textarea")).sendKeys("tm");
    driver.findElement(By.xpath("//div[4]/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[4]/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[4]/div/div/textarea")).sendKeys("tm");
    driver.findElement(By.xpath("//div[2]/div/div/textarea")).click();
    driver.findElement(By.xpath("//div[2]/div/div/textarea")).clear();
    driver.findElement(By.xpath("//div[2]/div/div/textarea")).sendKeys("tm");
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton3.spacing-outer-top-medium.btn-default")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td/div/input")).click();
    driver.findElement(By.xpath("//td/div/input")).clear();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/input")).click();
    driver.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/input")).clear();
    driver.findElement(By.xpath("//td[2]/table/tbody/tr/td/div/input")).sendKeys("tm");
    driver.findElement(By.xpath("//td[2]/div/input")).click();
    driver.findElement(By.xpath("//td[2]/div/input")).clear();
    driver.findElement(By.xpath("//td[2]/div/input")).sendKeys("tm");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//td/div/select")).click();
    Thread.sleep(3000);
    new Select(driver.findElement(By.xpath("//td/div/select"))).selectByVisibleText("Use As Is");
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
    driver.findElement(By.xpath("//td/div/textarea")).sendKeys("tm");
    driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_1_input")).click();
    new Select(driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_1_input"))).selectByVisibleText("Origdemo");
    driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_1_input")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("#mxui_widget_DataView_2 > div.mx-dataview-controls > button.btn.mx-button.mx-name-actionButton1.btn-success")).click();
   // driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton15.btn-bordered.spacing-outer-top-medium.btn-default")).click();
    Thread.sleep(3000);
  //  driver.findElement(By.cssSelector("#mxui_widget_Button_14")).click();
    //driver.findElement(By.xpath("//form/input")).clear();
    //driver.findElement(By.xpath("//form/input")).sendKeys("test.txt");
    //driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_3_input")).click();
    //new Select(driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_3_input"))).selectByVisibleText("tm");
    //driver.findElement(By.cssSelector("#mxui_widget_ReferenceSelector_3_input")).click();
    //driver.findElement(By.cssSelector("#mxui_widget_DataView_4 > div.mx-dataview-controls > button.btn.mx-button.mx-name-actionButton1.btn-success")).click();
   // Thread.sleep(3000);
    driver.findElement(By.cssSelector("button.btn.mx-button.mx-name-actionButton1.HintTooltipButtonSave.btn-success")).click();
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
