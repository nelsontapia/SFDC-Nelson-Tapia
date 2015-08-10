package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Nelson Tapia on 8/10/2015.
 */
public class WindowsPopUp {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public WindowsPopUp(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public WebDriver getHandleWindows(){
        Set<String> setWindows = driver.getWindowHandles();
        LinkedList<String> listWindows = new LinkedList<String>(setWindows);
        driver.switchTo().window(listWindows.getLast());
        //return new WindowsPopUp(driver);
        return driver;
    }

    public WebDriver currentWindow(){
        Set<String> setWindows = driver.getWindowHandles();
        LinkedList<String> listWindows = new LinkedList<String>(setWindows);
        driver.switchTo().window(listWindows.getFirst());
        //return new WindowsPopUp(driver);
        return driver;
    }
    /*
    public WebDriver getHandleToWindow(String title){

        //WebDriver driver = null;

        //parentWindowHandle = driver.getWindowHandle(); // save the current window handle.
        WebDriver popup = null;
        Set<String> windowIterator = driver.getWindowHandles();
        System.err.println("No of windows :  " + windowIterator.size());
        for (String s : windowIterator) {
            String windowHandle = s;
            popup = driver.switchTo().window(windowHandle);
            System.out.println("Window Title : " + popup.getTitle());
            System.out.println("Window Url : " + popup.getCurrentUrl());
            if (popup.getTitle().equals(title) ){
                return popup;
            }

        }
        return popup;
    }
    */

}
