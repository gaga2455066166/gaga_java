//// Generated by Selenium IDE
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.core.IsNot.not;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Keys;
//import java.util.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//public class MyTest3Test {
//  private WebDriver driver;
//  private Map<String, Object> vars;
//  JavascriptExecutor js;
//  @Before
//  public void setUp() {
//    System.setProperty("webdriver.gecko.driver","C:\\Users\\24550\\Desktop\\软件测试\\Selenium实验有关文件\\geckodriver-v0.28.0-win64\\geckodriver.exe");
//    driver = new FirefoxDriver();
//    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
//  }
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
//  @Test
//  public void myTest3() {
//    driver.get("http://localhost:8080/OnlineStore_war_exploded/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E5%AE%9E%E9%AA%8C3.html");
//    driver.manage().window().setSize(new Dimension(1936, 1056));
//    driver.findElement(By.id("oper1")).click();
//    driver.findElement(By.id("oper1")).sendKeys("6");
//    driver.findElement(By.id("oper2")).click();
//    driver.findElement(By.id("oper2")).sendKeys("6");
//    driver.findElement(By.cssSelector("input:nth-child(5)")).click();
//    assertThat(driver.findElement(By.id("result")).getText(), is("12"));
//  }
//}
