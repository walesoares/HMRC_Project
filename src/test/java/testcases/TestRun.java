package testcases;

import base.Driver;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Wale on 09/01/2017.
 */
public class TestRun extends Driver{


    @Test(priority = 1)
    public void Do_SignUp () {

        StartingPage Stp = new StartingPage (driver) ;
        Stp.To_Click_Agree();

        HomePage Hp = new HomePage(driver) ;
        Hp.Click_Signup();

        SignUpPage SignUp = new SignUpPage(driver) ;
        SignUp.Enter_username();
        SignUp.Enter_Password();
        SignUp.Click_create();


        SignUpLandingpage SLP = new SignUpLandingpage( driver) ;
        SLP.Goto_AccountMsg();
        SLP.Click_HomeBtn(); }


    @Test (priority = 2)

    public void Do_Snippet ()  {

        SnippetPage SNP = new SnippetPage(driver) ;
        SNP.Click_Snippet();
        SNP.Enter_Snippet();
        SNP.Click_SubmitButton();

        SnippetLandingpage SNPLP = new SnippetLandingpage(driver) ;
        SNPLP.ConfirmSnippetName();  }


}
