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

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;

public class Google_free_login extends BaseClass {

	@Given("^User is home pageiiv$")
	public void user_is_home_pageiiv() throws Throwable {
		BaseClass.ClearGoggleCache();
		driver.get(AppURL);
		log.info("It's opening the website URL");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		BaseClass.ClearBrowserCache();
	}

	@Then("user click on the Free PPts under free stuffiiv$")
	public void user_click_on_the_free_p_pts_under_free_stuffiiv() throws InterruptedException {
		try {
			Thread.sleep(3000);
			WebElement free_Slides = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("FREE SLIDES")));
			free_Slides.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
		}
	}

	@Then("User try to download the free pptsiiv$")
	public void user_try_to_download_the_free_pptsiiv() throws Throwable {

		try {

			List<WebElement> select_Ppt = driver
					.findElements(By.xpath("//div[@class = 'product-wrapper-row']//a//img"));
			select_Ppt.get(1).click();
			Thread.sleep(3000);

			Thread.sleep(3000);
			WebElement download_ppt = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='download_product']")));
			js.executeScript("arguments[0].scrollIntoView();", download_ppt);
			download_ppt.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {

		}
	}

	@Then("user is on home page page and click on google buttoniiv$")
	public void user_is_on_home_page_page_and_click_on_google_buttoniiv() throws Throwable {
		// Click on Sign in with Google Account

		// with login pop-up

		/*
		 * WebElement existingUser = wait
		 * .until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//a[normalize-space()='Existing Users']")));
		 * 
		 * js.executeScript("arguments[0].click();", existingUser); Thread.sleep(2000);
		 * WebElement sign_in_with_Google = wait.until(
		 * ExpectedConditions.elementToBeClickable(By.
		 * xpath("//div[@class ='is-selected']//ul//li[3]//img"))); Thread.sleep(2000);
		 * js.executeScript("arguments[0].click();", sign_in_with_Google);
		 */

		// without login pop-up
		WebElement sign_in_with_Google = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icon fa fa-google']")));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", sign_in_with_Google);

		Thread.sleep(3000);

	}

	@Then("user Enters the free username and passwordiiv$")
	public void user_Enters_the_free_username_and_passwordiiv() throws Throwable {

		driver.manage().window().maximize();

		// Store the CurrentWindow for future reference
		// String handle = " ";
		String currentWindow = driver.getWindowHandle();
		String popupWindowHandle = null;

		// Switch To Popup Window

		for (String handle : driver.getWindowHandles()) {
			if (!handle.equals(currentWindow)) {

				popupWindowHandle = handle;
				driver.switchTo().window(popupWindowHandle);
				driver.manage().window().maximize();

				Thread.sleep(5000);

				if (!driver.findElements(By.xpath("//div[@class='BHzsHc']")).isEmpty()) {
					WebElement another_btn = BaseClass
							.elementToBeClickable(By.xpath("//div[text()='Use another account']"));
					another_btn.click();
				}

				WebElement g_email = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='identifierId']")));
				g_email.sendKeys("slidetech.qa@gmail.com");
				Thread.sleep(3000);

				WebElement g_login_btn1 = wait.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#identifierNext > div > button > span")));
				g_login_btn1.click();

				Thread.sleep(3000);

				WebElement g_pass = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));

				g_pass.sendKeys("Himanshi@123");

				Thread.sleep(3000);
				WebElement g_login_btn2 = wait.until(
						ExpectedConditions.elementToBeClickable(By.cssSelector("#passwordNext > div > button > span")));
				g_login_btn2.click();

				Thread.sleep(5000);
			}
		}
		driver.switchTo().window(currentWindow);
		Thread.sleep(3000);
	}

	@Then("user downloads the free PPTiiv$")
	public void user_downloads_the_free_pptiiv() throws Throwable {
		try {
			Thread.sleep(5000);
			WebElement free_Slides = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("FREE SLIDES")));
			free_Slides.click();
			Thread.sleep(4000);

			WebElement select_ppt = wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//span[contains(text(),'Download Free Semi Circular Free PowerPoint Template')]")));
			js.executeScript("arguments[0].scrollIntoView();", select_ppt);
			select_ppt.click();

			// driver.get("https://www.slidegeeks.com/business/product/semi-circular-free-powerpoint-template");
			WebElement download_Ppt = wait
					.until(ExpectedConditions.elementToBeClickable(By.linkText("Download this Presentation")));
			js.executeScript("arguments[0].scrollIntoView();", download_Ppt);
			download_Ppt.click();
			Thread.sleep(3000);

			if (!driver.findElements(By.xpath("//a[@class='mfp-close roundlink']")).isEmpty()) {
				WebElement close_popup = wait
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mfp-close roundlink']")));

				close_popup.click();
			}
		} catch (NoSuchElementException e) {

		}
	}

	@Then("user clicks on the Logout pageiiv$")
	public void user_clicks_on_the_logout_pageiiv() throws Throwable {
		try {
			Thread.sleep(4000);
			WebElement logout = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", logout);
		} catch (NoSuchElementException e) {

		}
	}

}
