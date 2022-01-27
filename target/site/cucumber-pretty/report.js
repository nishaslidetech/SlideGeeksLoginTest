$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/Google_existing_paid_login.feature");
formatter.feature({
  "line": 2,
  "name": "Login with Google existing paid account test",
  "description": "",
  "id": "login-with-google-existing-paid-account-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Google_existing_paid_login"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login with Google existing paid account",
  "description": "",
  "id": "login-with-google-existing-paid-account-test;login-with-google-existing-paid-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is home pageiii",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on the Popular PPTsiii",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User try to download the pptiii",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on Login page and click on Signin with google buttoniii",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters the username and passwordiii",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user downloads the PPTiii",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the Logout pageiii",
  "keyword": "Then "
});
formatter.match({
  "location": "Google_existing_paid_login.user_is_home_pageiii()"
});
formatter.result({
  "duration": 26081104900,
  "status": "passed"
});
formatter.match({
  "location": "Google_existing_paid_login.user_click_on_the_popular_PPsiii()"
});
formatter.result({
  "duration": 1629283800,
  "status": "passed"
});
formatter.match({
  "location": "Google_existing_paid_login.user_try_to_download_the_pptiii()"
});
formatter.result({
  "duration": 8945324100,
  "status": "passed"
});
formatter.match({
  "location": "Google_existing_paid_login.user_is_on_login_page_and_click_on_sigin_with_google_buttoniii()"
});
formatter.result({
  "duration": 1234916000,
  "status": "passed"
});
formatter.match({
  "location": "Google_existing_paid_login.user_enters_the_username_and_passwordiii()"
});
formatter.result({
  "duration": 31094289000,
  "status": "passed"
});
formatter.match({
  "location": "Google_existing_paid_login.user_downloads_the_pptiii()"
});
formatter.result({
  "duration": 9828797100,
  "status": "passed"
});
formatter.match({
  "location": "Google_existing_paid_login.user_clicks_on_the_logout_pageiii()"
});
formatter.result({
  "duration": 39708467100,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.xpath: //a[normalize-space()\u003d\u0027Logout\u0027] (tried for 30 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat StepDefination.Google_existing_paid_login.user_clicks_on_the_logout_pageiii(Google_existing_paid_login.java:156)\r\n\tat ✽.Then user clicks on the Logout pageiii(src/test/java/Features/Google_existing_paid_login.feature:11)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //a[normalize-space()\u003d\u0027Logout\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027SLIDEQA2\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:657)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:654)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat StepDefination.Google_existing_paid_login.user_clicks_on_the_logout_pageiii(Google_existing_paid_login.java:156)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:272)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:236)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:386)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:323)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:143)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 285394300,
  "status": "passed"
});
});