package com.webstaurantStore.steps;

import com.webstaurantStore.pages.WebstaurantStore_Search_Page;
import com.webstaurantStore.utility.Driver;
import com.webstaurantStore.utility.GUIUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebstaurantStore_StepDefs {

    WebstaurantStore_Search_Page searchPage = new WebstaurantStore_Search_Page();
    List<WebElement> itemsList;

    @Given("user is on the search page")
    public void user_is_on_the_search_page() {

        Driver.getDriver().get("https://www.webstaurantstore.com/");
    }

    @When("user enters {string} on the search box")
    public void userEntersOnTheSearchBox(String searchItem) {

        searchPage.clickSearchBox.click();
        searchPage.searchBox.sendKeys(searchItem);

    }

    @And("user click on search button")
    public void userClickOnSearchButton() {

        searchPage.searchButton.click();
    }

    @Then("every product should have the word {string} in it's title")
    public void everyProductShouldHaveTheWordInItSTitle(String expectedWord) {

        List<WebElement> pagesList = Driver.getDriver().findElements(By.xpath("//li[@class='inline-block leading-4 align-top']"));

        for (int i = 1; i < pagesList.size(); i++) {

            String pageSelector = "(//nav[@aria-label='pagination']//a)[" + i + "]";

            Driver.getDriver().findElement(By.xpath(pageSelector)).click();

            itemsList = searchPage.itemsList;

            for (int j = 0; j < itemsList.size(); j++) {

                GUIUtils.waitForClickablility(itemsList.get(i), 2000);

                itemsList.get(j).click();

                Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(expectedWord));

                Driver.getDriver().navigate().back();
            }


        }

    }


    //============================================Second Scenario================================================

    @When("user add the last item on the search list to Cart")
    public void userAddTheLastItemToCart() {

        searchPage.lastPages.click();

        itemsList.get(itemsList.size() - 1).click();

        searchPage.addToCartButton.click();

    }


    @And("user click view Cart")
    public void userClickViewCart() {

        searchPage.viewCartElement.click();

    }

    @Then("user should see item on the cart")
    public void userSeeItemOnTheCart() {

        Assert.assertTrue("Item added to cart verification filed", searchPage.lastAddedItemToCart.isDisplayed());
    }


    @When("user click empty cart")
    public void userClickEmptyCart() {

        searchPage.emptyCartElement1.click();
        searchPage.emptyCartElement2.click();
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String expectedEmptyCartMessage) {

        String actualEmptyCartMessage = searchPage.emptyCartMessage.getText();

        Assert.assertEquals("Empty cart message verification filed", expectedEmptyCartMessage, actualEmptyCartMessage);
    }


}
