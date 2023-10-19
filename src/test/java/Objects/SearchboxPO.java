package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchboxPO {
   WebDriver ldriver;

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement searchfield;

    @FindBy(id = "nav-search-submit-button")
    public static WebElement inputSubmitButton;

    @FindBy(xpath = "//*[text() = 'Samsung Galaxy S22 Ultra 5G (Green, 12GB, 256GB Storage) with No Cost EMI/Additional Exchange Offers']")
    public static WebElement SamsungGalaxyUltraGreen;
 



    public SearchboxPO(WebDriver rdriver)
    {
        ldriver = rdriver;
    }
        



}
