# API Automation Framework - Rest Assured

This is a modular and scalable **API Automation Framework** built using **Java**, **Rest Assured**, **TestNG**, and **POJO** classes. The framework supports reusable client layers, data-driven testing, config management, and reporting via **Extent Reports**.

---

## 📁 Project Structure

```base
APIAutomationFramework/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── pojo/
│   │   │       ├── Address.java
│   │   │       └── User.java
│   │   └── resources/
│
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── BaseTest.java
│       │   ├── clients/
│       │   │   └── UserClient.java
│       │   ├── reports/
│       │   │   └── ExtentManager.java
│       │   ├── tests/
│       │   │   └── UserTests.java
│       │   └── utils/
│       │       └── ConfigReader.java
│       └── resources/
│
├── reports/
│   └── API-TestReport.html
│
├── config.properties
├── pom.xml
├── testng.xml
├── test-output/
├── target/
```
---


---

## 🔧 Tech Stack

- **Java 17+**
- **Rest Assured**
- **TestNG**
- **Maven**
- **Jackson/Gson** (for POJO mapping)
- **Extent Reports**
- **Property Files** for environment config

---

## ✅ Features

- 🚀 Easy to create and maintain API test cases
- 📦 POJO-based deserialization for clean response mapping
- 🔁 Reusable client classes for HTTP operations
- 📄 HTML reporting using ExtentReports
- ⚙️ Configurable base URLs and settings via `config.properties`
- 📂 Clean project structure based on best practices

---

## 🧪 How to Run Tests

1. **Using IDE (IntelliJ/Eclipse):**
   - Right-click on `testng.xml` > Run as TestNG Suite

2. **Using Maven CLI:**
   ```bash
   mvn clean test
---

## View HTML Report
reports/API-TestReport.html

---

## 🔑 Configuration
- config.properties: Contains base URL and other environment variables
- testng.xml: TestNG suite configuration
---

## ✍️ Author
- Utkarsh Haste
- Contributions are welcome!

---
