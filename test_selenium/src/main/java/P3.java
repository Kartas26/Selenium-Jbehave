import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P3 {
    private static WebElement outputText = ChromeDriver.getDriver().findElement(By.className("radiobutton"));
    private static WebElement radioButtonMale = ChromeDriver.getDriver().findElement(By.xpath("//input[@name='optradio'][following-sibling::text()[position()=1][contains(., 'Male')]]"));
    private static WebElement radioButtonFemale = ChromeDriver.getDriver().findElement(By.xpath("//input[@name='optradio'][following-sibling::text()[position()=1][contains(., 'Female')]]"));
    private static WebElement getValueButton = ChromeDriver.getDriver().findElement(By.id("buttoncheck"));
    private static WebElement radioButtonMale2 = ChromeDriver.getDriver().findElement(By.xpath("//input[@name='gender'][following-sibling::text()[position()=1][contains(., 'Male')]]"));
    private static WebElement radioButtonFemale2 = ChromeDriver.getDriver().findElement(By.xpath("//input[@name='gender'][following-sibling::text()[position()=1][contains(., 'Female')]]"));
    private static WebElement ageRadioButton1 = ChromeDriver.getDriver().findElement(By.xpath("//input[@value='0 - 5'][following-sibling::text()[position()=1][contains(., '0 to 5')]]"));
    private static WebElement ageRadioButton2 = ChromeDriver.getDriver().findElement(By.xpath("//input[@value='5 - 15'][following-sibling::text()[position()=1][contains(., '5 to 15')]]"));
    private static WebElement ageRadioButton3 = ChromeDriver.getDriver().findElement(By.xpath("//input[@value='15 - 50'][following-sibling::text()[position()=1][contains(., '15 to 50')]]"));
    private static WebElement getValuesButton = ChromeDriver.getDriver().findElement(By.xpath("//button[contains(text(),'Get values')]"));
    private static WebElement outputText2 = ChromeDriver.getDriver().findElement(By.className("groupradiobutton"));

    public static WebElement getGetValuesButton() {
        return getValuesButton;
    }

    public static WebElement getOutputText2() {
        return outputText2;
    }

    public static WebElement getAgeRadioButton1() {
        return ageRadioButton1;
    }

    public static WebElement getAgeRadioButton2() {
        return ageRadioButton2;
    }

    public static WebElement getAgeRadioButton3() {
        return ageRadioButton3;
    }

    public static WebElement getRadioButtonMale2() {
        return radioButtonMale2;
    }

    public static WebElement getRadioButtonFemale2() {
        return radioButtonFemale2;
    }

    public static WebElement getOutputText() {
        return outputText;
    }

    public static WebElement getRadioButtonMale() {
        return radioButtonMale;
    }

    public static WebElement getRadioButtonFemale() {
        return radioButtonFemale;
    }

    public static WebElement getGetValueButton() {
        return getValueButton;
    }
}