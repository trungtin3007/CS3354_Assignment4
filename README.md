# Assignment 4: Automated Unit Test Generation

## Team Members
- [Your Name] - [Your NetID]
- [Member 2 Name] - [Member 2 NetID]  
- [Member 3 Name] - [Member 3 NetID]

## Project Structure
```
├── pom.xml
├── README.md
├── src/
│   └── Stack.java
└── test/
    ├── chatgpt/
    │   └── ChatGPTTest.java
    ├── randoop/
    │   ├── RegressionTest0.java
    │   └── ErrorTest0.java
    └── evosuite/
        ├── EvoSuiteTest.java
        └── EvoSuiteTest_scaffolding.java
```

## How to Run Tests

### Compile the project
```bash
mvn compile
```

### Run all tests
```bash
mvn test
```

### Generate coverage report
```bash
mvn jacoco:report
```

### View coverage report
```bash
open target/site/jacoco/index.html
```

## Tools Used
- EvoSuite 1.0.6
- Randoop [version]
- ChatGPT
- JaCoCo for coverage measurement
- Maven for build management

## Coverage Results
See report PDF for detailed coverage comparison.
