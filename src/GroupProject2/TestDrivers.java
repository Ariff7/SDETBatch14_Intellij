package GroupProject2;

public class TestDrivers {
    public static void main(String[] args)
    {
        RemoteWebDriver [] array = {new ChromeWebDriver(), new FirefoxWebDriver(), new SafariWebDriver()};

        for (RemoteWebDriver temp : array)
        {
            System.out.println(temp.getTitle());
            temp.open();
            temp.navigate();
            temp.getScreenShot();
            temp.close();
            System.out.println();
        }
    }
}
