package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 09/01/2017.
 */
public class SnippetPage {

    WebDriver driver ;

    public SnippetPage (WebDriver driver) {this.driver = driver ;}

    By New_Snippet = By.xpath("//*[@id='menu-left']/a[3]") ;
    By SnippetBox = By.name("snippet") ;
    By SubmitButton = By.xpath("html/body/div[2]/div/form/table/tbody/tr/td[2]/input") ;


    public void Click_Snippet () { driver.findElement(New_Snippet).click();}
    public void Enter_Snippet () {driver.findElement(SnippetBox).sendKeys("HMRC");}
    public void Click_SubmitButton () {driver.findElement(SubmitButton).click();}
}
