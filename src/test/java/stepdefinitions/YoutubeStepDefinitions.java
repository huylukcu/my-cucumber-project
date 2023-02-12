package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.YoutubeHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class YoutubeStepDefinitions {
    YoutubeHomePage youtubeHomePage = new YoutubeHomePage();
    @Given("user is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("youtube"));
    }
    @Given("user is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
       youtubeHomePage.searchButton.isDisplayed();
    }
    @Given("user is able to see the search button")
    public void user_is_able_to_see_the_search_button() {
    }
    @When("user searches for FUNNY CAT VIDEOS")
    public void user_searches_for_funny_cat_videos() {
        youtubeHomePage.searchButton.sendKeys();

    }
    @Then("user should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {
    }
}
