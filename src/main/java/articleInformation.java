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
        return (driver.findElements(By.xpath("//*[contains(concat(' ', @class, ' '), ' cell articleSummary ')]"))).get(0).getText();
    }
    public static String getBleacherURL(WebDriver driver) {
        return (driver.findElements(By.xpath("//*[contains(concat(' ', @class, ' '), ' cell articleSummary ')]"))).get(1).getText();
    }


    public articleInformation(WebDriver driver){
        this.driver = driver;
    }
}
