Scenario: P3Story
Given Chrome browser is automatically launched for the third time
When We go to the site https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
Then We click on the RadioButton Male
Then We click on Get Checked value
Then We check if displayed value is Male
Then The CheckBox should be selected And The text should be displayed in a Label
Then Close Chrome browser for the third time