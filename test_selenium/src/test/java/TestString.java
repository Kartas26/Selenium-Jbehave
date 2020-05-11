import org.junit.*;

import static java.lang.Thread.sleep;

public class TestString {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestString(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        String key1 = "abc";
        P1.getInputText().sendKeys(key1);
        P1.getShowButton().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains(key1));
        int a = 1;
        int b = 2;
        int sum = a + b;
        P1.getInputTextA().sendKeys(Integer.toString(a));
        P1.getInputTextB().sendKeys(Integer.toString(b));
        P1.getShowButtonAB().click();
        Assert.assertEquals(Integer.toString(sum),P1.getOutputTextAB().getText());
    }
}
