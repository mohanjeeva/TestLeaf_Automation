# RBI - eCase Test Automation

## Table of Contents

* [Overview](#overview)
    - Java
    - Selenium
    - Cucumber
* [Tools Insatallation steps](#tools-installation-steps)
    - Java
    - IntelliJ IDEA
    - Maven
    - GIT
* [Framework Setup](#framework-setup)
    - Framework Creation
    - Steps to import package
* [Testcase Creation](#testcase-creation)
    - Steps to create testcase
    - Steps to execute a testcase
    - Test outcome evaluation
* [Source Code Management](#source-code-management)
    - Creating repository
    - Adding the pacakge to repository
    - Cloning the package to local
    - Steps to Push and Pull the code
    - Steps to handle merge conflicts
* [CI/CD Pipeline creation](#cicd-pipeline-creation)

## Overview
### Java
  - Java is a versatile and widely-used programming language that plays a crucial role in the field of test automation. Its robust features, platform independence, and extensive ecosystem make it a popular choice for building automation frameworks and scripting automated tests.
  - It follows the "write once, run anywhere" (WORA) principle, allowing automation scripts written in Java to run on any platform with a Java Virtual Machine (JVM). This ensures cross-platform compatibility and flexibility.
  - It has a large and active community of developers and testers. This results in abundant resources, forums, and documentation, making it easier for automation engineers to find solutions to problems and stay updated with industry best practices.
  - It has strong support for object-oriented programming allows automation engineers to write modular and maintainable code. Concepts such as classes, objects, inheritance, and encapsulation contribute to the creation of scalable and organized test automation frameworks.
  - Selenium WebDriver, a popular open-source automation tool for web applications, has excellent support for Java. Automation engineers can leverage the Selenium Java bindings to interact with web elements, perform actions, and validate web page behavior.
    
### Selenium
  - Selenium is an open-source and widely-used automation testing tool for web applications. It provides a suite of tools for automating web browsers, making it suitable for functional testing and regression testing.
  - It supports multiple web browsers such as Chrome, Firefox, Safari, Edge, and more. Automation scripts written with Selenium can be executed across different browsers, ensuring cross-browser compatibility testing.
  - It supports multiple programming languages, including Java, Python, C#, Ruby, and JavaScript. This flexibility allows automation engineers to choose a language based on their preferences and project requirements.
  - It WebDriver is a powerful component that allows interaction with web elements and browsers programmatically. It enables the creation of automation scripts for navigating web pages, interacting with form elements, and validating web application behavior.
  - It seamlessly integrates with popular testing frameworks such as JUnit, TestNG, Cucumber, and others. This integration facilitates test case organization, execution, and reporting, enhancing the overall test automation process.
  - It can be easily integrated into CI/CD pipelines using tools like Jenkins, Travis CI, or GitLab CI. This enables automated testing as part of the software development lifecycle, ensuring faster feedback on code changes.
  - It can be used for a variety of testing scenarios, including functional testing, regression testing, performance testing, and even for automating repetitive tasks such as data entry.
    
### Cucumber
  - Cucumber is a powerful behavior-driven development (BDD) tool that facilitates collaboration between technical and non-technical stakeholders in a software project. It is widely used for writing and executing test case in a natural language format, known as Gherkin.
  - It uses the Gherkin language to define test scenarios in a human-readable and structured format. Gherkin features include keywords such as `Given`, `When`, `Then`, `And`, and `But` to describe steps in a scenario.
  - Test scenarios are written in feature files with a `.feature` extension. These files contain a collection of related scenarios, each focusing on a specific feature or functionality. Cucumber scenarios are linked to step definitions, which are implemented in Java. Step definitions define the actual actions to be taken when each Gherkin step is encountered during test execution.
  - It integrates seamlessly with Selenium WebDriver, allowing automation engineers to interact with web elements and perform actions on web applications. Selenium code is embedded within step definitions.
  - It promotes code reusability and modularity by allowing step definitions to be organized and reused across multiple scenarios. This makes it easier to maintain and update automation code.
  - It supports data tables and scenario outlines, enabling parameterization of test scenarios. This allows for testing multiple sets of data with the same set of steps, enhancing test coverage.
  - Tags in Cucumber help organize and categorize scenarios, making it easy to run specific subsets of tests. Tags are specified in feature files and can be used for test prioritization and filtering.
  - It generates detailed and readable reports, making it easier to analyze test results. Popular reporting tools like ExtentReports or Cucumber's built-in reporting features can be integrated for enhanced documentation.
  - It supports multiple programming languages, including Java. This allows teams to choose the language they are most comfortable with while still leveraging the benefits of Cucumber.

## Tools Insatallation steps
### Java
- Check whether Java is already installed on the system or not in command prompt using "java -version", if it is installed you can see the java version
  
  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/64e2b4eb-f528-4a5d-b05d-5373cb8c31c0)
- If it is not installed then you will get responce shown in below image

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/87ad4492-82e2-474a-8269-33b326c94c46)
- Visit the Oracle JDK download page or the OpenJDK download page using https://www.oracle.com/in/java/technologies/downloads/
- Select the version you want (Java 11 or a later version).
- Download the installer suitable for your Windows architecture (32-bit or 64-bit).
- Execute the downloaded installer.
- Follow the installation wizard instructions.
- Choose the installation directory and complete the installation process.
- Search for edit environmental variables

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/af46d5d4-b35f-4075-8bdd-6b76889670e8)
- Click on Environmental Variables button
- Under System Variables, click "New" to add a new variable:
- Variable Name: `JAVA_HOME`
- Variable Value: Bin folder path to your Java installation directory (e.g., `C:\Program Files\Java\jdk-17.x.x\bin`).
- Verify installation by entering "java -version" in command prompt and confirm the installation.

### IntelliJ IDEA
- Visit the [official IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/).
- Download the Community or Ultimate edition based on your requirements.
- Once the download is complete, run the installer executable.
- Follow the installation wizard instructions.
- Choose the installation location for IntelliJ IDEA.
- You can also associate file extensions, create desktop shortcuts, etc., based on your preferences.
- Wait for the installation to complete.
- Once finished, you can launch IntelliJ IDEA.

### Maven
- **Download Maven:** Go to the official Apache Maven website (https://maven.apache.org/download.cgi) and download the latest version of Maven. Choose the binary zip archive.
 
- **Extract Maven:** Once the download is complete, extract the contents of the downloaded zip file to a directory on your system. Choose a location where you want Maven to be installed.
 
- **Set up Environment Variables:** Set up the `M2_HOME` and `PATH` environment variables. `M2_HOME` should point to the directory where Maven is installed, and `PATH` should include the `bin` directory inside the Maven installation directory.
 
- **Verify Installation:** Open a command prompt or terminal and type `mvn -version` to verify that Maven is correctly installed and configured. You should see the version of Maven installed and other relevant information.

### GIT
- **Download Git:** Go to the official Git website (https://git-scm.com/) and download the appropriate version of Git for your operating system.
 
- **Install Git:** Once the download is complete, run the installer and follow the installation wizard's prompts.
 
- **Verify Installation:** To verify Git has been successfully installed, open a terminal or command prompt and type `git --version`. You should see the Git version number displayed, indicating that Git is installed and accessible from the command line.

## Framework Setup
### Framework Creation
### Steps to import package

## Testcase Creation
### Steps to create testcase
### Steps to execute a testcase
### Test outcome evaluation

## Source Code Management
### Creating repository
### Adding the pacakge to repository
### Cloning the package to local
### Steps to Push and Pull the code
### Steps to handle merge conflicts

## CI/CD Pipeline creation
