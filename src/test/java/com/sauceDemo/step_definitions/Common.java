package com.sauceDemo.step_definitions;

import com.sauceDemo.pages.CheckoutCompletePage;
import com.sauceDemo.pages.LoginPage;
import com.sauceDemo.pages.ProductPage;
import io.cucumber.java.en.Then;


public class Common {

    LoginPage loginPage = new LoginPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
    ProductPage productPage = new ProductPage();

    @Then("user should be on {string} page")
    public void user_should_be_on_page(String pageTitle) {
        if(pageTitle.equalsIgnoreCase("login")){
            loginPage.isLoginPage();
        }else if (pageTitle.equalsIgnoreCase("checkout-complete")){
            checkoutCompletePage.isOnCheckoutCompletePage(pageTitle);
        }else if (pageTitle.equalsIgnoreCase("product")){
            productPage.isOnProductPage();
        }
    }
}
