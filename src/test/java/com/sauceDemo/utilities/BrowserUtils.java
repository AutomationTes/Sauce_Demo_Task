package com.sauceDemo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void selectElementByLinkText(String linkText){
        WebElement element = Driver.get().findElement(By.linkText(linkText));
        element.click();
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);

          return wait.until(ExpectedConditions.visibilityOf(element));
    }
    // with select tag name
    public static void selectFromDropdownListByValue(WebElement dropdownElement, String value){
        Select dropdownList = new Select(dropdownElement);
        dropdownList.selectByValue(value);
    }
}
