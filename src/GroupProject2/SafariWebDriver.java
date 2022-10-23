package GroupProject2;

public class SafariWebDriver implements RemoteWebDriver {
    @Override
    public void navigate()
    {
        System.out.println("Test navigate method");
    }

    @Override
    public void open()
    {
        System.out.println("Test open method");
    }

    @Override
    public void close()
    {
        System.out.println("Test close method");
    }

    @Override
    public String getTitle()
    {
        return "Safari";
    }

    @Override
    public void getScreenShot() {
        System.out.println("Test getScreenshot method");

    }
}
