package stepDefinition;

import io.cucumber.java.en.Then;
import pom.base.Base;
import pom.registerCoral.AlertEmailandNumber;

public class AlertEmailStepdefs extends Base {

    AlertEmailandNumber alertEmailandNumber=new AlertEmailandNumber();
    @Then("Alert This email address is already registered in the system.")
    public void alertThisEmailAddressIsAlreadyRegisteredInTheSystem() {
        alertEmailandNumber.emailAlert(getDriver(),getElement());
    }
}
