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
- Check whether Java is already installed on the system or not in command prompt using **java -version**, if it is installed you can see the java version
  
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
- Variable Name: `Path`
- Variable Value: Bin folder path to your Java installation directory (e.g., `C:\Program Files\Java\jdk-17.x.x\bin`).
  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/f0018b40-3a3f-4c33-8e1b-f6eedeedcbdb)

- Verify installation by entering "java -version" in command prompt and confirm the installation.

### IntelliJ IDEA
- Download IntelliJ IDEA using [official IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/).
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
  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/9dc343ed-4ebc-41da-94a4-20e1ce1e055f)


### GIT
- **Download Git:** Go to the official Git website (https://git-scm.com/) and download the appropriate version of Git for your operating system.
 
- **Install Git:** Once the download is complete, run the installer and follow the installation wizard's prompts.
 
- **Verify Installation:** To verify Git has been successfully installed, open a terminal or command prompt and type `git --version`. You should see the Git version number displayed, indicating that Git is installed and accessible from the command line.

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/2c47621b-9d4b-4238-b442-272282eb4690)


## Framework Setup
### Framework Creation
### Steps to import package

## Testcase Creation
### Steps to create testcase
### Steps to execute a testcase
### Test outcome evaluation

## Source Code Management
### Creating repository
**Sign in or Sign up:** Go to the GitHub website and sign in to your account. If you don't have an account, you'll need to sign up for one.
 
**Create Repositories:** Once logged in, click on the "+" icon in the top right corner of the page, then select **New repository** from the dropdown menu.

![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/2c8f44b0-30f2-4707-a579-5c38f61d7c05)
 
**Set up Repository:** On the new repository page, you'll need to fill in some details:
   - **Repository name:** Choose a name for your repository.
   - **Description (optional):** Add a brief description to help others understand your project.
   - **Visibility:** Choose whether your repository will be public (visible to everyone) or private (visible only to you and collaborators).
   - **Initialize this repository with a README (optional):** If selected, GitHub will create a README file for your repository. This can be helpful for providing an overview of your project.
   - **Add .gitignore:** Optionally, you can choose a .gitignore template to ignore certain files in your repository.
   - **Choose a license (optional):** You can select a license for your project to specify how others can use it.

     ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/7781c577-3a36-4d2e-a647-986f30c6a900)

 
    - Once you've filled in the details, click the "Create repository" button.

![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/d9cf10f6-fd06-43db-b983-89109ef2bf34)

### Adding the pacakge to repository
- Create a new folder and open git bash here by right click on the folder
- Initialize the local directory as a Git repository using **git init**
- Add the files in your new local repository using **git add --all**. This stages you for the first commit
- Commit the files that you've staged in your local repository using **git commit -m "first commit**
- Move the code from local repository to remote repository **git remote add origin <remote repository URL>** then set new remote using **git remote -v**

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/1a42542a-acb6-4850-87e7-5ba2ab7e54e1)
- Push the changes in your local repository to GitHub using **git push origin master**

### Cloning the package to local
- Create a new folder where you want to place your project

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/d9469c6a-5d42-43f9-b672-2cfb036e18dc)

- Open newly created folder and do Git Bash Here, a command prompt will open

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/4d05f65c-1eb6-41aa-b99e-44bdce28c715)

- Initialize git to the folder using below command  git init, new .git hidden folder will be there

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/83ae9079-3284-480e-92f8-a423ae2d1f91)

- Then clone the project, copy HTTP URL from git repository and clone using **git clone <HTTP_URL>**, here main branch will sync with our machine

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/6b17dfd2-ce84-432a-a960-65ad931dd11c)
  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/81d486e5-7314-415c-bbb5-311abb868b92)


- Navigate to the newly cloned folder(which contains code of main branch), if we have the latest code in branch that is fine or else we have to sync the child branch by reopen the Git Bash Here and merge code using following commend **git checkout <childbranch_Name>**

  ![image](https://github.com/mohanjeeva/TestLeaf_Automation/assets/22591852/4f4f2363-69c1-4f60-a19a-8b81a4608bf2)

### Steps to Push and Pull the code
#### Steps to push the code
- Open the project folder, select git bash here by right click on the folder
- Add the modified files using the command **git add .** or **git add --all**
- Then Commit the code using **git commit -m <Commit_message>**
- Then push the code using **git push**
#### Steps to pull the code
- Open the project folder, select git bash here by right click on the folder
- Then pull the code using the command **git pull**

## CI/CD Pipeline creation
