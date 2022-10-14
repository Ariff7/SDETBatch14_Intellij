package Class21_MethodOverRiding;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("opening the url ");
    }
    void test(){
        System.out.println("testing the web[age");
    }
    void closeBrowser(){
        System.out.println("Closing the Browser");
    }
}

class Chrome extends Browser{
    void openBrowser(){
        System.out.println("opening the browser in less than 1 sec");
    }
}

class Firefox extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser in less than 2 sec");
    }
}

