import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03IsDisplayed {
  static WebDriver driver;
    @BeforeClass
    public static void isDisplayed(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);





    }
  @Test
    public void isDplyd(){

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
      WebElement webElement = driver.findElement(By.xpath("(//h4)[1]"));
      System.out.println(webElement.isDisplayed());
      WebElement picker = driver.findElement(By.xpath("(//input[@type='checkbox'])"));
      picker.click();
      System.out.println(picker.isSelected());

}

}
