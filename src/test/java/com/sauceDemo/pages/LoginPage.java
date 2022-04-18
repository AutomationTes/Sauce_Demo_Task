package com.sauceDemo.pages;

import com.sauceDemo.utilities.BrowserUtils;
import com.sauceDemo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{

    @FindBy(css = "#user-name")
    public WebElement usernameBox;

    @FindBy(css = "#password")
    public WebElement passwordBox;

    @FindBy(css = "#login-button")
    public WebElement loginBtn;

    @FindBy(css = ".login_logo")
    public WebElement loginLogo;

    @FindBy(css = ".error-message-container.error")
    public WebElement errorMessage;

    @FindBy(css = "#login_credentials")
    public WebElement loginCredentials;


    public void login(String username) {
          BrowserUtils.waitForVisibility(loginLogo,15);
            if(username.equals("wrongUserName")){
              usernameBox.sendKeys(ConfigurationReader.get(username));
              passwordBox.sendKeys(ConfigurationReader.get("wrong_password"));
            }else{
              usernameBox.sendKeys(ConfigurationReader.get(username));
              passwordBox.sendKeys(ConfigurationReader.get("password"));
            }
          loginBtn.click();
        }

    public String getErrorMessage(){
        String actualErrorMessage =  errorMessage.getText();

            return actualErrorMessage;
        }

    public boolean isLoginPage(){
        boolean onLoginPage = loginCredentials.isDisplayed() && loginBtn.isDisplayed();

            return onLoginPage;
        }
}
