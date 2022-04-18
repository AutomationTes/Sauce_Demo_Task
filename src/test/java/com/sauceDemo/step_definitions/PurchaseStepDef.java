package com.sauceDemo.step_definitions;

import com.sauceDemo.pages.CartPage;
import com.sauceDemo.pages.CheckoutStepOnePage;
import com.sauceDemo.pages.CheckoutStepTwoPage;
import com.sauceDemo.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PurchaseStepDef {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage();
    CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

    @Given("user adds {int} items to cart")
    public void user_adds_items_to_cart(int itemNum)  throws InterruptedException {
        productPage.addItemToCart(itemNum);
        Thread.sleep(5000);
        productPage.shoppingCart.click();
    }

    @Given("user checkouts on YOUR CART page")
    public void user_checkouts_on_YOUR_CART_page() {
        cartPage.checkoutBtn.click();
    }

    @Given("user completes CHECKOUT:YOUR INFORMATION")
    public void user_completes_CHECKOUT_YOUR_INFORMATION() {
        checkoutStepOnePage.completeUserInformationForm();
        checkoutStepOnePage.continueBtn.click();
    }

    @When("user FINISHES CHECKOUT")
    public void user_FINISHES_CHECKOUT() {
        checkoutStepTwoPage.finishBtn.click();
    }

}
