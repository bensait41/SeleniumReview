import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//Dropdown element can not be used without Select class.we create an object from Select class
//we had 3 ways to find the dropdownelements.
public class day03DropDown {
       static WebDriver driver;
//Select class
    @BeforeClass
    public static void dropdown() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void dropdown01(){
        driver.get("https://www.amazon.co.uk/");
        WebElement drdown=driver.findElement(By.xpath("(//*[@*='searchDropdownBox'])"));
        Select slct= new Select(drdown);


//1)*********************selectByVisibleText
        slct.selectByVisibleText("Baby");
        System.out.println("this is 1st :"+ drdown.getText());
//2)********************SelectByIndex(4)
        slct.selectByIndex(5);
        WebElement selected = slct.getFirstSelectedOption();
        System.out.println("selectted option : "+selected.getText());
//3)**************SelcetByValue
        slct.selectByValue("search-alias=stripbooks");

        List<WebElement> list= slct.getOptions();
        for(WebElement w:list) {


            System.out.println(w.getText());
        }

        System.out.println(list.size());















  }



}
