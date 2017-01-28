package StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by subbu on 28/01/2017.
 */
public class LoginStepDefs {
    WebDriver driver= new FirefoxDriver();

//    @When("^I Continued As existing customer$")
//    public void i_Continued_As_existing_customer() throws Throwable {
//        driver.findElement(By.xpath(".//*[@id='SignInDetails']/div[2]/div/label[2]")).click();
//    }
    @When("^I enter the Password \"(.*?)\"$")
    public void i_enter_the_Password(String password) throws Throwable {
        driver.findElement(By.cssSelector("#Password")).sendKeys(password);

    }

    @Then("^I should see \"(.*?)\" page$")
    public void i_should_see_page(String text) throws Throwable {
        assert( driver.findElement(By.xpath("html/body/div[2]/div/h1")).getText().contains(text));
    }
    @When("^I click on \"(.*?)\"$")
    public void i_click_on(String arg1) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='rightMandMContainer']/div[4]/input")).click();
    }
    @Then("^I should be on \"(.*?)\"$")
    public void i_should_be_on(String text) throws Throwable {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        assert( driver.findElement(By.xpath(".//*[@id='pnlNavigation']")).getText().contains(text));

    }
}
