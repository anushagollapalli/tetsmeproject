package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Stepdefs{
	 static WebDriver driver;
	
	@Given("TestMe App is launched")
	public void testme_App_is_launched() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	
	}

	@Then("click on SignUp link")
	public void click_on_SignUp_link() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("fill username {string}")
	public void fill_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill firstname {string}")
	public void fill_firstname(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
		
	}
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	

	@Then("fill lastname {string}")
	public void fill_lastname(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill password {string}")
	public void fill_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("confirmpassword {string}")
	public void confirm_password(String string) {
		driver.findElement(By.name("ConfirmPassword")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill gender")
	public void fill_gender() {
		driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill email {string}")
	public void fill_email(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill mobilenumber {string}")
	public void fill_mobilenumber(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill DOB {string}")
	public void fill_DOB(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill address {string}")
	public void fill_address(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("fill sec question")
	public void fill_sec_question() {
		Select s=new Select(driver.findElement(By .name("securityQuestion")));
	     s.selectByValue("411010");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("fill answer {string}")
	public void fill_answer(String string)
	{driver.findElement(By.name("answer")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("click on registration button")
	public void click_on_registration_button() {
		driver.findElement(By .xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("verify the registration login")
	public void verify_the_registration_login() {
		System.out.println("USERNAME already exists");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("enter valid credentials in user name {string}")
	public void enter_valid_credentials_in_user_name(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		

		driver.findElement(By.name("userName")).sendKeys(string);
	
		
		
		// Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("enter valid credentials in password {string}")
	public void enter_valid_credentials_in_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("click on login page")
	public void click_on_login_page() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("verify Login Process")
	public void verify_Login_Process() {
		String actual="SignOut";
		
		String expected=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		 System.out.println(expected);
		
		 Assert.assertEquals(expected,actual);
		 driver.findElement(By.xpath("//*[@id=\\\"header\\\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("search for product")
	public void search_for_product() {
		
		driver.findElement(By .xpath("//*[@id=\"myInput\"]")).click();
		driver.findElement(By .name("products")).sendKeys("Headphone");
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@Then("click on find details")
	public void click_on_find_details() {
		driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on add to cart")
	
	public void click_on_add_to_cart() {
		
//		 driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
//		 driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
//		 driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
		 
		 
		 
		
		

		driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		 driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		

		//driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("proceed with payment")
	public void proceed_with_payment() {
		
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   //click on andhrabank
		   driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		   //click on continue
		   driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
		   //username
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		   //password
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		   //login
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		   //transactionpassword
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		   
		  
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("continue payment process")
	public void continue_payment_process() {
		driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Given("search the headphone")
	public void search_the_headphone() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		 driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("password123");
		 driver.findElement(By .xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		 driver.findElement(By .xpath("//*[@id=\"myInput\"]")).click();
			driver.findElement(By .name("products")).sendKeys("Headphone");
			driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("it is not added to cart")
	public void it_is_not_added_to_cart() {
		 driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("try to proceed payment without adding")
	public void try_to_proceed_payment_without_adding() {
		boolean ex=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		Assert.assertFalse(ex);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("testme app doesnt proceed")
	public void testme_app_doesnt_proceed() {
		System.out.println("sorry no products are available in the cart");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}

