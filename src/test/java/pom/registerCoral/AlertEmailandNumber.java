package pom.registerCoral;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AlertEmailandNumber {
    public void emailAlert(WebDriver driver, WebElement element)
    {
        String a="Bu email adresi zaten sistemde kayıtlı";
        element=driver.findElement(By.xpath("//*[text()='Bu email adresi zaten sistemde kayıtlı']"));
        String b=element.getText();
        Assert.assertEquals(a,b);
    }

}
