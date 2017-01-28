package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class RegistrationStepDefs {

    WebDriver driver= new FirefoxDriver();

    @Given("^I enter the url as mandmdirect$")
    public void i_enter_the_url_as_mandmdirect() throws Throwable {
        driver.get("http://www.mandmdirect.com/");
    }
    @When("^I click on Myaccount link$")
    public void i_click_on_Myaccount_link() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='myaccount']")).click();
    }
    @Then("^I should be on \"(.*?)\" page$")
    public void i_should_be_on_page(String text) throws Throwable {
       assert( driver.findElement(By.xpath(".//*[@id='SignInDetails']/h1")).getText().contains(text));
            //assert(text==text1);
    }
    @When("^I enter my email address$")
    public void i_enter_my_email_address() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='EmailAddress']")).sendKeys("mail2chavala@gmail.com");
    }
    @When("^I Continued As guest$")
    public void i_Continued_As_guest() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='SignInDetails']/div[2]/div/label[1]")).click();
    }

    @When("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='SignInContinue']/input")).click();
    }
    @Then("^I am on \"(.*?)\"page$")
    public void i_am_on_page(String text) throws Throwable {
        assert(driver.findElement(By.xpath(".//*[@id='newAccBrief']/h1")).getText().contains(text));
    }
    @When("^I select title as \"(.*?)\"$")
    public void i_select_title_as(String title) throws Throwable {
        Select select= new Select(driver.findElement(By.xpath(".//*[@id='CardholderDetails_CardholderName_Salutation']")));
        select.selectByVisibleText(title);
    }

    @When("^I enter firstName as \"(.*?)\"$")
    public void i_enter_firstName_as(String firstName) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='CardholderDetails_CardholderName_FirstName']")).sendKeys(firstName);
    }

    @When("^I entet secondName as \"(.*?)\"$")
    public void i_entet_secondName_as(String lastName) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='CardholderDetails_CardholderName_Surname']")).sendKeys(lastName);
    }
    @When("^I enter mobileNumber as \"(.*?)\"$")
    public void i_enter_mobileNumber_as(String mobileNumber) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='CustomerDetails_Mobile']")).sendKeys(mobileNumber);
    }

    @When("^I enter ConfirmEmailAddress as \"(.*?)\"$")
    public void i_enter_ConfirmEmailAddress_as(String ConfirmEmailAddress) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='CustomerDetails_ConfirmEmailAddress']")).sendKeys(ConfirmEmailAddress);
    }

    @When("^I enter the Password as \"(.*?)\"$")
    public void i_enter_the_Password_as(String Password) throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='SignUpDetails_Password']")).sendKeys(Password);
    }

    @When("^I enter the Confirmation password as \"(.*?)\"$")
    public void i_enter_the_Confirmation_password_as(String ConfirmationPassword) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='SignUpDetails_ConfirmPassword']")).sendKeys(ConfirmationPassword);
    }

    @When("^I entet Country as \"(.*?)\"$")
    public void i_entet_Country_as(String Country) throws Throwable {
        Select select= new Select(driver.findElement(By.xpath(".//*[@id='CardholderDetails_FindAddress_Country']")));
        select.selectByVisibleText(Country);
    }

    @When("^I enter HouseNumber/Name as \"(.*?)\"$")
    public void i_enter_HouseNumber_Name_as(String HouseNumber) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='CardholderDetails_FindAddress_AddressLine1']")).sendKeys(HouseNumber);
    }
    @When("^I enter Postcode as \"(.*?)\"$")
    public void i_enter_Postcode_as(String Postcode) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='CardholderDetails_FindAddress_PostCode']")).sendKeys(Postcode);
    }
    @Then("^I click on \"(.*?)\" link$")
    public void i_click_on_link(String arg1) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='find_address_btn']")).click();
    }
    @When("^I click on \"(.*?)\"button$")
    public void i_click_onbutton(String arg1) throws Throwable {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.xpath(".//*[@id='LowerContinue']/input")).isEnabled();
        driver.findElement(By.xpath(".//*[@id='LowerContinue']/input")).click();
    }

    @When("^I enter the Password \"(.*?)\"$")
    public void i_enter_the_Password(String Password) throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys(Password);
    }
    @Then("^I should see the \"(.*?)\" page$")
    public void i_should_see_the_page(String text) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='SignInContinue']/input")).sendKeys(text);
    }


    @Then("^I should see \"(.*?)\" page$")
    public void i_should_see_page(String text) throws Throwable {
        assert( driver.findElement(By.xpath("html/body/div[2]/div/h1")).getText().contains(text));
    }
    @When("^I click on \"(.*?)\"$")
    public void i_click_on(String arg1) throws Throwable {
        driver.findElement(By.xpath(".//*[@id='rightMandMContainer']/div[4]/input")).click();
    }
    @Then("^I should be on Panel Navigation page$")
    public void i_should_be_on_Panel_Navigation_page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='pnlNavigation']"));
    }

}
