package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.base.Base;
import pom.facebookLogin.LoginFacebook;
import pom.url.Url;

public class FacebookStepdefs extends Base {
    Url url=new Url();
    LoginFacebook loginFacebook=new LoginFacebook();
    @Given("Navigate to {string}")
    public void navigateTo(String arg0) {
        driver(arg0);
    }

    @Given("Navigate to Website")
    public void navigateToWebsite() {
        url.getUrl(getDriver());
    }

    @When("Click the sign in button")
    public void clickTheSignInButton() {
        loginFacebook.clickSignInButton(getDriver());

    }

    @Then("Verify Invalid username or password")
    public void verifyInvalidUsernameOrPassword() {
        loginFacebook.invalidUsernameOrPassword(getDriver(),getElement());
    }

    @And("enter wrong email address")
    public void enterWrongEmailAddress() {
        loginFacebook.wrongEmail(getDriver(),getElement());

    }

    @And("enter password")
    public void enterPassword() {
        loginFacebook.password(getDriver(),getElement());
    }

    @Then("Verify Is this your account?")
    public void verifyIsThisYourAccount() {
    }

    @And("press the turn off \\(X) button")
    public void pressTheTurnOffXButton() {
    }

    @And("enter email address")
    public void enterEmailAddress() {
        loginFacebook.email(getDriver(),getElement());

    }

    @And("enter wrong password")
    public void enterWrongPassword() {
        loginFacebook.wrongPassword(getDriver(),getElement());
    }

    @And("enter email address {string}")
    public void enterEmailAddress(String arg0) {
        loginFacebook.enterEmailAddress(arg0,getDriver(),getElement());
    }

    @And("enter password {string}")
    public void enterPassword(String arg0) {
        loginFacebook.enterPassword(arg0,getDriver(),getElement());
    }

    @Then("See username in profile")
    public void seeUsernameInProfile() {
        loginFacebook.usernameInProfile(getDriver(),getElement());
    }

    @And("Click on user account")
    public void clickOnUserAccount() {
        loginFacebook.clickAccount(getDriver());
    }

    @And("Click the sign out button")
    public void clickTheSignOutButton() {
        loginFacebook.signOut(getDriver());
    }


}
