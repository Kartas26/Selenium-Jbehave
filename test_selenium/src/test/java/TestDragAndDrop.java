import org.junit.AfterClass;
import org.junit.Before;

public class TestDragAndDrop {
    @Before
    public void BeforeTest() {
        System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
    }

    @AfterClass
    public static void AfterClass(){
        ChromeDriver.getDriver().quit();
    }

    @org.junit.Test
    public void TestDragAndDrop(){
        ChromeDriver.getInstant().navigate("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
        P5.getDrag().dragAndDrop(P5.getDraggableSpan1(), P5.getDropZone());
    }
}
