package FirstGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
WebDriver driver;
// to get connected with LoginPage declare it here
pages.Loginpage Loginpage;
@BeforeTest

public void launch() {
	driver =new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
}
@Test

public void enterEmailId() {
	Loginpage = new pages.Loginpage(driver);
	Loginpage.setEmail();
}







}
