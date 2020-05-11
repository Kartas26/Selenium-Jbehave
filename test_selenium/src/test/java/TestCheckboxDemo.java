import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestCheckboxDemo {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestCheckboxDemo(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        P2.getCheckBoxDemo().click();
        Assert.assertTrue(P2.getCheckBoxDemo().isSelected() && P2.getTextLabel().isDisplayed());
        P2.getCheckBox1().click();
        P2.getCheckBox2().click();
        P2.getCheckBox3().click();
        P2.getCheckBox4().click();
        Assert.assertEquals(P2.getIsChecked().getCssValue("value"),"true");
    }
}
