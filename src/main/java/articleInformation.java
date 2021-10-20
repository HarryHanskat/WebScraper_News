import org.openqa.selenium.*;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.WebDriver;
import javax.lang.model.util.Elements;
import java.util.List;

/**
 * This will be home to all the article selectors and will return values about each of them.
 * It will return
 *  - Title/Headline
 *  - Url
 *  - Photo link (if there is one)
 */
public class articleInformation {
    protected WebDriver driver;

    /**
     * This is where all the selectors will live, if you need to change one do it here
     */

    public static String getBleacherTitle(WebDriver driver) {
        return (driver.findElements(By.xpath("//*[contains(concat(' ', @class, ' '), ' cell articleSummary ')]"))).get(0).getText().trim();
    }
    public static String getBleacherURL(WebDriver driver) {
        WebElement temp = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[3]/div[2]/article/div/div/ol/li[2]/div[3]/a[2]"));
        String url = temp.getAttribute("href");
        return url;
    }
    public static String getGolfNewsNetTitle (WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[1]/div/div[1]/div/div/div/div/article[1]/a/.."))).getText().trim();
    }
    public static String getGolfNewsNetURL (WebDriver driver) {
        WebElement temp = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[1]/div/div[1]/div/div/div/div/article[1]/a"));
        String url = temp.getAttribute("href");
        return url;
    }
    public static String getSkySportsTitle (WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[1]/div[1]/div/h2/a"))).getAttribute("text").trim();
    }
    public static String getSkySportsURL (WebDriver driver) {
        WebElement temp = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div[3]/div[1]/div[1]/div/h2/a"));
        String url = temp.getAttribute("href");
        return url;
    }
    public static String getNasaTitle(WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[3]/div/article/div/section/div/ul/li[1]/div/div/div[2]/a"))).getAttribute("text").trim();
    }
    public static String getNasaURL(WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[3]/div/article/div/section/div/ul/li[1]/div/div/div[2]/a"))).getAttribute("href").trim();
    }
    public static String getMarsDailyTitle(WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td[1]/span[1]/a"))).getAttribute("text").trim();
    }
    public static String getMarsDailyURL(WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td[1]/span[1]/a"))).getAttribute("href").trim();
    }
    public static String getSpaceTitle(WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/section/div[1]/a/figure/figcaption/span[1]"))).getAttribute("text").trim();
    }
    public static String getSpaceURL(WebDriver driver) {
        return (driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/section/div[1]/a"))).getAttribute("href").trim();
    }



    public articleInformation(WebDriver driver){
        this.driver = driver;
    }
}
