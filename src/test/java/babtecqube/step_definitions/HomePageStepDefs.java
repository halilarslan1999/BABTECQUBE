package babtecqube.step_definitions;

import babtecqube.pages.BabtecQubeWebPage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();

    @Given("The user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        homePage.navigationToHomePage();
    }

    @When("The user clicks the {string} menu")
    public void the_user_clicks_the_menu(String menus) {

        homePage.navigationToMenus(menus);
    }

    @Then("The user should see the {string} text")
    public void the_user_should_see_the_text(String expectedUrls) {
        Assert.assertEquals(expectedUrls, homePage.getUrls());
    }

    @When("The user clicks on the {string} menu")
    public void theUserClicksOnTheMenu(String menu) {
        homePage.navigationToMenu(menu);
    }
}
