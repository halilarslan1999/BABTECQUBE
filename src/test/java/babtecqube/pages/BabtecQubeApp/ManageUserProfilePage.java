package babtecqube.pages.BabtecQubeApp;

import babtecqube.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageUserProfilePage extends BasePage {

    @FindBy(xpath="(//span[contains(text(),'Login')])[1]")
    public WebElement homePageLoginButton;

    @FindBy(xpath="//input[@id='Email']")
    public WebElement emailLogin;

    @FindBy(xpath="//input[@id='Password']")
    public WebElement passwordLogin;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement LoginButton;

    @FindBy(xpath = "//ul[1]//li[1]//div[1]//span[2]//i[1]")
    public WebElement userAccount;

    @FindBy(xpath = "//input[@placeholder='Enter your Position…']")
    public WebElement editPosition;

    @FindBy(xpath = "//input[@placeholder='Enter your Department…']")
    public WebElement editDepartment;

    @FindBy(xpath = "//input[@placeholder='Enter your Phone Number…']")
    public WebElement editPhone;

    @FindBy(xpath = "//input[@placeholder='Enter your Mobile Number…']")
    public WebElement editMobile;

    @FindBy(xpath = "//input[@placeholder='Enter your Fax Number…']")
    public WebElement editFax;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//input-text[@id='display_name']//i[@class='fa fa-times-circle pointer ng-star-inserted']")
    public WebElement deleteNameButton;

    @FindBy(xpath = "//input[@placeholder='Enter your Name…']")
    public WebElement editName;

    @FindBy(xpath = "//input[@placeholder='Enter your Position…']")
    public WebElement editLanguage;

    @FindBy(xpath = " //span[normalize-space()='Change Email']")
    public WebElement changeEmailButtonUserAccount;

    @FindBy(xpath = " //input[@placeholder='Enter your new email address…']")
    public WebElement emailEnterField;

    @FindBy(css = " default-button[class='m-r-sm'] span[class='label-separator ng-star-inserted']")
    public WebElement changeEmailOpenedPage;

    @FindBy(xpath = "  //span[normalize-space()='Cancel']")
    public WebElement emailCancel;






}
