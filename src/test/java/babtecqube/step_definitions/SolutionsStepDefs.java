package babtecqube.step_definitions;

import babtecqube.pages.SolutionsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SolutionsStepDefs {

    SolutionsPage solutionsPage = new SolutionsPage();

    @When("The user clicks the {string} menu under Solutions main menu")
    public void the_user_clicks_the_menu_under_solutions_main_menu(String subMenus) {
        solutionsPage.navigationToSubMenus(subMenus);
    }
    @Then("The user should see the {string} text of sub menu name")
    public void the_user_should_see_the_text_of_sub_menu_name(String expectedSubMenusTexts) {
        Assert.assertEquals(expectedSubMenusTexts, solutionsPage.getSubName(expectedSubMenusTexts));
    }





}
