package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 09/01/2017.
 */
public class SnippetLandingpage {

    WebDriver driver ;

    public SnippetLandingpage (WebDriver driver){this.driver = driver ; }

    By Snippetname = By.xpath("//*[@id='0']");


    public void ConfirmSnippetName (){
        Assert.assertTrue(driver.findElement(Snippetname).isDisplayed());

    }

}
