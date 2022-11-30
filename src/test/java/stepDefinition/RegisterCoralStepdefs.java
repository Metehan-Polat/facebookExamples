package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.base.Base;
import pom.registerCoral.RegisterCoral;
import pom.urlCoralTravel.urlCoralTravel;

public class RegisterCoralStepdefs extends Base {

    urlCoralTravel urlCoralTravel=new urlCoralTravel();
    RegisterCoral registerCoral=new RegisterCoral();
    @Given("Navigate to {string}")
    public void navigateTo(String arg0) {
        driver(arg0);
    }

    @When("Navigate to Url")
    public void navigateToUrl() {
        urlCoralTravel.getUrl(getDriver());
    }

    @Then("Verify Coraltravel is visible")
    public void verifyCoraltravelIsVisible() {
        registerCoral.verifyCoralTurkiye(getDriver(),getElement());

    }

    @And("Click to become a member")
    public void clickToBecomeAMember() {
        registerCoral.clickBecomeaMember(getDriver());
    }

    @And("Fill details: Name {string}, Surname {string}, Email{string}, Password{string}, New Password Again{string}, Mobile Number{string},Mobile Numbersecond{string}")
    public void fillDetailsNameSurnameEmailPasswordNewPasswordAgainMobileNumberMobileNumbersecond(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    registerCoral.fiildetails(getDriver(),getElement(),getActions(),arg0,arg1,arg2,arg3,arg4,arg5,arg6);
    }

    @And("Select checkbox I have read the Clarification Text regarding the processing of my personal data by Coral.")
    public void selectCheckboxIHaveReadTheClarificationTextRegardingTheProcessingOfMyPersonalDataByCoral() {
        registerCoral.checkboxClarification(getDriver());
    }

    @And("Select checkbox I declare that I have read this Explicit Consent Text and accordingly, I have given my consent for Coral and its service providers to send me electronic messages for advertising, marketing, promotion and information purposes via SMS, e-mail and telephone.")
    public void selectCheckboxIDeclareThatIHaveReadThisExplicitConsentTextAndAccordinglyIHaveGivenMyConsentForCoralAndItsServiceProvidersToSendMeElectronicMessagesForAdvertisingMarketingPromotionAndInformationPurposesViaSMSEMailAndTelephone() {
            registerCoral.chechboxExplicitConsentTex(getDriver());
    }

    @When("Click the Subscribe button")
    public void clickTheSubscribeButton() {
        registerCoral.clickSubscribeButton(getDriver());
    }

    @Then("Verify We are waiting for you to approve the link we sent to {string} to complete your membership process is visible")
    public void verifyWeAreWaitingForYouToApproveTheLinkWeSentToToCompleteYourMembershipProcessIsVisible(String arg0) {
        registerCoral.verifyTextMessage(getDriver(),getElement(),arg0);
    }

    @And("Close")
    public void close() {
    quitMethod();
    }


}
