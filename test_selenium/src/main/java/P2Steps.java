import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2Steps {
    WebDriver driver;

    @Given("Chrome browser is automatically launched for the second time")
    public void createNewDriver()
    {
        driver = new ChromeDriver();
    }

    @When("We go to the site https://www.seleniumeasy.com/test/basic-checkbox-demo.html")
    public void WebSite()
    {
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @Then("Close Chrome browser for the second time")
    public void closeChrome()
    {
        driver.quit();
    }

    @Then("We click on the CheckBox")
    public void clickCheckBox()
    {
        By checkBox = By.id("isAgeSelected");
        driver.findElement(checkBox).click();
    }

    @Then("The CheckBox should be selected And The text should be displayed in a Label")
    public void isCheckBoxSelectedAndTxtDisplayed()
    {
        By checkBox = By.id("isAgeSelected");
        By textLabel = By.id("txtAge");
        Assert.assertTrue(driver.findElement(checkBox).isSelected() && driver.findElement(textLabel).isDisplayed());
    }
}
