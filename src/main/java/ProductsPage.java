import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By moreProductLocator = By.id("padeIndex") ;
    By productCheckLocator = By.id("model_2078129_5525563") ;
    By productNameLocator = By.id("model_1781232_5322616") ;

    public ProductsPage(WebDriver driver) {
        super(driver);

    }

    public boolean isOnProductsPage() {
        return isDisplayed(productCheckLocator);
    }


    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
    private List<WebElement> getAllProducts() {
        return findAll(productNameLocator);
    }

    public void scrollPage() {
        find(moreProductLocator);
        click(moreProductLocator);
    }

    public boolean isOnUnderThePage() {
        return isDisplayed(productCheckLocator);

    }


}
