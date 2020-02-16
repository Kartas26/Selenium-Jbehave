Scenario: P2Story
Given Chrome browser is automatically launched for the second time
When We go to the site https://www.seleniumeasy.com/test/basic-checkbox-demo.html
Then We click on the CheckBox
Then The CheckBox should be selected And The text should be displayed in a Label
Then Close Chrome browser for the second time