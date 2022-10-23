package Class23_Absrtraction_AND_Interfaces;

class TestDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    public static void main(String[] args) {
        WebDriver[]run={new ChromeDriver(),new FireFoxDriver()};
          for(WebDriver runBehaviors:run){
              runBehaviors.openBrowser();
              runBehaviors.findElement();
              runBehaviors.maximizeWindow();
              runBehaviors.closeBrowser();
          }
    }
}
public interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver  implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome Browser Window");
    }
    @Override
    public void findElement() {
        System.out.println("Perform find Element in Chrome Browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close the browser Chrome");
    }
}

class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox Browser Window");
    }
    @Override
    public void findElement() {
        System.out.println("Perform find Element in FireFox Browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close the browser FireFox");
    }
}

