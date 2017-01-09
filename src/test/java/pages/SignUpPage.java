package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 09/01/2017.
 */
public class SignUpPage {

    WebDriver driver ;

    public SignUpPage (WebDriver driver) {this.driver = driver ;}

    By Username = By.xpath("html/body/div[2]/form/table/tbody/tr[1]/td[2]/input") ;
    By Password = By.name("pw") ;
    By Create_account  = By.xpath("html/body/div[2]/form/table/tbody/tr[3]/td[2]/input") ;


    public void Click_create () {driver.findElement(Create_account).click(); }
    public void Enter_username () {driver.findElement(Username).sendKeys("Adam009");}
    public void Enter_Password () {driver.findElement(Password).sendKeys("angel");}
}
