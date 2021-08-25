import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UIAutomation {
    WebDriver driver;

    @BeforeEach
     public void Browser_Initial_SetUp_Test(){
        driver= new ChromeDriver();
        driver.get("https://d1iw6mb9di5l9r.cloudfront.net/#/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Test
    public void SubmitDetails_Test(){

       driver.findElement(By.cssSelector("#forename")).sendKeys("Chinmayee");
       driver.findElement(By.id("submit")).click();
   }

   /*@Test
   public void Login_Test(){

         driver.findElement(By.id("loginButton"));
         var alertBox=driver.findElement(By.className("alert-message"));
         new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOf(alertBox));
         Assertions.assertEquals("You cliked the login button");
         driver.findElement(By.xpath("//i[contains(text(),'person')])"));
   }
   */
   @Test
   public void Login_Profile_Test(){
     driver.findElement(By.cssSelector("a[aria-label='users']")).click();
     WebElement dialog = driver.findElement(By.className())

   }

  @AfterEach
   public void TerminateBrowser_Test(){
     driver.quit();

  }

}



