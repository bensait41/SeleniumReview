import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day02trial1 {
    static WebDriver driver;

    @BeforeClass
    public static void gmail() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void gmail01() {

        driver.get("https://mail.google.com/mail/u/0/?ogbl#inbox");
        WebElement gmailbtn = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
        gmailbtn.click();
        WebElement sbox = driver.findElement(By.cssSelector(".gb_Ue.gb_sf"));
        sbox.sendKeys("zoom", Keys.ENTER);

    }
    @AfterClass
    public static void gmailquit(){

        driver.quit();








    }
}
