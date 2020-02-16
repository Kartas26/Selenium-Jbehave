import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8Steps {
    WebDriver driver;

    @Given("Chrome browser is automatically launched for the fifth time")
    public void createNewDriver()
    {
        driver = new ChromeDriver();
    }

    @When("We go to the site https://www.seleniumeasy.com/test/ajax-form-submit-demo.html")
    public void WebSite()
    {
        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
    }

    @Then("Close Chrome browser for the fifth time")
    public void closeChrome()
    {
        driver.quit();
    }

    @Then("We enter Title: abc")
    public void enterTitle()
    {
        By inputTitle = By.id("title");
        driver.findElement(inputTitle).sendKeys("abc");
    }

    @Then("We enter Description: abc")
    public void enterDescription()
    {
        By inputDescription = By.id("description");
        driver.findElement(inputDescription).sendKeys("abc");
    }

    @Then("We click on Submit")
    public void clickSubmit()
    {
        By buttonSubmit = By.id("btn-submit");
        driver.findElement(buttonSubmit).click();
    }

    @Then("We check if Form submitted successfully")
    public void isFormSubmitted()
    {
        Assert.assertTrue(driver.getPageSource().contains("Form submited Successfully!"));
    }
}
