import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day01amazonTest {
    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("babstroller"+ Keys.ENTER);
        WebElement item2=driver.findElement(By.xpath(("(//a[@class='a-link-normal a-text-normal'])[1]")));

        item2.click();







    }










}
