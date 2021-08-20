import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Day01_DriverCodes{
     WebDriver driver1;
      @Test
      public  void test01(){

          WebDriverManager.chromedriver().setup();

          WebDriver driver = new ChromeDriver();

//          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//          driver.get("https://www.google.co.uk/");
//          driver.navigate().to("https://www.amazon.co.uk/");
//          driver.navigate().back();
//          driver.quit();//all segments.-->driver.close() last segment
          String homepath=System.getProperty("user.home");
          System.out.println(homepath);
          String pathOfFile="C:\\Users\\fth\\Music\\Video Projects";
          boolean isExist=Files.exists(Paths.get("C:\\Users\\fth\\Music\\Video Projects"));
          System.out.println(isExist);
          Assert.assertTrue(isExist);











}


}
