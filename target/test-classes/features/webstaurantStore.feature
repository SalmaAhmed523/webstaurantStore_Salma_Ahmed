Feature: WebstaurantStore search functionality

  User story: As a user, when I'm on WebstaurantStore page, I should be able to search anything and see result,
  add the items to cart and remove items.


  Scenario: Title contain word verification
    Given user is on the search page
    When user enters "stainless work table" on the search box
    And user click on search button
    Then every product should have the word "table" in it's title

  @wip
  Scenario: Adding and removing items from cart verification
    Given user is on the search page
    When user enters "stainless work table" on the search box
    And user click on search button
    And user add the last item on the search list to Cart
    And user click view Cart
    Then user should see item on the cart
    When user click empty cart
    Then user should see "Your cart is empty." message