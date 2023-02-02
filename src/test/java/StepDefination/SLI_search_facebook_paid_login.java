package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Setupclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SLI_search_facebook_paid_login extends BaseClass {

	@Given("User is home page_vii$")

	public void user_is_home_page_vii() throws Throwable {
		BaseClass.ClearfacebookCache();

		driver.get(AppURL);
		log.info("It's opening the website URL");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		BaseClass.ClearBrowserCache();
	}

	@Then("user will clicks on the sign in with Facebook button_vii$")
	public void user_will_clicks_on_the_sign_in_with_facebook_button_vii() throws Throwable {
		Thread.sleep(4000);
		WebElement Sign_in_with_facebook = BaseClass
				.elementToBeClickable(By.xpath("//ul[@class='social_links']//i[@class='icon fa fa-facebook']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Sign_in_with_facebook);
		System.out.println("facebook button clicked");
	}

	@Then("user enters the username and password_vii$")
	public void user_enters_the_username_and_password_vii() throws Throwable {
		Thread.sleep(4000);
		driver.manage().window().maximize();
		// String handle = " ";
		String currentWindow = driver.getWindowHandle();
		String popupWindowHandle = null;

		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(currentWindow)) {

				popupWindowHandle = handle;
				driver.switchTo().window(popupWindowHandle);
				// driver.manage().window().maximize();

				Thread.sleep(4000);

				WebElement fb_email = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
				fb_email.clear();
				fb_email.sendKeys("slidetech.qa@gmail.com");
				Thread.sleep(3000);
				WebElement fb_pass = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));

				fb_pass.clear();
				fb_pass.sendKeys("himanshi@123");
				Thread.sleep(3000);
				try {
					if (!driver.findElements(By.xpath("//input[@value='Log in']")).isEmpty()) {
						driver.findElement(By.xpath("//input[@value='Log in']")).click();
					} else {
						WebElement fb_login = wait.until(
								ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginbutton']")));

						fb_login.click();
						Thread.sleep(3000);
					}
				} catch (NoSuchElementException e) {

				}
				// to verify the continue button
				// button[normalize-space()='Yes, Continue']

			}
		}
		driver.switchTo().window(currentWindow);
	}

	@Then("enter keyword in search field_vii$")
	public void enter_keyword_in_search_field_vii() throws Throwable {
		Thread.sleep(5000);
		WebElement search_field = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
		Thread.sleep(2000);
		search_field.sendKeys("software");
		Thread.sleep(3000);
	}

	@Then("user selects and download the PPT_vii$")
	public void user_selects_and_download_the_ppt() throws InterruptedException {
		try {

			List<WebElement> select_Ppt = driver.findElements(By.xpath("//div[@class = 'productList']//a//img"));
			select_Ppt.get(1).click();
			Thread.sleep(3000);

			WebElement download_Ppt = BaseClass.elementToBeClickable(By.linkText("Download this Presentation"));
			js.executeScript("arguments[0].scrollIntoView();", download_Ppt);
			download_Ppt.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {

		}
	}

	@Then("user clicks on the Logout page_vii$")
	public void user_clicks_on_the_logout_page_vii() throws Throwable {
		try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}

	}

}
