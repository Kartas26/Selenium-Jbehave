import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P6 {
    private static WebElement button1 = ChromeDriver.getDriver().findElement(By.id("autoclosable-btn-success"));
    private static WebElement button2 = ChromeDriver.getDriver().findElement(By.id("normal-btn-success"));
    private static WebElement button3 = ChromeDriver.getDriver().findElement(By.id("autoclosable-btn-warning"));
    private static WebElement button4 = ChromeDriver.getDriver().findElement(By.id("normal-btn-warning"));
    private static WebElement button5 = ChromeDriver.getDriver().findElement(By.id("autoclosable-btn-danger"));
    private static WebElement button6 = ChromeDriver.getDriver().findElement(By.id("normal-btn-danger"));
    private static WebElement button7 = ChromeDriver.getDriver().findElement(By.id("autoclosable-btn-info"));
    private static WebElement button8 = ChromeDriver.getDriver().findElement(By.id("normal-btn-info"));
    private static WebElement buttonClose1 = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/button"));
    private static WebElement buttonClose2 = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[4]/button"));
    private static WebElement buttonClose3 = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[6]/button"));
    private static WebElement buttonClose4 = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[8]/button"));
    private static WebElement autoSuccess = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]"));
    private static WebElement autoWarning = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]"));
    private static WebElement autoDanger = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[5]"));
    private static WebElement autoInfo = ChromeDriver.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[7]"));

    public static WebElement getAutoSuccess() {
        return autoSuccess;
    }

    public static WebElement getAutoWarning() {
        return autoWarning;
    }

    public static WebElement getAutoDanger() {
        return autoDanger;
    }

    public static WebElement getAutoInfo() {
        return autoInfo;
    }

    public static WebElement getButtonClose2() {
        return buttonClose2;
    }

    public static WebElement getButtonClose3() {
        return buttonClose3;
    }

    public static WebElement getButtonClose4() {
        return buttonClose4;
    }

    public static WebElement getButtonClose1() {
        return buttonClose1;
    }

    public static WebElement getButton1() {
        return button1;
    }

    public static WebElement getButton2() {
        return button2;
    }

    public static WebElement getButton3() {
        return button3;
    }

    public static WebElement getButton4() {
        return button4;
    }

    public static WebElement getButton5() {
        return button5;
    }

    public static WebElement getButton6() {
        return button6;
    }

    public static WebElement getButton7() {
        return button7;
    }

    public static WebElement getButton8() {
        return button8;
    }
}
