import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P9 {
    private static WebElement inputText = ChromeDriver.getDriver().findElement(By.id("input-search"));

    public static WebElement getInputText() {
        return inputText;
    }
}
