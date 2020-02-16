import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P8 {
    private static WebElement inputTitle = ChromeDriver.getDriver().findElement(By.id("title"));
    private static WebElement inputDescription = ChromeDriver.getDriver().findElement(By.id("description"));
    private static WebElement buttonSubmit = ChromeDriver.getDriver().findElement(By.id("btn-submit"));

    public static WebElement getInputTitle() {
        return inputTitle;
    }

    public static WebElement getInputDescription() {
        return inputDescription;
    }

    public static WebElement getButtonSubmit() {
        return buttonSubmit;
    }
}
