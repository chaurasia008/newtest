package AssQues1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;


public class TestScenario {
	
    WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By loginbutton=By.id("wp-submit");
	By Users =By.id("menu-users");	
	By Searchuser =By.id("user-search-input");	
	By Submit =By.id("search-submit");	
	By Dashboard=By.className("wp-menu-name");
	//By AddNew=By.xpath(".//*[@id='wpbody-content']/div[4]/a");
	By AddNew=By.className("page-title-action");
	// Textboxes
	By firstname=By.id("first_name");
	By lastname=By.id("last_name");
	By website=By.id("url");
	By email=By.id("email");
	By usernickname=By.id("nickname");
	By userdescription=By.id("description");
	//Button
	By AddUserButton=By.id("createusersub");
	By UpdateprofileButton=By.xpath(".//*[@id='submit']");
	//checkboxes
	By checkbox=By.id("send_user_notification");
	By yourProfile=By.xpath(".//*[@id='menu-users']/ul/li[4]/a");
	By VisualEditor=By.id("rich_editing");
	By SyntaxHighlightr=By.id("syntax_highlighting");
	By Keybrdshrtcut=By.id("comment_shortcuts");
	By Toolbar=By.id("admin_bar_front");
	//drop down
	//By Toolbar=By.id("role");
	//By Toolbar=
	
	//constructor of the class 
	public TestScenario(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void typeUserName(String uid)
	{
		
		driver.findElement(username).sendKeys(uid);
		
		
	}

	public void typePassword(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
		
		
	}
	
	
	public void submitpage()
	{
		
		driver.findElement(loginbutton).click();
		
		
	}
	
	public void GOtoAllUsers() throws InterruptedException
	{
		//Wait for the application to load
		
		WebDriverWait  wait = new WebDriverWait  (driver,505);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(Users));
         //Thread.sleep(455);
		driver.findElement(Users);
		driver.findElement(Users).click();
		
	}
	
	
	public void SearchAllUsers(String user)
	{
		
	
		
		driver.findElement(Searchuser).sendKeys(user);
	driver.findElement(Submit).click();
		//Validate assert or test displayed 
		
	//WebDriverWait  wait = new WebDriverWait  (driver,505);
	
	//String Getpagetitle = driver.getTitle();
	
	//Verify using assert(Actual title using getTitle method,Expected title passed in feature file);
	
//	Assert.assertEquals(Getpagetitle,PageTitle);
		
	}
	
	/*public void GotoDashboard()
	{
	//	driver.findElement(Dashboard).click();
		//driver.findElement(ALLUsers).click();
	}*/
	
	

	public void AddUser_TxtbxUsr(String user) {
		// TODO Auto-generated method stub
		driver.findElement(AddNew).click();
		driver.findElement(username).sendKeys(user);
	}


	public void AddUser_Email(String emailid) {
		// TODO Auto-generated method stub
		driver.findElement(email).sendKeys(emailid);
		
		
	}


	public void AddUser_FirstName(String frstname) {
		// TODO Auto-generated method stub
		driver.findElement(firstname).sendKeys(frstname);
	}


	public void AddUser_LastName(String lstname) {
		// TODO Auto-generated method stub
		driver.findElement(lastname).sendKeys(lstname);
	}


	public void AddUser_Website(String webste) {
		// TODO Auto-generated method stub
		driver.findElement(website).sendKeys(webste);
	}


	public void AddUser_Button() {
		// TODO Auto-generated method stub
		driver.findElement(AddUserButton).click();
			
	}


	public void checkboxclick() {
		// TODO Auto-generated method stub
		driver.findElement(checkbox).click();
	}


	public void Update_checkbox_VisualEditor() {
		// TODO Auto-generated method stub
		driver.findElement(VisualEditor).click();
		
		
	}


	public void Update_checkbox_SyntaxHighlightr() {
		// TODO Auto-generated method stub
		driver.findElement(SyntaxHighlightr).click();
		
	}


	public void Update_checkbox_Keybrdshrtcut() {
		// TODO Auto-generated method stub
		driver.findElement(Keybrdshrtcut).click();
		
	}


	public void Update_checkbox_Toolbar() {
		// TODO Auto-generated method stub
		driver.findElement(Toolbar).click();
		
	}


	public void GOtoUpdateProfilePage() {
		// TODO Auto-generated method stub
		
		driver.findElement(yourProfile).click();
		
	}


	public void Update_First_Name(String updateFirstname) {
		// TODO Auto-generated method stub
		driver.findElement(firstname).sendKeys(updateFirstname);
	}


	public void Update_Last_Name(String updateLastname) {
		// TODO Auto-generated method stub
		driver.findElement(lastname).sendKeys(updateLastname);
	}


	public void Update_nick_Name(String updateNickname) {
		// TODO Auto-generated method stub
		driver.findElement(usernickname).sendKeys(updateNickname);
	}


	public void Update_email(String updateEmail) {
		// TODO Auto-generated method stub
		driver.findElement(email).sendKeys(updateEmail);
	}


	public void UpdateProfile_button() {
		// TODO Auto-generated method stub
		driver.findElement(UpdateprofileButton).click();
	}


	public void Update_description(String description) {
		// TODO Auto-generated method stub
		driver.findElement(userdescription).sendKeys(description);
	}


	public void Update_language_dropdown() {
		// TODO Auto-generated method stub
		
	}


	public void SelectDropDown(String optionselect) {
		// TODO Auto-generated method stub
		WebElement select = driver.findElement(By.id("role"));
	    List<WebElement> options = select.findElements(By.tagName("option"));


	    for (WebElement option : options) {
	        if("Contributor".equals(option.getText()))
	            option.click();
	    }

	        }


	public void Update_language_dropdown(String langdropdwn) {
		// TODO Auto-generated method stub
		WebElement select = driver.findElement(By.id("locale"));
	    List<WebElement> options = select.findElements(By.tagName("option"));


	    for (WebElement option : options) {
	        if("English (UK)".equals(option.getText()))
	            option.click();
	    }

	}
	    

		//Select dropdown = new Select(driver.findElement(By.id("mySelect")));]]
	
	
	
	
	
		
	}
	
	





