Selenium Automation Framework(with Java)
Author - Pramod Dutta Website - https:/sdet.live

Tech Stack of Web Automation
Programming - Java ( JDK > 22, IntelliJ)
User Interactions, browser Automation Selenium
Test Framework -> TestNG
Build Management -> Maven
Reporting - Allure Report, Extent Report.
Data Driven - DDT Apache POI.
CI / CD -> GIT, Jenkins
Coding Best Practice- SonarLint
Logs - Log4j
Remote Selenium Grid - Cloud Grid, Selenoid
Screenshot 2023-10-31 at 12 27 14 PM
mvn test -Dsurefire.suiteXmlFiles=testng.xml

Screenshot 2023-10-31 at 12 27 28 PM
Seleniod - Docker Grid Running
Selenoid is a powerful tool for running Selenium tests in Docker containers.
which can help you manage and scale your test automation infrastructure more efficiently.
Screenshot 2024-06-13 at 15 56 21

Testcase.Running.via.Selenoid.Docker.Container.mp4
How to add Log4J in the Project ?
Add this to the pom.xml
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-core</artifactId>
<version>3.0.0-beta2</version>
</dependency>

    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
    <dependency>
      <groupId>org.apache.logging.log4j</groupId>
      <artifactId>log4j-api</artifactId>
      <version>3.0.0-beta2</version>
    </dependency> 
Add log4j2.xml in the main folder -> resource
https://gist.github.com/PramodDutta/36ec0a2460e0ec796b7fe6b186a008b5
To your Code
-     private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM.class);

file
logger.info("Starting Test");
