package com.sauceDemo.pages;

import com.sauceDemo.utilities.BrowserUtils;
import com.sauceDemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductPage extends BasePage {

    @FindBy(css = "app_logo")
    public WebElement appLogo;

    @FindBy(css = ".shopping_cart_link")
    public WebElement shoppingCart;

    @FindBy(css = "#react-burger-menu-btn")
    public WebElement menuBtn;

    @FindBy(css = ".inventory_item_name")
    public List<WebElement> items;

    @FindBy(css = ".product_sort_container")
    public WebElement productSortContainer;

    @FindBy(css = ".inventory_item_name")
    public List<WebElement> itemsElement;

    @FindBy(xpath = "//button[.='Add to cart']")
    public List<WebElement> addToCart;


    public void isOnProductPage() {
        BrowserUtils.waitForVisibility(title, 15);
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("inventory"));
    }

    public void sortItemReverseOrder(String value){
        productSortContainer.click();
        BrowserUtils.selectFromDropdownListByValue(productSortContainer,value);
    }

    public boolean verifyItemsSortedReverseOrder(){
        List<String> itemsName=new ArrayList<String>();
        for (WebElement option : items) {
            itemsName.add(option.getText());
            System.out.println("option.getText() = " + option.getText());
        }
        List<String>sortedList=itemsName.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        boolean verifyReverseOrder = sortedList.equals(itemsName);

          return verifyReverseOrder;
    }

    public void verifyItemQuantity(int expectedItemNum){
        List<WebElement> options = Driver.get().findElements(By.cssSelector(".inventory_item_name"));
        int actualItemNum = options.size();
        Assert.assertEquals(expectedItemNum, actualItemNum);
    }

    public void addItemToCart(int itemNum){
         for (int i = 0; i < itemNum; i++) {
             addToCart.get(i).click();
         }
    }

}
