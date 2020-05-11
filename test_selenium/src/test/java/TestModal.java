import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestModal {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestModal(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
        P7.getButtonLaunch1().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("This is the place where the content for the modal dialog displays"));
    }
}
