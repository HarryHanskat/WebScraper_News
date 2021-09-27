import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class main {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/harryhanskat/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        web_Server server = new web_Server();
        server.start_Server();

        driver.get("http://localhost:4567/hello");
    }
}
