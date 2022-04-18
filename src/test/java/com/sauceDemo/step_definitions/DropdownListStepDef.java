package com.sauceDemo.step_definitions;

import com.sauceDemo.pages.ProductPage;
import com.sauceDemo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DropdownListStepDef {

    ProductPage productPage = new ProductPage();


    @When("user selects {string} from menu")
    public void user_selects_from_menu(String menuOptions) {
        productPage.menuBtn.click();
        BrowserUtils.selectElementByLinkText(menuOptions);
    }

    @When("user sorts items in reverse order {string}")
    public void user_sorts_items_in_reverse_order(String reverseOrder) {
        productPage.productSortContainer.click();
        productPage.sortItemReverseOrder(reverseOrder);
    }

    @Then("user should see items are sorted in reverse order Z to A")
    public void user_should_see_items_are_sorted_in_reverse_order_Z_to_A() {
        boolean expectedResult = productPage.verifyItemsSortedReverseOrder();
        System.out.println("expectedResult = " + expectedResult);
        Assert.assertTrue(expectedResult);
    }
}
