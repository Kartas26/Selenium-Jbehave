import org.openqa.selenium.WebDriver;

public class ChromeDriver {
    private static WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
    private static ChromeDriver chromeDriver;
    private ChromeDriver() {}
    static ChromeDriver getInstant(){
        if(chromeDriver==null){
            chromeDriver=new ChromeDriver();
        }
        return chromeDriver;
    }
    static void navigate(String url){
        driver.navigate().to(url);
    }

    static WebDriver getDriver() {
        return driver;
    }
}
