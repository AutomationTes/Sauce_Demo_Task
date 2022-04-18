package com.sauceDemo.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Locale;

public class CheckoutStepOnePage extends BasePage{

    @FindBy(css = "#first-name")
    public WebElement firstNameBox;

    @FindBy(css = "#last-name")
    public WebElement lastNameBox;

    @FindBy(css = "#postal-code")
    public WebElement postCodeBox;

    @FindBy(css = "#continue")
    public WebElement continueBtn;

    public void completeUserInformationForm(){

        Faker faker = new Faker(Locale.UK);
        String firstN = faker.name().firstName();
        String lastN = faker.name().lastName();
        String postCode = faker.bothify("??# #??", true);

        firstNameBox.sendKeys(firstN);
        lastNameBox.sendKeys(lastN);
        postCodeBox.sendKeys(postCode);
    }
}
