import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7Steps {
    WebDriver driver;

    @Given("Chrome browser is automatically launched for the fourth time")
    public void createNewDriver()
    {
        driver = new ChromeDriver();
    }

    @When("We go to the site https://www.seleniumeasy.com/test/bootstrap-modal-demo.html")
    public void WebSite()
    {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
    }

    @Then("Close Chrome browser for the fourth time")
    public void closeChrome()
    {
        driver.quit();
    }

    @Then("We click on the LaunchButton")
    public void clickLaunchButton()
    {
        By launchButton = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
        driver.findElement(launchButton).click();
    }

    @Then("We check if Modal displays")
    public void isModalDisplayed()
    {
        Assert.assertTrue(driver.getPageSource().contains("This is the place where the content for the modal dialog displays"));
    }
}
