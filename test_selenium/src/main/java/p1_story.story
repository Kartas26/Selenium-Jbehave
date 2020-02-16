Scenario: P1Story
Given Chrome browser is automatically launched
When We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html
Then We click on the TextBox
Then We enter the message: abc
When We click on show button
Then At the end we should see: abc
Then Close the Chrome browser