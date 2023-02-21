package JavaProject2;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver [] web={new ChromeDriver(),new FirefoXDriver(),new SafariDriver()};

        for (WebDriver w:web
             ) {
            w.open();
            w.close();
            w.getTitle();
        }

        TakeScreenShot [] screenshot={new ChromeDriver(),new FirefoXDriver(),new SafariDriver()};
        for (TakeScreenShot ss:screenshot
             ) {
            ss.getScreenshot();
            ss.navigate();
        }
    }

}
