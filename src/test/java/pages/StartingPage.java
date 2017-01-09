package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 09/01/2017.
 */
public class StartingPage {

    WebDriver driver ;

    public StartingPage (WebDriver driver) {this.driver = driver ;  }

    By Agree_start = By.linkText ("Agree & Start") ;

    public void To_Click_Agree  (){
        driver.findElement(Agree_start).click();
    }
}
