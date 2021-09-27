import static spark.Spark.*;

public class web_Server {
    public void start_Server(){

        web_Scraper scraper = new web_Scraper();
        String address = scraper.articleAddress();

        get("/hello", (req, res) -> address);
    }
}

/**
 * 1. Read in data from web scraper for each site.
 *  a. Will take a Headline as a String, and a Url
 * 2. Place data into tiles for each section with their headline and then just link to the article page
 * 3. Make website look not totally trash. Add header and styling for the tiles
 */

