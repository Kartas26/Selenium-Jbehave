import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P4 {
    private static WebElement selectDay = ChromeDriver.getDriver().findElement(By.id("select-demo"));
    private static WebElement Sunday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Sunday']"));
    private static WebElement Monday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Monday']"));
    private static WebElement Tuesday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Tuesday']"));
    private static WebElement Wednesday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Wednesday']"));
    private static WebElement Thursday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Thursday']"));
    private static WebElement Friday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Friday']"));
    private static WebElement Saturday = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Saturday']"));
    private static WebElement selectState = ChromeDriver.getDriver().findElement(By.id("multi-select"));
    private static WebElement buttonOne = ChromeDriver.getDriver().findElement(By.id("printMe"));
    private static WebElement buttonAll = ChromeDriver.getDriver().findElement(By.id("printAll"));
    private static WebElement California = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='California']"));
    private static WebElement Florida = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Florida']"));
    private static WebElement NewJersey = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='New Jersey']"));
    private static WebElement NewYork = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='New York']"));
    private static WebElement Ohio = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Ohio']"));
    private static WebElement Texas = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Texas']"));
    private static WebElement Pennsylvania = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Pennsylvania']"));
    private static WebElement Washington = ChromeDriver.getDriver().findElement(By.xpath("//option[@value='Washington']"));

    public static WebElement getMonday() {
        return Monday;
    }

    public static WebElement getTuesday() {
        return Tuesday;
    }

    public static WebElement getWednesday() {
        return Wednesday;
    }

    public static WebElement getThursday() {
        return Thursday;
    }

    public static WebElement getFriday() {
        return Friday;
    }

    public static WebElement getSaturday() {
        return Saturday;
    }

    public static WebElement getCalifornia() {
        return California;
    }

    public static WebElement getFlorida() {
        return Florida;
    }

    public static WebElement getNewJersey() {
        return NewJersey;
    }

    public static WebElement getNewYork() {
        return NewYork;
    }

    public static WebElement getOhio() {
        return Ohio;
    }

    public static WebElement getTexas() {
        return Texas;
    }

    public static WebElement getPennsylvania() {
        return Pennsylvania;
    }

    public static WebElement getWashington() {
        return Washington;
    }

    public static WebElement getSelectState() {
        return selectState;
    }

    public static WebElement getButtonOne() {
        return buttonOne;
    }

    public static WebElement getButtonAll() {
        return buttonAll;
    }

    public static WebElement getSelectDay() {
        return selectDay;
    }

    public static WebElement getSunday() {
        return Sunday;
    }
}
