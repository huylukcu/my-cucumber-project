package stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HW_BlueRentalStepDefs {

     LoginPage blueRentalLoginPage = new LoginPage();
    HomePage blueRentalHomePage = new HomePage();

    @Given("user is on blue rental home page")
    public void user_is_on_blue_rental_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @Given("user click on login link")
    public void user_click_on_login_link() {

        blueRentalHomePage.userID.click();
    }

    @Given("user enters user name {string}")
    public void user_enters_user_name(String string) {

        blueRentalLoginPage.username.sendKeys(string);
    }
    @Given("user enters password {string}")
    public void user_enters_password(String string) {

        blueRentalLoginPage.password.sendKeys(string);
    }
    @When("click on login button")
    public void click_on_login_button() {

        blueRentalLoginPage.loginButton.click();
    }
    @Then("verify login is successful")
    public void verify_login_is_successful() {

        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());
    }

}
