package main.java.org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.java.org.example.PageObjects.AmazonLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonLoginPageSteps {

    public WebDriver driver;
    AmazonLoginPage amazonLoginPage;

    @Before
    public void SetupBrowser() {
        System.getProperty("webdriver.chrome.driver", "C:/Users/oraafat/IdeaProjects/KartyTask/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void TearDown() {
        driver.close();
        driver.quit();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        amazonLoginPage = new AmazonLoginPage(driver);
        driver.navigate().to("https://www.amazon.eg/-/en/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.eg%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=egflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    }

    @When("^user enter login Credentials UN (.*)$")
    public void userEnterValidOrInvalidUsername(String username) throws InterruptedException {
        amazonLoginPage.enterUserName(username);
        Thread.sleep(1000);
    }

    @And("click on Continue button")
    public void clickOnContinueButton() throws InterruptedException {
        amazonLoginPage.clickContinue();
    }

    @And("check that there is error message is displayed if wrong username is entered")
    public void checkThatThereIsErrorMessageIsDisplayedWrongUsername() throws InterruptedException {
        amazonLoginPage.wrongUserNameMessage_isDisplayed();
    }

    @And("^user enter login Credentials PW (.*)$")
    public void userEnterOrInvalidPassword(String password) throws InterruptedException {
        amazonLoginPage.enterPassword(password);
    }

    @And("clicks SignIn button")
    public void clicksSignInButton() throws InterruptedException {
        amazonLoginPage.ClickSignIn();
    }

    @And("check that there is error message is displayed if wrong password is entered")
    public void checkThatThereIsErrorMessageIsDisplayedWrongPassword() throws InterruptedException {
        amazonLoginPage.wrongPasswordMessage_isDisplayed();
    }

    @Then("user is navigated to home page")
    public void userIsNavigatedToHomePage() throws InterruptedException {
        amazonLoginPage.VerifyHomePageIsOpened();

    }

    @And("user login with blank username")
    public void userLoginWithBlankUsernameUsername() throws InterruptedException {
        amazonLoginPage.BlankUserName();

    }

    @And("user login with blank password")
    public void userLoginWithBlankPassPassword() throws InterruptedException {
        amazonLoginPage.BlankPassword();
    }

    @And("user click on forgot your password")
    public void userClickOnForgotYourPassword() throws InterruptedException {
        amazonLoginPage.ClickOnForgetYourPasswordLink();
    }

    @And("verify that password assistance page is displayed")
    public void verifyThatPasswordAssistancePageIsDisplayed() throws InterruptedException {
        amazonLoginPage.VerifyThatPassAssistanceIsDisplayed();
    }

    @And("user enter the email to receive the new password")
    public void userEnterTheEmailToReceiveTheNewPassword() {
        amazonLoginPage.InputFiledToEnterTheEmailToReceivePass();
    }

    @And("user click on continue")
    public void userClickOnContinue() throws InterruptedException {
        amazonLoginPage.ClickOnContinueButton();
    }

    @And("verify that verification page is displayed")
    public void verifyThatVerificationPageIsDisplayed() throws InterruptedException {
        amazonLoginPage.OTPpageIsDisplayed();
    }
}
