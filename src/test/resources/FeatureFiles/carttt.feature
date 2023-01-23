Feature: This feature is to test cart functionality


@Cart
Scenario: Verify item added in the cart
Given MetaLaunch "<URL>"
Then Click Nokia Lumia
Then Click add to cart
Then Click Cart
Then Verify item added in cart