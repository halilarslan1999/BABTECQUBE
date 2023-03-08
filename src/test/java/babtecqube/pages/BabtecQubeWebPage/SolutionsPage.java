package babtecqube.pages.BabtecQubeWebPage;

import babtecqube.pages.BasePage;
import babtecqube.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SolutionsPage extends BasePage {

    @FindBy(xpath = "//li[text()='Equipment & Gages']")
    public WebElement SubMenus;


    public void navigationToSubMenus(String subMenus){
        WebElement submenu = Driver.get().findElement(By.xpath("//a[contains(text(),'" + subMenus + "')]"));
        submenu.click();
    }

    public String getSubName(String text){
        return Driver.get().findElement(By.xpath("//h1[contains(text(),'" + text + "')]")).getText();
    }


}
