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
  "duration": 18385539494,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.we_enter_the_empinfo(DataTable)"
});
formatter.result({
  "duration": 10861477573,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps1.we_should_logout()"
});
formatter.result({
  "duration": 2230089120,
  "status": "passed"
});
});