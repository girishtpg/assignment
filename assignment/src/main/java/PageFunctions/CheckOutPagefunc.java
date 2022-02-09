package PageFunctions;


import org.openqa.selenium.WebDriver;

import ObjectRepositories.*;
import Utils.CoreActions;

public class CheckOutPagefunc extends CoreActions {

    public CheckOutPagefunc(WebDriver bot) {
        super(bot);
    }

    public void enterFirstName(String firstName) {
        enterText(CheckOutPage_OR.FirstName, firstName);
    }

    public void enterLastName(String lastName) {
        enterText(CheckOutPage_OR.LastName, lastName);
    }

    public void enterPostalCode(String postalCode) {
        enterText(CheckOutPage_OR.PostalCode, postalCode);
    }

    public void clickOnContinue() {
        click(CheckOutPage_OR.Continue);
    }

    public void clickOnFinsh() {
        click(CheckOutPage_OR.Finsh);
    }
}
