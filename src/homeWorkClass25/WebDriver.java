package homeWorkClass25;

import java.sql.SQLOutput;

/* Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {

    void openBrowser();

    void closeBrowser();

    void maximizeWindow ();

    void findElement();
    }

    class ChromeDriver implements WebDriver {

        @Override
        public void openBrowser() {
            System.out.println("Chrome open browser");

        }

        @Override
        public void closeBrowser() {
            System.out.println("Chrome Close Browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Chrome maximize browser");

        }

        @Override
        public void findElement() {
            System.out.println("Chrome find element");
        }
    }
       class FireFoxDriver implements WebDriver{
            @Override
            public void openBrowser() {
                System.out.println("Firefox open");
            }

            @Override
            public void closeBrowser() {
                System.out.println("Firefox close");
            }

            @Override
            public void maximizeWindow() {
                System.out.println("Firefox maximize");
            }

            @Override
            public void findElement() {
                System.out.println("firefox find elements");

            }
        }



