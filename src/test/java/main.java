import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class main {
    public static void main (String [] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        EdgeDriver driver = new EdgeDriver(options);

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Bilgen B");

        WebElement eMail=driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));
        eMail.click();
        eMail.sendKeys("bilgenucar@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAddress.click();
        currentAddress.sendKeys("Istanbul,Turkey");

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350)","");

        WebElement permanentAddress= driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddress.click();
        permanentAddress.sendKeys("Istanbul,Turkey");


        WebElement submitButton= driver.findElement(By.id("submit"));
        submitButton.click();
        //new WebDriverWait(driver,Duration.ofSeconds(5)).until();
        Thread.sleep(3000);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.quit();


    }
}
