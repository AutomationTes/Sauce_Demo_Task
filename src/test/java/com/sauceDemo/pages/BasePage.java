package com.sauceDemo.pages;

import com.sauceDemo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(css = ".title")
    public WebElement title;

    public BasePage(){ PageFactory.initElements(Driver.get(), this); }

}
