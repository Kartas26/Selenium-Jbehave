import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10 {
    private static WebElement inputName = ChromeDriver.getDriver().findElement(By.id("title"));
    private static WebElement inputComment = ChromeDriver.getDriver().findElement(By.id("description"));
    private static WebElement buttonSubmit = ChromeDriver.getDriver().findElement(By.id("btn-submit"));

    public static WebElement getInputName() {
        return inputName;
    }

    public static WebElement getInputComment() {
        return inputComment;
    }

    public static WebElement getButtonSubmit() {
        return buttonSubmit;
    }
}
