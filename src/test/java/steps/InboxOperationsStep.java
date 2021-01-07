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

public class InboxOperationsStep extends BaseUtil{

//    private  BaseUtil base;
//
//    public InboxOperationsStep(BaseUtil base) {
//        this.base = base;
//    }
//
//    @Given("^I am in inbox$")
//    public void i_am_in_inbox() throws Throwable {
//    	System.out.println("2nd FEATURE STARTS");
//    }
//
//    @When("^I find my sisters account$")
//    public void i_find_my_sisters_account() throws Throwable {
//        // navigate to sisters inbox
//    	WebDriverWait wait = new WebDriverWait(base.Driver, 100);
//    	base.Driver.get("https://www.facebook.com/messages/t/anna.brown");
//    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Anna Brown']")));
//    	
//    }
//
//    @Then("^I write her a message$")
//    public void i_write_her_a_message() throws Throwable {
//        base.Driver.findElement(By.xpath("//label[text(Hi Anna)='Anna Brown']"));
//        		
//                System.out.println ("Hi Anna");
//        		
//        		       base.Driver.quit();
//        		
//        		
//    }
}
	
		
