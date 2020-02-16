import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P5 {
    private static WebElement draggableSpan1 = ChromeDriver.getDriver().findElement(By.xpath("//div[@id='todrop']|//span[contains(text(), 'Draggable 1')]"));
    private static WebElement draggableSpan2 = ChromeDriver.getDriver().findElement(By.xpath("//span[contains(text(), 'Draggable 2')]"));
    private static WebElement draggableSpan3 = ChromeDriver.getDriver().findElement(By.xpath("//span[contains(text(), 'Draggable 3')]"));
    private static WebElement draggableSpan4 = ChromeDriver.getDriver().findElement(By.xpath("//span[contains(text(), 'Draggable 4')]"));
    private static WebElement dropZone = ChromeDriver.getDriver().findElement(By.id("mydropzone"));
    private static Actions drag = new Actions(ChromeDriver.getDriver());

    public static Actions getDrag() {
        return drag;
    }

    public static WebElement getDraggableSpan1() {
        return draggableSpan1;
    }

    public static WebElement getDraggableSpan2() {
        return draggableSpan2;
    }

    public static WebElement getDraggableSpan3() {
        return draggableSpan3;
    }

    public static WebElement getDraggableSpan4() {
        return draggableSpan4;
    }

    public static WebElement getDropZone() {
        return dropZone;
    }
}
