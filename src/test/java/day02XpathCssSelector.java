import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class day02XpathCssSelector {
    static WebDriver driver;


    @BeforeClass
    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
        @Test
        public  void test01(){

        driver.get("https://www.google.co.uk/");
        WebElement searchbox=driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        searchbox.sendKeys("mathsunitedyoutube", Keys.ENTER);
        WebElement maths=driver.findElement(By.xpath("(//H3[@class='LC20lb DKV0Md'])[1]"));
        maths.click();

        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        System.out.println(Arrays.asList(allLinks));
        for(WebElement w: allLinks){
            System.out.println(w.getText());
        }



        }





    }






