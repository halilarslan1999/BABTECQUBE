package babtecqube.step_definitions;

import babtecqube.pages.BabtecQubeWebPage.SolutionsPage;
import babtecqube.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class SolutionsStepDefs {
    SolutionsPage solutionsPage = new SolutionsPage();

    @When("The user clicks the {string} menu under Solutions main menu")
    public void the_user_clicks_the_menu_under_solutions_main_menu(String subMenus) {
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        solutionsPage.navigationToSubMenus(subMenus);
    }
    @Then("The user should see the {string} text of sub menu name")
    public void the_user_should_see_the_text_of_sub_menu_name(String expectedSubMenusTexts) {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(expectedSubMenusTexts, solutionsPage.getSubName(expectedSubMenusTexts));
    }





}
