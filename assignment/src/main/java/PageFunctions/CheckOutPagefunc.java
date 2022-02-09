package PageFunctions;


import org.openqa.selenium.WebDriver;

import ObjectRepositories.*;
import Utils.CoreActions;

public class CheckOutPagefunc extends CoreActions {

    public CheckOutPagefunc(WebDriver bot) {
        super(bot);
    }

    public void enterFirstName(String firstName) {
        enterText(CheckOutPage.FirstName, firstName);
    }

    public void enterLastName(String lastName) {
        enterText(CheckOutPage.LastName, lastName);
    }

    public void enterPostalCode(String postalCode) {
        enterText(CheckOutPage.PostalCode, postalCode);
    }

    public void clickOnContinue() {
        click(CheckOutPage.Continue);
    }

    public void clickOnFinsh() {
        click(CheckOutPage.Finsh);
    }
}
