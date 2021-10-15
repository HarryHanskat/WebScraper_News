import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

/*
This is the web scraper class. It's responsible for going to each site we're gathering news from
and returning the site info we want. Most importantly the article data needed to create the
'tiles' we'll be populating on the localhost server page
 */
public class web_Scraper {
    // Three sites per topic that the scraper will navigate to. All held in static arrays as these shouldn't change
    static String[] golfSites = {"https://bleacherreport.com/golf","https://thegolfnewsnet.com/","https://www.skysports.com/golf"};
    static String[] marsSites = {"https://mars.nasa.gov/news/","https://www.marsdaily.com/","https://www.space.com/"};
    static String[] cryptoSites = {"https://cryptonews.com/","https://finance.yahoo.com/topic/crypto","https://www.coindesk.com/"};
    WebDriver driver;


    // Will trigger the opening of each site where
    public web_Scraper(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(golfSites[0]);
    }

    public void refreshData(){
        //TODO Implement: goes through each of the sites and collects new data
        //This is gonna be a messy first go, can possibly implement optimizations later
        //Just get something down on the pages first then worry about it looking pretty
        //Can do that in another sprint

    }

    public String bleacherTitle(){
        String bleacherTitle = articleInformation.getBleacherTitle(driver);
        return bleacherTitle;
    }
    public String bleacherURL() {
        String bleacherURL = articleInformation.getBleacherURL(driver);
        return bleacherURL;
    }
}

/**
 * 1. Navigate to each site
 *  a. Needs to be headless, so it doesn't bog down the app
 *      a1. Refresh Data method
 *          goes through each site requested and gets the latest data
 *  b. Iterate through each subject, golf, mars, and crypto
 *
 * 2. Collect headline and url for each article
 *  a. Generic pointer for each site so it can update seamlessly as the day changes
 *  b. Maybe a switch statement for each site holding its respective selectors
 *  c.
 * 3. Pass all items to web server
 *  a. All at once? Or one at a time?
 *
 */
