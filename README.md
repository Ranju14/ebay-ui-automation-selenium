# ebay-ui-automation-selenium

## Test Scenario

User must be able to search a product and click on save search result

## Framework

- Selenium WebDriver
- Test tool - TestNg
- Build tool - Maven


## Installation

1.Install eclipse or any other IDE of your choice

2.Clone the repository and open project in IDE

3.Wait for jars to download completely from pom.xml

4.Download geckodriver(https://github.com/mozilla/geckodriver/releases)

5.Change geckodriver location in the BaseClass.java file

## Test Steps Executed in scenario "Modify restriction of page"

1.Launch the ebay.com.au and verify home page

2.Search a product 

3.Click on Save search result link

4.Verify the Save search page

## Steps to run

1.Run testng.xml file

2.Refresh project folder to get the test-output folder


## Reports

- HTML report

  ```sh
  test-output/old/index.html
  ```

- XML report

  ```sh
  test-output/old/testng-results.xml
 
  ```
  
  Note : It is observed that the site detects automatic boot operation and blocks process by providing captcha. Hence on some cases it is observed that the test fails
