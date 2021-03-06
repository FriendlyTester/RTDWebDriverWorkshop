import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.LoginErrorPage;
import pageobjects.LoginPage;

/**
 * Created by IEUser on 10/05/2015.
 */
public class I_CheckUsingPageObjects {

    //http://www.thefriendlytester.co.uk/2014/05/pageobject-pattern-why-how-and-more.html

    @Test
    public void i_InvalidPasswordPageObjects()
    {
        FirefoxDriver Driver = new FirefoxDriver();
        Driver.navigate().to("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(Driver);
        loginPage.populateUsername("tomsmith");

        LoginErrorPage loginErrorPage = loginPage.clickLogin();
        Assert.assertTrue(loginErrorPage.ReadErrorMessage().contains("Your password is invalid!"));

        Driver.quit();
    }

    @Test
    public void i_IncorrectPasswordPageObjects()
    {
        //Can you create these using PageObjects
    }

    @Test
    public void i_CorrectPasswordPageObjects()
    {
        //Can you create these using PageObjects
    }
}
