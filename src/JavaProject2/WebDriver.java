package JavaProject2;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}
 interface RemoteWebDriver extends WebDriver{

    void navigate();

}

interface TakeScreenShot extends RemoteWebDriver{

    void getScreenshot();

    @Override
    void navigate();
}
class ChromeDriver implements WebDriver,RemoteWebDriver,TakeScreenShot{

    @Override
    public void open() {
        System.out.println("Chrome Driver open");
    }

    @Override
    public void close() {
        System.out.println("Chrome Driver close");
    }

    @Override
    public String getTitle() {
        return "Chrome driver get the title";
    }

    @Override
    public void navigate() {

        System.out.println("Chrome Driver navigate");
    }

    @Override
    public void getScreenshot() {

        System.out.println("chrome driver get screenshot");
    }
}
class FirefoXDriver implements WebDriver,RemoteWebDriver,TakeScreenShot{

    @Override
    public void open() {
        System.out.println("Firefox open");
    }

    @Override
    public void close() {
        System.out.println("Firefox close");
    }

    @Override
    public String getTitle() {
        return "Firefox get title";
    }

    @Override
    public void navigate() {
        System.out.println("Firefox navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("firefox get screenshot");
    }
}

class SafariDriver implements WebDriver,RemoteWebDriver,TakeScreenShot{

    @Override
    public void open() {
        System.out.println("Safari open");
    }

    @Override
    public void close() {
        System.out.println("Safari close");
    }

    @Override
    public String getTitle() {
        return "Safari get title";
    }

    @Override
    public void navigate() {
        System.out.println("Safari navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari get Screen shot");
    }
}