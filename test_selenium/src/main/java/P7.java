import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P7 {
    private static WebElement buttonLaunch1 = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a"));
    private static WebElement modal = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div/div"));

    public static WebElement getModal() {
        return modal;
    }

    public static WebElement getButtonLaunch1() {
        return buttonLaunch1;
    }
}