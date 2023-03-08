package babtecqube.pages.BabtecQubeWebPage;

import babtecqube.pages.BasePage;
import babtecqube.utilities.BrowserUtils;
import babtecqube.utilities.ConfigurationReader;
import babtecqube.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Solutions')]")
    public WebElement solutions;

    @FindBy(xpath = "//span[contains(text(),'Prices')]")
    public WebElement prices;

    @FindBy(xpath = "//a[text()='Support']")
    public WebElement support;

    @FindBy(xpath = "(//a[text()='Karriere'])[1]")
    public WebElement career;

    @FindBy(xpath = "//a[text()='Medien']")
    public WebElement media;

    @FindBy(xpath = "(//a[text()='Über uns'])[1]")
    public WebElement aboutUs;


    public void navigationToHomePage()  {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void navigationToMenus(String menus) {
        WebElement menu = Driver.get().findElement(By.xpath("//span[contains(text(),'" + menus + "')]"));
        menu.click();
        BrowserUtils.waitFor(2);
    }

    public String getUrls() {
        return Driver.get().getCurrentUrl();
    }

    public void navigationToMenu(String menu) {
        WebElement solutionsMenu = Driver.get().findElement(By.xpath("//span[contains(text(),'" + menu + "')]"));
        solutionsMenu.click();
        BrowserUtils.waitFor(2);
    }


}
