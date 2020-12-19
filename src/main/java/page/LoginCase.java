package page;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCase {
    WebDriver driver;
    String Weburl = "https://nvg.gov.sa/Account/Login";


    @BeforeClass(alwaysRun = true)
    public void setUp()  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\M.AlAmoudi-t\\Desktop\\TestCase\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Weburl);
    }

    @Test
    private void testLogin() throws InterruptedException {
        String ID="1101868717";
        String Password="Am1234567890*";


        driver.findElement(By.id("username")).sendKeys(ID);
        driver.findElement(By.id("password")).sendKeys(Password);
    if(ID=="1101868717"){

        if(Password=="Am1234567890*"){
            Thread.sleep(5000);

            driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div")).click();
            driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/div/div/div/form[2]/div/button")).click();
            driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
            driver.close();
        }

    }
    else {
        System.out.println("id or password not correct ");
    }

    }



}