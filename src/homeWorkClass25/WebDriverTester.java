package homeWorkClass25;

public class WebDriverTester {

    public static void main(String[] args) {
        WebDriver [] webDriver= {new ChromeDriver(),new FireFoxDriver()};

        for( WebDriver w:webDriver){

            w.openBrowser();
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();
    }
    }
}
