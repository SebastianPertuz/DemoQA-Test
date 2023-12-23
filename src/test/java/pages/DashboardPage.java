package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Base {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    //Selectors
    @FindBy(css = "div.category-cards div.card")
    private WebElement cards;

    public void clickOnCard(){
        if(cards.isDisplayed()){
            cards.click();
        }
    }


}
