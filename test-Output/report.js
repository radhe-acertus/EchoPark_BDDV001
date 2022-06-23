$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/1_QA-67.feature");
formatter.feature({
  "name": "Cucumber-BDD-Demo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Cucumber-BDD-Demo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TEST_QA-67"
    }
  ]
});
formatter.step({
  "name": "User launched web browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_launched_web_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens EchoPark URL \"https://qa.shipwithechopark.com/auth/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_opens_EchoPark_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"wl-sales@metrogistics.com\" and Password as \"P@$$word1\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Titile should be \"Driversselect :: Home\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.page_Titile_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_clicks_on_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Ship With Echopark - Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_closes_the_browser()"
});
formatter.result({
  "status": "passed"
});
});