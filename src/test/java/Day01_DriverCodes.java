import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_DriverCodes{
      @Test
      public  void test01(){

          WebDriverManager.chromedriver().setup();

          WebDriver driver = new ChromeDriver();

          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.google.co.uk/");
          driver.navigate().to("https://www.amazon.co.uk/");
          driver.navigate().back();
          driver.quit();//all segments.-->driver.close() last segment











}


}
