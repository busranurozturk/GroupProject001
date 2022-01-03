import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;



import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AmazonAutomation {
     /*Steps to Automate:
    1. Open this url  http://automationpractice.com/index.php
    2. Click on sign in link.
    3. Enter your email address in 'Create and account' section. hilal
    4. Click on Create an Account button. seref
    5. Enter your Personal Information, Address and Contact info. ismail
    6. Click on Register button. muhammad
    7. Validate that user is created.*/ // orhan


    WebDriver driver;

         @BeforeMethod
         public void setUp() {

             driver = WebDriverFactory.getDriver("chrome");
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         }

         @AfterMethod
         public void tearDown () throws InterruptedException {
             Thread.sleep(3000);
            // driver.quit();
         }
             @Test
                public void amazon() throws InterruptedException {

                 driver.get("http://automationpractice.com/index.php");
                 WebElement signInButton = driver.findElement(By.xpath("//*[@*='login']"));
                 signInButton.click();
                 //3
                 WebElement emailInputBox = driver.findElement(By.cssSelector("#email_create"));
                 emailInputBox.sendKeys("james_bonds_009@gmail.com");

                 //4-Step
                 WebElement accountButton = driver.findElement(By.cssSelector("#SubmitCreate"));
                 accountButton.click();
                 Thread.sleep(3000);

                 //5. Enter your Personal Information, Address and Contact info.
                 driver.findElement(By.cssSelector("#id_gender1")).click();
                 driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("James");
                 Thread.sleep(2000);

                 driver.findElement(By.cssSelector("#customer_lastname")).sendKeys("Bond");
                 Thread.sleep(2000);

                 driver.findElement(By.cssSelector("#passwd")).sendKeys("jmsbnd007");
                 Thread.sleep(2000);
                 driver.findElement(By.cssSelector("#uniform-days")).click();
                 driver.findElement(By.xpath("//select/option[@value=\"5\"][1]")).click();
                 driver.findElement(By.cssSelector("#uniform-months")).click();
                 driver.findElement(By.xpath("(//select/option[@value='2'][1])[2]")).click();
                 driver.findElement(By.cssSelector("#uniform-years")).click();
                 driver.findElement(By.xpath("//select/option[@value='1984']")).click();
                 driver.findElement(By.cssSelector("#optin")).click();
                 Thread.sleep(1000);
                 WebElement inputFirstName=driver.findElement(By.xpath("//input[@id='firstname']"));
                 inputFirstName.click();
                 inputFirstName.clear();
                 Thread.sleep(1000);
                 inputFirstName.sendKeys("James");
                 Thread.sleep(1000);
                 WebElement inputLastName=driver.findElement(By.xpath("//input[@id='lastname']"));
                 inputLastName.click();
                 inputLastName.clear();
                 Thread.sleep(1000);
                 inputLastName.sendKeys("Bond");
                 Thread.sleep(1000);
                 driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Cybertek");
                 driver.findElement(By.id("address1")).sendKeys("Top Secret");
                 Thread.sleep(1000);
                 driver.findElement(By.id("city")).sendKeys("Tysons");
                 Thread.sleep(1000);
                 driver.findElement(By.id("uniform-id_state")).click();
                 driver.findElement(By.xpath("//select/option[@value='46']")).click();
                 Thread.sleep(1000);
                 WebElement zipCode=driver.findElement(By.cssSelector("#postcode"));
              zipCode.click();
                 Thread.sleep(1000);
               zipCode.sendKeys("25689");
                 Thread.sleep(1000);
                 driver.findElement(By.cssSelector("#phone")).sendKeys("007007007");
                 Thread.sleep(1000);
                 WebElement alias=   driver.findElement(By.cssSelector("#alias"));
                 alias.click();
                 alias.clear();
                 alias.sendKeys("anywhere in the world");
                 Thread.sleep(2000);

                // 6. Click on Register button. by Mahammad
                 //onceki stepler daha yukariya eklene bilir.

                 WebElement registerButton = driver.findElement(By.xpath("//span[.='Register']"));
                 registerButton.click();
                 Thread.sleep(3000);

                 //7-Step
                 WebElement userInfo = driver.findElement(By.xpath("//*[@class='header_user_info']"));
                 String text = userInfo.getText();
                 System.out.println("text = " + text);

         }

         }




