Scenario: P8Story
Given Chrome browser is automatically launched for the fifth time
When We go to the site https://www.seleniumeasy.com/test/ajax-form-submit-demo.html
Then We enter Title: abc
Then We enter Description: abc
Then We click on Submit
Then We check if Form submitted successfully
Then Close Chrome browser for the fifth time