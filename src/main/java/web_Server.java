import static spark.Spark.*;

public class web_Server {
    public void start_Server(){

        web_Scraper scraper = new web_Scraper();
        scraper.refreshData();
        System.out.println(scraper.bleacherTitle);
        System.out.println(scraper.bleacherURL);
        System.out.println(scraper.golfNewsNetTitle);
        System.out.println(scraper.golfNewsNetURL);
        System.out.println(scraper.skySportsTitle);
        System.out.println(scraper.skySportsURL);
        System.out.println(scraper.nasaTitle);
        System.out.println(scraper.nasaURL);
        System.out.println(scraper.marsDailyTitle);
        System.out.println(scraper.marsDailyURL);
        System.out.println(scraper.spaceTitle);
        System.out.println(scraper.spaceURL);

        //String bleacherTitle = scraper.bleacherTitle();
        //String bleacherURL = scraper.bleacherURL();

        //get("/hello", (req, res) -> bleacherTitle);
        //get("/hello", (req, res) -> bleacherURL);
    }
}

/**
 * 1. Read in data from web scraper for each site.
 *  a. Will take a Headline as a String, and a Url
 * 2. Place data into tiles for each section with their headline and then just link to the article page
 * 3. Make website look not totally trash. Add header and styling for the tiles
 */
