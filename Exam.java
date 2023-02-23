import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Exam {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver","/Users/oksanademchuk/Downloads/chromedriver_mac_arm64");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com");
        Thread.sleep(2000);

        WebElement dropD = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        dropD.click();

        Thread.sleep(2000);


        WebElement selectD1 = driver.findElement(By.xpath("//select[@id='dropdown']"));
        selectD1.click();
        Thread.sleep(2000);
        Select dropdown1 = new Select(selectD1);

       // dropdown1.selectByVisibleText("Option 2");

        WebElement selectD2 = driver.findElement(By.xpath("//option[@value='1']"));
        selectD2.click();
        Thread.sleep(2000);


      // driver.quit(); */




    }
}

