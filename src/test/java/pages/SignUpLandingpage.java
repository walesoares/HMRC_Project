package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 09/01/2017.
 */
public class SignUpLandingpage {

    WebDriver driver ;

    public SignUpLandingpage (WebDriver driver) {this.driver = driver ;}

    By HomeBtn = By.xpath("//*[@id='menu-left']/a") ;
    By AccountMsg = By.xpath("html/body/div[2]") ;


    public void Goto_AccountMsg () {
        Assert.assertTrue(driver.findElement(AccountMsg).isDisplayed());
    }

    public void Click_HomeBtn () {driver.findElement(HomeBtn).click();}
}


