import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03HardAssertion {

    static WebDriver driver;
    @BeforeClass
     public static void hardAssert() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @Test
        public void hardAssertMain(){
            driver.get("https://www.amazon.co.uk/");
            String str = driver.getTitle();

            Assert.assertEquals("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more", str.toString());
            Assert.assertTrue(str.contains("Amazon"));
            Assert.assertFalse(str.contains("in"));








        }
  @AfterClass
    public static void close(){
        driver.quit();




  }




        }








    




