import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;

public class TestRadioButton {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestRadioButton(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        P3.getRadioButtonMale().click();
        P3.getGetValueButton().click();
        Assert.assertTrue(P3.getRadioButtonMale().isSelected() && P3.getOutputText().isDisplayed());
        P3.getRadioButtonFemale().click();
        P3.getGetValueButton().click();
        Assert.assertTrue(P3.getRadioButtonFemale().isSelected() && P3.getOutputText().isDisplayed());
        P3.getRadioButtonMale2().click();
        P3.getAgeRadioButton3().click();
        P3.getGetValuesButton().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("Sex : Male") && ChromeDriver.getDriver().getPageSource().contains("Age group: 15 - 50"));
    }
}
