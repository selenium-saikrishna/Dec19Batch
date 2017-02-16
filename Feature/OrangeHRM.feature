Feature: AddEmployee functionality of OrangeHRM

Scenario: As an admin I should be able to add emp info 
Given orange hrm is logged in as admin
When we enter the empinfo
|firstName|middleName|lastName|employeeId|user_name|user_password|re_password|status |
|Sai      |Krishna   |G       |1111      |SaiK     |pass@123     |pass@123   |Enabled|
|Hari     |Prasad    |K       |2222      |HariP    |pass@123     |pass@123   |Enabled|
|Ravi     |Kumar     |P       |3333      |RaviK    |pass@123     |pass@123   |Enabled|
Then we should logout



