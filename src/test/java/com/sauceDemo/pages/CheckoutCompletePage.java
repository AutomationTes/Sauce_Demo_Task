package com.sauceDemo.pages;

import com.sauceDemo.utilities.BrowserUtils;
import com.sauceDemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{

    @FindBy(css = ".complete-header")
    public WebElement orderCompleteText;

    public void isOnCheckoutCompletePage(String urlContains){
        BrowserUtils.waitForVisibility(orderCompleteText,15);
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(urlContains));
    }

}
