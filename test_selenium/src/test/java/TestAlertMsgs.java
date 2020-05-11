import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

import static java.lang.Thread.sleep;

public class TestAlertMsgs {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestAlertMsgs(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        P6.getButton1().click();
        Assert.assertTrue(P6.getAutoSuccess().isDisplayed());
        await(5000);
        Assert.assertFalse(P6.getAutoSuccess().isDisplayed());
        P6.getButton2().click();
        P6.getButtonClose1().click();
        P6.getButton3().click();
        Assert.assertTrue(P6.getAutoWarning().isDisplayed());
        await(3000);
        Assert.assertFalse(P6.getAutoWarning().isDisplayed());
        P6.getButton4().click();
        P6.getButtonClose2().click();
        P6.getButton5().click();
        Assert.assertTrue(P6.getAutoDanger().isDisplayed());
        await(5000);
        Assert.assertFalse(P6.getAutoDanger().isDisplayed());
        P6.getButton6().click();
        P6.getButtonClose3().click();
        P6.getButton7().click();
        Assert.assertTrue(P6.getAutoInfo().isDisplayed());
        await(6000);
        Assert.assertFalse(P6.getAutoInfo().isDisplayed());
        P6.getButton8().click();
        P6.getButtonClose4().click();
    }

    public static void await(int millis){
        try{
            sleep(millis);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
