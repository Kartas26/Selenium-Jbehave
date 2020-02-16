import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1Steps {
    WebDriver driver;

    @Given("Chrome browser is automatically launched")
    public void createNewDriver()
    {
        driver = new ChromeDriver();
    }

    @When("We go to the site http://www.seleniumeasy.com/test/basic-first-form-demo.html")
    public void WebSite()
    {
        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }


    @Then("Close the Chrome browser")
    public void closeChrome()
    {
        driver.quit();
    }

    @Then("We click on the TextBox")
    public void clickTextBox()
    {
        By textBox = By.id("user-message");
        driver.findElement(textBox).click();
    }

    @Then("We enter the message: abc")
    public void enterMessage()
    {
        By textBox = By.xpath("//input[@id='user-message']");
        driver.findElement(textBox).sendKeys("abc");
    }

    @When("We click on show button")
    public void showMessage()
    {
        By showBtn = By.xpath("//button[@onclick='showInput();']");
        driver.findElement(showBtn).click();
    }

    @Then("At the end we should see: abc")
    public void isMessage()
    {
        Assert.assertTrue(driver.getPageSource().contains("abc"));
    }
}
