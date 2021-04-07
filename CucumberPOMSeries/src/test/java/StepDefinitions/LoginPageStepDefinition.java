package StepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageStepDefinition {
	
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());

		@Given("user is on login page")
		public void user_is_on_login_page() {
			
			DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		   
		}


		@When("user gets the title page")
		public void user_gets_the_title_page() {
			String logintitle=loginpage.getLoginPageTitle();
			   System.out.println("title od\f the login page is :"+logintitle);
		}
		@Then("page title should be {string}")
		public void page_title_should_be1(String expectedtitle) {
			String logintitle=loginpage.getLoginPageTitle();
			   System.out.println("title of the login page is :"+logintitle);
			   Assert.assertTrue(logintitle.contains(expectedtitle));
		}
		
/*
			@Given("user is on login page")
			public void user_is_on_the_login_page() {
				DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

			}*/

			@Then("forgot password page should be displayed")
			public void forgot_password_page_should_be_displayed() {
			  
				Assert.assertTrue(loginpage.isForgotLinkExist());
			}
			

				/*@Given("user is on login page")
				public void user_is_on_the_login_page1() {
					DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
*/
				   
				
				@When("user enters username {string}")
				public void user_enters_username(String userrr) {
					loginpage.enterUsername(userrr);
				    
				}
				@When("user eters password {string}")
				public void user_eters_password(String pwd) {
					
					loginpage.enterPassword(pwd);
				   
				}
				@Then("user clicks on Login button")
				public void user_clicks_on_login_button() {
				    // Write code here that turns the phrase above into concrete actions
				    throw new io.cucumber.java.PendingException();
				}
				









	

}
