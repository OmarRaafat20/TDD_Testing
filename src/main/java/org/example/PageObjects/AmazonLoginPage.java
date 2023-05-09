package main.java.org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginPage {

    WebDriver driver;
    By loginUserName = By.xpath("//*[@id=\"ap_email\"]");
    By loginPassword = By.xpath("//*[@id=\"ap_password\"]");
    By ContinueButton = By.xpath("//*[@id=\"continue\"]");
    By SignInButton = By.xpath("//*[@id=\"signInSubmit\"]");
    By wrongUsernameMessage = By.xpath("//*[@id=\"authportal-main-section\"]/div[1]/div");
    By wrongPasswordMessage = By.xpath("//*[@id=\"authportal-main-section\"]/div[1]/div");
    By VerifyHomePageIsDisplayed = By.xpath("//*[@id=\"twotabsearchtextbox\"]");


    By ForgetLink = By.xpath("//*[@id=\"auth-fpp-link-bottom\"]");
    By PasswordAssistance = By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/div/form/h1");
    By InputFiledPassAssistance = By.xpath("//*[@id=\"ap_email\"]");
    By VerificationPage = By.xpath("//*[@id=\"verification-code-form\"]/div[4]");

    public AmazonLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) throws InterruptedException {
        driver.findElement(loginUserName).sendKeys(username);
        Thread.sleep(2000
        );
    }

    public void enterPassword(String password) throws InterruptedException {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickContinue() throws InterruptedException {
        driver.findElement(ContinueButton).click();
        Thread.sleep(2000
        );
    }

    public void ClickSignIn() throws InterruptedException {
        driver.findElement(SignInButton).click();
        Thread.sleep(2000
        );
    }

    public void wrongUserNameMessage_isDisplayed() throws InterruptedException {
        try {
            boolean message = driver.findElement(wrongUsernameMessage).isDisplayed();
            if (message) {
                String ErrorMessage = driver.findElement(wrongUsernameMessage).getText();
                System.out.println(ErrorMessage);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(" Valid User and no error message ");
        }
        Thread.sleep(2000);
    }

    public void wrongPasswordMessage_isDisplayed() throws InterruptedException {
        try {
            boolean message = driver.findElement(wrongPasswordMessage).isDisplayed();
            if (message) {
                String ErrorMessage = driver.findElement(wrongPasswordMessage).getText();
                System.out.println(ErrorMessage);
            }
            Thread.sleep(2000
            );
        } catch (Exception e) {
            System.out.println(" Valid Password");
        }
        Thread.sleep(2000
        );
    }

    public void VerifyHomePageIsOpened() throws InterruptedException {
        try {
            boolean SearchBar = driver.findElement(VerifyHomePageIsDisplayed).isDisplayed();
            if (SearchBar) {
                System.out.println("User is In Home Page and its Displayed");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("User is Not In Home Page");
        }
        Thread.sleep(2000);
    }

    public void BlankUserName() throws InterruptedException {
        driver.findElement(loginUserName).click();
        Thread.sleep(3000);
    }

    public void BlankPassword() throws InterruptedException {
        driver.findElement(loginPassword).click();
        Thread.sleep(2000);
    }

    public void ClickOnForgetYourPasswordLink() throws InterruptedException {
        driver.findElement(ForgetLink).click();
        Thread.sleep(2000
        );
    }

    public void VerifyThatPassAssistanceIsDisplayed() throws InterruptedException {
        try {
            boolean AssistanceDisplayed = driver.findElement(PasswordAssistance).isDisplayed();

            if (AssistanceDisplayed) {
                String text = driver.findElement(PasswordAssistance).getText();
                System.out.println(text);
            }
        } catch (Exception e) {
            System.out.println("Password Assistance Page is not Displayed");
        }
        Thread.sleep(2000);
    }

    public void InputFiledToEnterTheEmailToReceivePass() {
        driver.findElement(InputFiledPassAssistance).sendKeys("");
    }

    public void ClickOnContinueButton() throws InterruptedException {
        driver.findElement(ContinueButton).click();
        Thread.sleep(2000);
    }

    public void OTPpageIsDisplayed() throws InterruptedException {
        try {
            boolean message = driver.findElement(VerificationPage).isDisplayed();
            if (message) {
                driver.findElement(VerificationPage).getText();
                System.out.println(true);
            }
        } catch (Exception e) {
            System.out.println("Page is Not Displayed");
        }
        Thread.sleep(2000);
    }


}
