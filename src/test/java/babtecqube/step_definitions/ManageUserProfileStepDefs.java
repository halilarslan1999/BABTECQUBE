package babtecqube.step_definitions;

import babtecqube.pages.BabtecQubeApp.ManageUserProfilePage;
import babtecqube.utilities.BrowserUtils;
import babtecqube.utilities.ConfigurationReader;
import babtecqube.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ManageUserProfileStepDefs {

    ManageUserProfilePage manageUserProfilePage = new ManageUserProfilePage();
    BrowserUtils browserUtils = new BrowserUtils();

    @Given("User clicks on the Login button on the home page navigation menu")
    public void user_clicks_on_the_login_button() {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.homePageLoginButton.click();
    }

    @Given("User clicks email field and send emailAddress")
    public void user_clicks_email_field_and_send_email_adress() {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.emailLogin.sendKeys(ConfigurationReader.get("email"));
    }

    @Then("User clicks password field and send password")
    public void user_clicks_password_field_and_send_password() {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.passwordLogin.sendKeys(ConfigurationReader.get("password"));
    }

    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.LoginButton.click();
    }

    @Then("User clicks on userEdit button")
    public void User_clicks_on_userEdit_button() {
        browserUtils.waitForClickablility(manageUserProfilePage.userAccount, 10);
        //Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        manageUserProfilePage.userAccount.click();
    }

    @Then("User clicks Name field and enters a {string}")
    public void user_clicks_name_field_and_enters_a(String name) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.editName.click();
        manageUserProfilePage.editName.clear();
        manageUserProfilePage.editName.sendKeys(name);
    }

    @Given("User clicks Position field and enters a {string}")
    public void user_clicks_position_field_and_enters_a(String position) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.editPosition.click();
        manageUserProfilePage.editPosition.clear();
        manageUserProfilePage.editPosition.sendKeys(position);
    }

    @Then("User clicks Department field and enters a {string}")
    public void user_clicks_department_field_and_enters_a(String department) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.editDepartment.click();
        manageUserProfilePage.editDepartment.clear();
        manageUserProfilePage.editDepartment.sendKeys(department);
    }

    @Then("User clicks Phone field and enters a {string}")
    public void user_clicks_phone_field_and_enters_a(String phone) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.editPhone.click();
        manageUserProfilePage.editPhone.clear();
        manageUserProfilePage.editPhone.sendKeys(phone);
    }

    @Then("User clicks Mobile field and enters a {string}")
    public void user_clicks_mobile_field_and_enters_a(String mobile) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.editMobile.click();
        manageUserProfilePage.editMobile.clear();
        manageUserProfilePage.editMobile.sendKeys(mobile);
    }

    @Then("User clicks Fax field and enters a {string}")
    public void user_clicks_fax_field_and_enters_a(String fax) {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.editFax.click();
        manageUserProfilePage.editFax.clear();
        manageUserProfilePage.editFax.sendKeys(fax);
    }

    @Then("User clicks save button and checks if the save is successfully")
    public void user_clicks_save_button_and_checks_if_the_save_is_successfully() {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.saveButton.click();
    }


    @Then("User clicks changeEmail button")
    public void user_clicks_change_email_button() {
        Driver.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        manageUserProfilePage.changeEmailButtonUserAccount.click();
    }

    @Then("User clicks NewEmail Address and enters a new mail")
    public void user_clicks_new_email_address_and_enters_a_new_mail() {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        manageUserProfilePage.emailEnterField.click();
        manageUserProfilePage.emailEnterField.sendKeys("harslan7579@gmail.com");
    }

    @Then("User verifies if new mail request succesfully send")
    public void user_verifies_if_new_mail_request_succesfully_send() {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        manageUserProfilePage.changeEmailOpenedPage.click();
    }

    @Then("User clicks cancel button on Change Mail page")
    public void user_clicks_cancel_button_on_change_mail_page() {
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        manageUserProfilePage.emailCancel.click();
    }

 }

