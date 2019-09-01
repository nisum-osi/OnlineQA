$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SimpleScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate google search text field",
  "description": "",
  "id": "google-search;validate-google-search-text-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to google page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate the search text field",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter \"selenium automation\" in text field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Selenium webdriver search results page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close the browserscenario with different controls",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "#  Scenario: Verify"
    },
    {
      "line": 14,
      "value": "#    Given I open a browser"
    },
    {
      "line": 15,
      "value": "#    When I navigate to gmail page"
    },
    {
      "line": 16,
      "value": "#    When I enter emailid \u0026 password in text field"
    },
    {
      "line": 17,
      "value": "#    And click on sign in button"
    },
    {
      "line": 18,
      "value": "#    Then it should land on home page of gmail"
    },
    {
      "line": 19,
      "value": "#    And close the browser"
    }
  ],
  "line": 22,
  "name": "I open a browser  Scenario: Verify all types of controls",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I navigate to amazon page",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "get all links in homepage",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "close the browserscenario with different controls",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearch.ci_open_a_browser()"
});
formatter.result({
  "duration": 3946569900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_navigate_to_google_page()"
});
formatter.result({
  "duration": 3071348800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_validate_the_search_text_field()"
});
formatter.result({
  "duration": 130597800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium automation",
      "offset": 9
    }
  ],
  "location": "GoogleSearch.i_enter_in_text_field(String)"
});
formatter.result({
  "duration": 255720900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.click_on_search_button()"
});
formatter.result({
  "duration": 1953604800,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.selenium_webdriver_search_results_page_should_display()"
});
formatter.result({
  "duration": 24100,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.closeTheBrowserscenarioWithDifferentControls()"
});
formatter.result({
  "duration": 1539562900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "GoogleSearch.iNavigateToAmazonPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearch.getAllLinksInHomepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GoogleSearch.closeTheBrowserscenarioWithDifferentControls()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 284100,
  "error_message": "java.lang.NullPointerException\r\n\tat utility.Hook.tearDown(Hook.java:55)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:77)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:110)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\n",
  "status": "failed"
});
});