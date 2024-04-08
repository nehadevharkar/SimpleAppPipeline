package Bank.Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	WebDriver driver;
	@Test (enabled=false)
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\extractchromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.google.com"); 
	    WebElement p=driver.findElement(By.name("q"));
	    p.sendKeys("VIT");
	    p.submit();
	}
	
	@Test
	public void validateLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\extractchromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    WebElement u=driver.findElement(By.name("user-name"));
	    u.sendKeys("standard_user1");
	    WebElement p=driver.findElement(By.name("password"));
	    p.sendKeys("secret_sauce2");
	    WebElement l=driver.findElement(By.name("login-button"));
	    l.click();
	    String expectedURL="https://www.saucedemo.com/inventory.html";
	    String actualURL=driver.getCurrentUrl();
	    System.out.println("Actual URL"+actualURL);
	    Assert.assertEquals(expectedURL,actualURL);
	}
	
	@Test(enabled=false)
	public void loginCheck()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\extractchromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/users/sign_in");
	WebElement username=driver.findElement(By.id("user_email_Login"));
	WebElement password=driver.findElement(By.id("user_password"));
	WebElement login=driver.findElement(By.name("commit"));
	username.sendKeys("abc@gmail.com");
	password.sendKeys("your_password");
	login.click();
	String actualUrl="https://live.browserstack.com/dashboard";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
	}
	
	@Test(enabled=false)
	public void loginCheck1()
	{
		String url = "https://www.lambdatest.com/";
		driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement login = driver.findElement(By.linkText("Login"));
        System.out.println("Clicking on the login element in the main page");
        login.click();
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        email.clear();
        System.out.println("Entering the email");
        email.sendKeys("your_email");
 
        password.clear();
        System.out.println("entering the password");
        password.sendKeys("your_password");
 
        System.out.println("Clicking login button");
        loginButton.click();
 
        String title = "Welcome - LambdaTest";
 
        String actualTitle = driver.getTitle();
 
        System.out.println("Verifying the page title has started");
        Assert.assertEquals(actualTitle,title,"Page title doesn't match");
 
        System.out.println("The page title has been successfully verified");
 
        System.out.println("User logged in successfully");
 
      //  driver.quit();
    }
	
}
