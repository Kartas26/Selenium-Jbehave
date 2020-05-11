import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestAjaxSubmit {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestAjaxSubmit(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        P10.getInputName().sendKeys("Name");
        P10.getInputComment().sendKeys("Description");
        P10.getButtonSubmit().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("Form submited Successfully!"));
    }
}
