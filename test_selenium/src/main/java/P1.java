import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1 {
    private static WebElement inputText = ChromeDriver.getDriver().findElement(By.id("user-message"));
    private static WebElement showButton = ChromeDriver.getDriver().findElement(By.xpath("//button[contains(text(),'Show Message')]"));
    private static WebElement outputText = ChromeDriver.getDriver().findElement(By.id("display"));
    private static WebElement inputTextA = ChromeDriver.getDriver().findElement(By.id("sum1"));
    private static WebElement inputTextB = ChromeDriver.getDriver().findElement(By.id("sum2"));
    private static WebElement showButtonAB = ChromeDriver.getDriver().findElement(By.xpath("//button[contains(text(),'Get Total')]"));
    private static WebElement outputTextAB = ChromeDriver.getDriver().findElement(By.id("displayvalue"));

    public static WebElement getInputText() {
        return inputText;
    }

    public static WebElement getShowButton() {
        return showButton;
    }

    public static WebElement getOutputText() {
        return outputText;
    }

    public static WebElement getInputTextA() {
        return inputTextA;
    }

    public static WebElement getInputTextB() {
        return inputTextB;
    }

    public static WebElement getShowButtonAB() {
        return showButtonAB;
    }

    public static WebElement getOutputTextAB() {
        return outputTextAB;
    }
}
