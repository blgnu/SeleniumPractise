import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestNG2 {
    @Test
    public void basariliMailTesti(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        EdgeDriver driver = new EdgeDriver(options);
        driver.get("https://google.com");
        System.out.println("Bu bir basarili mail testidir");
        driver.close();
    }
}
