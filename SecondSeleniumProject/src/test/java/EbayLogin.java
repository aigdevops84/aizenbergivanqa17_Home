import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayLogin {
    WebDriver wd;

    @BeforeMethod

    public void SetUp(){
        wd= new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            }

@Test
        public void LoginTest(){
        wd.get("https://ebay.com");
        wd.findElement(By.linkText("Sign in")).click();
        wd.findElement(By.name("userid")).click();
        wd.findElement(By.name("userid")).clear();
        wd.findElement(By.name("userid")).sendKeys("username");

    wd.findElement(By.id("pass")).click();
    wd.findElement(By.id("pass")).clear();
    wd.findElement(By.id("pass")).sendKeys("password");

    wd.findElement(By.id("sgnBt")).click();




}
@AfterMethod
    public void TearDown(){
        wd.quit();
    }
}
