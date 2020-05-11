import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestSearch {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestSearch(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/data-list-filter-demo.html");
        P9.getInputText().sendKeys("test1");
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("Tyreese Burn"));
    }
}
