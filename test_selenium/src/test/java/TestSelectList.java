import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestSelectList {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestSelectList(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        P4.getSelectDay().click();
        P4.getSunday().click();
        System.out.println(P4.getSelectDay().getText());
        System.out.println(P4.getSunday().getText());
        Assert.assertEquals(P4.getSelectDay().getText(),P4.getSunday().getText());
        P4.getFlorida().click();
        P4.getCalifornia().click();
        P4.getNewJersey().click();
        P4.getButtonAll().click();
        System.out.println(P4.getSelectDay().getText());
        System.out.println(P4.getSunday().getText());
        Assert.assertEquals(P4.getSelectDay().getText(),P4.getSunday().getText());
    }
}
