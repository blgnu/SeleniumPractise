import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static java.lang.Thread.sleep;

public class practise {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        EdgeDriver driver = new EdgeDriver(options);

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        JavascriptExecutor jsx= (JavascriptExecutor)  driver;
        jsx.executeScript("window.scrollBy(0,450)", "");

        WebElement elementsButton= driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsButton.click();

        WebElement webTables= driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTables.click();

        WebElement addNewRecordButton= driver.findElement(By.cssSelector("#addNewRecordButton"));
        addNewRecordButton.click();

        WebElement firstName= driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys("Bilgen");

        WebElement lastName= driver.findElement(By.id("lastName"));
        lastName.click();
        lastName.sendKeys("Test");

        WebElement eMail=driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));
        eMail.click();
        eMail.sendKeys("bilgentest@test.com");

        WebElement age=driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"Age\"]"));
        age.click();
        age.sendKeys("40");

        WebElement salary=driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"Salary\"]"));
        salary.click();
        salary.sendKeys("5000");

        WebElement department= driver.findElement(By.id("department"));
        department.click();
        department.sendKeys("QA");

        WebElement submitButton= driver.findElement(By.id("submit"));
        Thread.sleep(4000);








    }
}
