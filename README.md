# 🏥 CURA Healthcare Automation with Selenium & SonarQube

This project is a comprehensive automated testing suite for the [CURA Healthcare Service](https://katalon-demo-cura.herokuapp.com/) website. It demonstrates industry-standard practices by integrating **Selenium WebDriver** for functional testing and **SonarQube** for static code analysis.

## 🚀 Project Overview

The primary goal of this project is to automate the login workflow and ensure high code quality through continuous inspection. By using SonarQube, the project maintains a clean codebase, free from bugs, vulnerabilities, and code smells.

### Key Features:
- **Functional Testing:** Automated login flow using Selenium WebDriver.
- **Static Code Analysis:** Integration with SonarQube for deep code quality metrics.
- **Dependency Management:** Built and managed using Apache Maven.
- **Test Reporting:** Uses TestNG for structured testing and report generation.

## 🛠️ Technologies Used

- **Language:** Java 21
- **Automation Tool:** Selenium WebDriver (v4.15.0)
- **Test Framework:** TestNG
- **Build Tool:** Maven
- **Analysis Tool:** SonarQube Community Build
- **Browser:** Google Chrome

## 📋 Prerequisites

Before running the project, ensure you have the following installed:
- JDK 21
- Apache Maven
- Google Chrome Browser
- SonarQube Server (Local instance running on `http://localhost:9000`)

## ⚙️ How to Run

### 1. Start SonarQube Server
Make sure your SonarQube server is up and operational.

### 2. Run Automation & Analysis
Open your terminal (CMD or PowerShell) in the project root directory and execute:
```powershell
mvn clean verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar `
 "-Dsonar.projectKey=CuraAutomation" `
 "-Dsonar.projectName=CuraAutomation" `
 "-Dsonar.host.url=http://localhost:9000" `
 "-Dsonar.token= sqp_36c6c8d4450899779527841dae33322c4a0d93c9"

📊 Reports
SonarQube Dashboard: Accessible at http://localhost:9000/dashboard?id=CuraAutomation

TestNG Reports: Generated after execution in target/surefire-reports/emailable-report.html

👨‍💻 Author
Pabasara
