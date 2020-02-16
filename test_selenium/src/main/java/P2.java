import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P2 {
    private static WebElement checkBoxDemo = ChromeDriver.getDriver().findElement(By.id("isAgeSelected"));
    private static WebElement textLabel = ChromeDriver.getDriver().findElement(By.id("txtAge"));
    private static WebElement checkBox1 = ChromeDriver.getDriver().findElement(By.xpath("//input[@class='cb1-element'][following-sibling::text()[position()=1][contains(., 'Option 1')]]"));
    private static WebElement checkBox2 = ChromeDriver.getDriver().findElement(By.xpath("//input[@class='cb1-element'][following-sibling::text()[position()=1][contains(., 'Option 2')]]"));
    private static WebElement checkBox3 = ChromeDriver.getDriver().findElement(By.xpath("//input[@class='cb1-element'][following-sibling::text()[position()=1][contains(., 'Option 3')]]"));
    private static WebElement checkBox4 = ChromeDriver.getDriver().findElement(By.xpath("//input[@class='cb1-element'][following-sibling::text()[position()=1][contains(., 'Option 4')]]"));
    private static WebElement checkButton = ChromeDriver.getDriver().findElement(By.id("check1"));
    private static WebElement isChecked = ChromeDriver.getDriver().findElement(By.id("isChkd"));

    public static WebElement getCheckBoxDemo() {
        return checkBoxDemo;
    }

    public static WebElement getTextLabel() {
        return textLabel;
    }

    public static WebElement getCheckBox1() {
        return checkBox1;
    }

    public static WebElement getCheckBox2() {
        return checkBox2;
    }

    public static WebElement getCheckBox3() {
        return checkBox3;
    }

    public static WebElement getCheckBox4() {
        return checkBox4;
    }

    public static WebElement getCheckButton() {
        return checkButton;
    }

    public static WebElement getIsChecked() {
        return isChecked;
    }
}
