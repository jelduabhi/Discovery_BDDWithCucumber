$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "AfterCutOff feature",
  "description": "",
  "id": "aftercutoff-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate videos",
  "description": "",
  "id": "aftercutoff-feature;validate-videos",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sample"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i launch application with valid url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i navigate to my videos and add two videos into my favourite",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i can able to see favourite in My Vidoes section",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.i_launch_application_with_valid_url()"
});
formatter.result({
  "duration": 130552205905,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.i_navigate_to_my_vidoes_and_add_two_vidos_into_my_favourite()"
});
formatter.result({
  "duration": 205906098543,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});