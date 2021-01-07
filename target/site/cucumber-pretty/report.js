$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6816558400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "# This feature deals with the login functionality of the application"
    }
  ],
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I am in",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I find my sisters account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I write her a message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.iNavigateToTheLoginPage()"
});
formatter.result({
  "duration": 2989812500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterUsernameAndPassword()"
});
formatter.result({
  "duration": 15470055800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_am_in()"
});
formatter.result({
  "duration": 1621000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_find_my_sisters_account()"
});
formatter.result({
  "duration": 10990006700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_write_her_a_message()"
});
formatter.result({
  "duration": 36295255400,
  "status": "passed"
});
formatter.after({
  "duration": 1084800,
  "status": "passed"
});
});