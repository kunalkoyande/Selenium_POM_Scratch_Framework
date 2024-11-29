package qa.tests;

import org.testng.annotations.Test;

import base.baseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends baseTest{
	
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
  @Test
  public void sampleMethodForEnteringCredentials() {
	  logger.info("Sign in into LoginPage");
	  homePage.signInButton();
	  logger.info("Verifying if login text is present or not");
	  loginPage.verifyIfLoginPageIsLoaded();
	  logger.info("Enter the credentials");
	  loginPage.enterCredentials();
  }
}
