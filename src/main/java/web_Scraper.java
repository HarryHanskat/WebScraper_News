import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public String bleacherTitle = "";
    public String bleacherURL = "";
    public String golfNewsNetTitle = "";
    public String golfNewsNetURL = "";
    public String skySportsTitle = "";
    public String skySportsURL = "";
    public String nasaTitle = "";
    public String nasaURL = "";
    public String marsDailyTitle = "";
    public String marsDailyURL = "";
    public String spaceTitle = "";
    public String spaceURL = "";

    Map data = new HashMap();

    // Will trigger the opening of each site where
    public web_Scraper(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }

    public void refreshData(){
        driver.get(golfSites[0]);
        setBleacherTitle();
        setBleacherURL();
        driver.get(golfSites[1]);
        setGolfNewsNetTitle();
        setGolfNewsNetURL();
        driver.get(golfSites[2]);
        setSkySportsTitle();
        setSkySportsURL();
        driver.get(marsSites[0]);
        setNasaTitle();
        setNasaURL();
        driver.get(marsSites[1]);
        setMarsDailyTitle();
        setMarsDailyURL();
        driver.get(marsSites[2]);
        setSpaceTitle();
        setSpaceURL();

        driver.close();
    }

    public String setBleacherTitle(){
        bleacherTitle = articleInformation.getBleacherTitle(driver);
        return bleacherTitle;
    }
    public String setBleacherURL() {
        bleacherURL = articleInformation.getBleacherURL(driver);
        return bleacherURL;
    }
    public String setGolfNewsNetTitle(){
        golfNewsNetTitle = articleInformation.getGolfNewsNetTitle(driver);
        return golfNewsNetTitle;
    }
    public String setGolfNewsNetURL(){
        golfNewsNetURL = articleInformation.getGolfNewsNetURL(driver);
        return golfNewsNetURL;
    }
    public String setSkySportsTitle(){
        skySportsTitle = articleInformation.getSkySportsTitle(driver);
        return skySportsTitle;
    }
    public String setSkySportsURL(){
        skySportsURL = articleInformation.getSkySportsURL(driver);
        return skySportsURL;
    }
    public String setNasaTitle(){
        nasaTitle = articleInformation.getNasaTitle(driver);
        return nasaTitle;
    }
    public String setNasaURL() {
        nasaURL = articleInformation.getNasaURL(driver);
        return nasaURL;
    }
    public String setMarsDailyTitle() {
        marsDailyTitle = articleInformation.getMarsDailyTitle(driver);
        return marsDailyTitle;
    }
    public String setMarsDailyURL() {
        marsDailyURL = articleInformation.getMarsDailyURL(driver);
        return marsDailyURL;
    }
    public String setSpaceTitle() {
        spaceTitle = articleInformation.getSpaceTitle(driver);
        return spaceTitle;
    }
    public String setSpaceURL() {
        spaceURL = articleInformation.getSpaceURL(driver);
        return spaceURL;
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
