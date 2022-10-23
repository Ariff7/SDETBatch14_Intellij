package Class22_Poliymorphism_AND_objectCasting;

public class WebDriverTester {
    public static void main(String[] args) {

       /* Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.test();

        System.out.println("---------");

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        System.out.println("-----------------");

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();

        */

        // Chrome chromse=new Chrome();
        // Firefox firefox=new Firefox();
        // Safari safari=new Safari();
        // WebDriver[] browsers={chrome, firefox,safari};
        //^^ Creating objects of all child classes and storing them in an array
        //   of type WebDriver we can do this because upcasting allows us to do this
        WebDriver[]browsers={new Chrome(),new FireFox(),new Safari()};
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        //for loop

        for (int i=0; i< browsers.length; i++){
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }


    }
}
