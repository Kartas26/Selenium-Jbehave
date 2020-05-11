import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestAjaxForm {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestAjaxForm(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        String key1 = "abc";
        P8.getInputTitle().sendKeys(key1);
        P8.getInputDescription().sendKeys(key1);
        P8.getButtonSubmit().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("Form submited Successfully!"));
    }
}
