package AssQues1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(ReportingListener.class)
public class LoginPomClass {
	
WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser()

	
	{
		
		System.out.println("Test");
		
		System.setProperty("webdriver.gecko.driver", "Jars\\geckodriver.exe");
	
		driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
	}

	@Test(priority=1)
	public void verifyValidLogin()
	{
		TestScenario Login=new TestScenario(driver);
		Login.typeUserName("Admin");
		Login.typePassword("demo123");
		Login.submitpage();
		
		
	}
	
	@Test(priority=2)
	public void verifyAllUser() throws InterruptedException
	{
		TestScenario Login=new TestScenario(driver);
		//Login.typeUserName("Admin");
		//Login.typePassword("demo123");
		Login.GOtoAllUsers();
		Login.SearchAllUsers("Admin");
	
		
	}
	
	@Test(priority=3)
	public void verifyAddNewUser() throws InterruptedException
	{
		TestScenario Login=new TestScenario(driver);
		Login.AddUser_TxtbxUsr("Rashmee12345");
		Login.AddUser_Email("rashmee.saxena12@test.com");
	    Login.AddUser_FirstName("Rashmee01");
	    Login.AddUser_LastName("Saxena01");
	    Login.AddUser_Website("www.rashmeesaxena.com");
	    Login.checkboxclick();
	  Login.SelectDropDown("Contributor");
	    Login.AddUser_Button();
	    
		
	}
	
	@Test(priority=4)
	public void verifyUpdateProfilePge() throws InterruptedException
	{
		TestScenario Login=new TestScenario(driver);
		Login.GOtoUpdateProfilePage();
		Login.Update_checkbox_VisualEditor();
		Login.Update_checkbox_SyntaxHighlightr();
	    Login.Update_checkbox_Keybrdshrtcut();
	    Login.Update_checkbox_Toolbar();
	    Login.Update_First_Name("Rashmee0101");
	    Login.Update_Last_Name("Saxena0101");
	    Login.Update_nick_Name("Saxena0101");
	    Login.Update_email("Saxena0101");
	    Login.Update_description("This is my profile...");
	    Login.Update_language_dropdown("English (UK)");
	    Login.UpdateProfile_button();
	    //Login.AddUser_Website("www.rashmeesaxena.com");
	   // Login.checkboxclick();
	   // Login.SelectDropDown();
	  //  Login.AddUser_Button();
	    
		
	}

}


