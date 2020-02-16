import org.junit.*;

import static java.lang.Thread.sleep;

public class Test {
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

    @org.junit.Test  ////rzuca błąd przy odpaleniu całości///////////////////////////
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

    @org.junit.Test
    public void TestDragAndDrop(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
        P5.getDrag().dragAndDrop(P5.getDraggableSpan1(), P5.getDropZone());
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

    @org.junit.Test
    public void TestModal(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/bootstrap-modal-demo.html");
        P7.getButtonLaunch1().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("This is the place where the content for the modal dialog displays"));
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

    @org.junit.Test
    public void TestSearch(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/data-list-filter-demo.html");
        P9.getInputText().sendKeys("test1");
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("Tyreese Burn"));
    }

    @org.junit.Test
    public void TestAjaxSubmit(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        P10.getInputName().sendKeys("Name");
        P10.getInputComment().sendKeys("Description");
        P10.getButtonSubmit().click();
        Assert.assertTrue(ChromeDriver.getDriver().getPageSource().contains("Form submited Successfully!"));
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
