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
    @FindBy(xpath = "//span[@data-testid ='itemDescription']")
    public List<WebElement> itemsList;

   // @FindBy(xpath = "//span[@class='block font-semibold text-sm-1/2 leading-none mt-4 mb-0 max-h-10 //hover:max-h-full min-h-10 overflow-hidden hover:overflow-visible text-center']")
    //``public List<WebElement> itemsList;

    @FindBy(xpath = "//input[@gtm-id='AddToCartATC']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='itemDescription description overflow-visible']")
    public WebElement lastAddedItemToCart;



}
