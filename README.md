#This project delevoped in Java using Eclipse IDE on the Window10 machine and runs on chrome browser version 84.0.4147.135(make sure to update the chrome browser)
1.Download E2E project file/Clone the repository
2.Update the chromedriver(which only supports the above mentioned chrome version) path in the base.java class under the if(browserName.equals("chrome")) block
3.Before running the test make sure the test data in the feature file is updated. Especially, in Scenario: User tries to register with a new email address, please update the email address
4. To run the project,
	a. Open command prompt
	b. Go to the project directory
	c. npm install
	d. npm run
