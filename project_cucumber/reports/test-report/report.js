$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test1.feature");
formatter.feature({
  "line": 2,
  "name": "To Test functionality of Login.",
  "description": "",
  "id": "to-test-functionality-of-login.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TC01"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "To test Login functionality with valid data.",
  "description": "",
  "id": "to-test-functionality-of-login.;to-test-login-functionality-with-valid-data.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Mercury Tours Application should get open.",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter valid id and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "home page should get open",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify title",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close application",
  "keyword": "Then "
});
formatter.match({
  "location": "teststeps.mercury_Tours_Application_should_get_open()"
});
formatter.result({
  "duration": 6850548553,
  "status": "passed"
});
formatter.match({
  "location": "teststeps.user_enter_valid_id_and_password()"
});
formatter.result({
  "duration": 113370635,
  "status": "passed"
});
formatter.match({
  "location": "teststeps.home_page_should_get_open()"
});
formatter.result({
  "duration": 1360062793,
  "status": "passed"
});
formatter.match({
  "location": "teststeps.verify_title()"
});
formatter.result({
  "duration": 10035975139,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Altoro Mutual: Online Banking Home]\u003e but was:\u003c[hello]\u003e\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\n\tat stepDefinitions.teststeps.verify_title(teststeps.java:43)\n\tat ✽.And Verify title(test1.feature:9)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});