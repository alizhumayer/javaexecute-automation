package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{

    private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("Navigate Login Page");
        base.Driver.navigate().to("https://www.facebook.com/");
    }

    @And("^I enter username and password$")
    public void iEnterUsernameAndPassword() throws Throwable {
   	Thread.sleep(5000);
   	WebDriverWait wait = new WebDriverWait(base.Driver, 30000);
   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
   	
   	base.Driver.findElement(By.id("email")).sendKeys("brownkate@gmail.com");
   	base.Driver.findElement(By.id("pass")).sendKeys("8.k@2,jlz");
   	base.Driver.findElement(By.id("loginbutton")).click();
    }
    
    
    @Then("^I am in$")
    public void i_am_in() throws Throwable {
    	System.out.println("I AM IN");
    }
    
    @Given("^I am in inbox$")
    public void i_am_in_inbox() throws Throwable {
    	System.out.println("2nd FEATURE STARTS");
    }

    @When("^I find my sisters account$")
    public void i_find_my_sisters_account() throws Throwable {
        // navigate to sisters inbox
    	WebDriverWait wait = new WebDriverWait(base.Driver, 100);
    	base.Driver.get("https://www.facebook.com/messages/t/anna.brown");
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
    	Thread.sleep(2000);
    }

    @Then("^I write her a message$")
    public void i_write_her_a_message() throws Throwable {
    	//
        WebElement inputFieldForMessage = base.Driver.findElement(By.xpath("//div[@contenteditable='true']"));
        inputFieldForMessage.sendKeys("Szia Anna");
        inputFieldForMessage.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
                System.out.println ("we said Szia Anna");
        		       base.Driver.quit();
    }
}

