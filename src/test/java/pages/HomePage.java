package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 09/01/2017.
 */
public class HomePage {

    WebDriver driver ;
    public HomePage (WebDriver driver) {this.driver = driver ;}

    By Sign_up = By.xpath( "//*[@id='menu-right']/a[2]") ;
    By Sign_in = By.xpath("//*[@id='menu-right']/a[1]") ;

    public void Click_Signup (){
        driver.findElement(Sign_up).click();
    }

}

