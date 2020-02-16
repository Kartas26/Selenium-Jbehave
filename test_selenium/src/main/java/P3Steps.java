import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3Steps {
    WebDriver driver;

    @Given("Chrome browser is automatically launched for the third time")
    public void createNewDriver()
    {
        driver = new ChromeDriver();
    }

    @When("We go to the site https://www.seleniumeasy.com/test/basic-radiobutton-demo.html")
    public void WebSite()
    {
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
    }

    @Then("Close Chrome browser for the third time")
    public void closeChrome()
    {
        driver.quit();
    }

    @Then("We click on the RadioButton Male")
    public void clickRadioButton()
    {
        By radioButtonMale = By.xpath("//input[@name='optradio'][following-sibling::text()[position()=1][contains(., 'Male')]]");
        driver.findElement(radioButtonMale).click();
    }
    @Then("We click on Get Checked value")
    public void clickGetValueButton()
    {
        By getCheckedValue = By.id("buttoncheck");
        driver.findElement(getCheckedValue).click();
    }

    @Then("We check if displayed value is Male")
    public void isValueDisplayed()
    {
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
    }
}
