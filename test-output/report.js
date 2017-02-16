$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrangeHRM.feature");
formatter.feature({
  "id": "addemployee-functionality-of-orangehrm",
  "description": "",
  "name": "AddEmployee functionality of OrangeHRM",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "addemployee-functionality-of-orangehrm;as-an-admin-i-should-be-able-to-add-emp-info",
  "description": "",
  "name": "As an admin I should be able to add emp info",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "orange hrm is logged in as admin",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "we enter the empinfo",
  "keyword": "When ",
  "line": 5,
  "rows": [
    {
      "cells": [
        "firstName",
        "middleName",
        "lastName",
        "employeeId",
        "user_name",
        "user_password",
        "re_password",
        "status"
      ],
      "line": 6
    },
    {
      "cells": [
        "Sai",
        "Krishna",
        "G",
        "1111",
        "SaiK",
        "pass@123",
        "pass@123",
        "Enabled"
      ],
      "line": 7
    },
    {
      "cells": [
        "Hari",
        "Prasad",
        "K",
        "2222",
        "HariP",
        "pass@123",
        "pass@123",
        "Enabled"
      ],
      "line": 8
    },
    {
      "cells": [
        "Ravi",
        "Kumar",
        "P",
        "3333",
        "RaviK",
        "pass@123",
        "pass@123",
        "Enabled"
      ],
      "line": 9
    }
  ]
});
formatter.step({
  "name": "we should logout",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "TestSteps.orange_hrm_is_logged_in_as_admin()"
});
formatter.result({
  "duration": 17155104155,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.we_enter_the_empinfo(DataTable)"
});
formatter.result({
  "duration": 12715624917,
  "status": "failed",
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nCommand duration or timeout: 10.03 seconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027Sai-PC\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_71\u0027\nSession ID: 2751d5c0-b95a-431f-8c9d-81b685298486\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{platform\u003dWINDOWS, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dtrue, browserName\u003dfirefox, handlesAlerts\u003dtrue, nativeEvents\u003dfalse, webStorageEnabled\u003dtrue, rotatable\u003dfalse, locationContextEnabled\u003dtrue, applicationCacheEnabled\u003dtrue, takesScreenshot\u003dtrue, version\u003d44.0}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\r\n\tat stepDefinition.TestSteps.we_enter_the_empinfo(TestSteps.java:37)\r\n\tat ✽.When we enter the empinfo(OrangeHRM.feature:5)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: Element is not currently visible and so may not be interacted with\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1\u0027, time: \u00272016-06-30 17:37:03\u0027\nSystem info: host: \u0027Sai-PC\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_71\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.fxdriver.preconditions.visible(file:///C:/Users/Sai/AppData/Local/Temp/anonymous5426907163396025772webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:10092)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.checkPreconditions_(file:///C:/Users/Sai/AppData/Local/Temp/anonymous5426907163396025772webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12644)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Sai/AppData/Local/Temp/anonymous5426907163396025772webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12661)\r\n\tat \u003canonymous class\u003e.fxdriver.Timer.prototype.setTimeout/\u003c.notify(file:///C:/Users/Sai/AppData/Local/Temp/anonymous5426907163396025772webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:625)\r\n"
});
formatter.match({
  "location": "TestSteps.we_should_logout()"
});
formatter.result({
  "status": "skipped"
});
});