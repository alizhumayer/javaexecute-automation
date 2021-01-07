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
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxOperationsStep2 extends BaseUtil{

    private  BaseUtil base;

    public InboxOperationsStep2(BaseUtil base) {
        this.base = base;
    }

    @When("^I find Millers account$")
    public void i_find_my_sisters_account() throws Throwable {
        // navigate to Millers inbox
    	WebDriverWait wait = new WebDriverWait(base.Driver, 100);
    	base.Driver.navigate().to("https://www.facebook.com/messages/t/miller.george");
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='George']")));
    	
    }
    	
    @Then("^I search for a textelement$")
    public void i_search_for_a_textelement() throws Throwable {
    	base.Driver.findElement(By.xpath("//*[contains(text()='How are you']"));
    	
    	
    				System.out.println ("How are you");
    			
    			base.Driver.quit();
    }
   
    }
    	

