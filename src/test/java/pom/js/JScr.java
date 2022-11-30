package pom.js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JScr {

    //girdiğin pixel değerinin konumuna göre yönlendirir
    public void jsScroll(WebDriver driver)
    {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    //Elementin oldugu yeri görme
    public void jsScrollElement(WebDriver driver, WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    //Sayfayı en alt bölüme indirme

    public void jsScrollHeight(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    //Sayfanın yukarı yönlendirme
    public void jsScrollTop(WebDriver driver)
    {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,0)");
    }



}
