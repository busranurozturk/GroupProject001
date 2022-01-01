import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;



import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class AmazonAutomation {
     /*Steps to Automate:
    1. Open this url  http://automationpractice.com/index.php
    2. Click on sign in link.
    3. Enter your email address in 'Create and account' section. hilal
    4. Click on Create an Account button. seref
    5. Enter your Personal Information, Address and Contact info. ismail
    6. Click on Register button. muhammad
    7. Validate that user is created.*/ // orhan






    @Test

    public void AccountButton() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://automationpractice.com/index.php");

    //4-Step
    Thread.sleep(2000);
    WebElement accountButton = driver.findElement(By.xpath("(//button/span)[2]"));
    accountButton.click();


}



     @Test
     public void amazon() {
         WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.get("http://automationpractice.com/index.php");
         WebElement signInButton = driver.findElement(By.xpath("//*[@*='login']"));
         signInButton.click();
         //3
         WebElement emailInputBox = driver.findElement(By.cssSelector("#email_create"));
         emailInputBox.sendKeys("james_bond_007@gmail.com");

     }

}
