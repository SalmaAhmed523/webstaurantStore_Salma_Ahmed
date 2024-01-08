package com.webstaurantStore.pages;

import com.webstaurantStore.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebstaurantStore_Search_Page {

    public WebstaurantStore_Search_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//form[@id='searchForm']")
    public WebElement clickSearchBox;
    @FindBy(xpath = "//input[@id='searchval']")
    public WebElement searchBox;
    @FindBy(xpath = "(//button[@value='Search'])[1]")
    public WebElement searchButton;
    @FindBy(xpath = "//a[contains(@aria-label,'last page, page')]")
    public WebElement lastPages;
    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement viewCartElement;
    @FindBy(xpath = "//button[.='Empty Cart']")
    public WebElement emptyCartElement1;
    @FindBy(xpath = "//p[.='Your cart is empty.']")
    public WebElement emptyCartMessage;
    @FindBy(xpath = "//footer/button[@type='button']")
    public WebElement emptyCartElement2;
    @FindBy(xpath = "//div//span[@data-testid ='itemDescription']")
    public List<WebElement> itemsList;

    @FindBy(xpath = "//li[@class='inline-block leading-4 align-top rounded-r-md']/a[contains(@aria-label,'go to page')]")
    public WebElement rightPageArrow;

    @FindBy(xpath = "//input[@gtm-id='AddToCartATC']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='itemDescription description overflow-visible']")
    public WebElement lastAddedItemToCart;

    @FindBy(xpath = "//li[@class='inline-block leading-4 align-top']")
    public List<WebElement> pagesList;


}
