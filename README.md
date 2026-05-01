# Tiny Corp Laptop Tracker
Using your AI toolset of choice and without any hand coding, build a lightweight asset management system with the features listed below.

## Starter app
This repository starts as a minimal Spring Boot API. It intentionally includes only a hello endpoint and an Actuator health check so candidates can expand it during the interview.

### Requirements
- Java 17
- The included Gradle wrapper

### Run the app
```sh
JAVA_HOME=$(/usr/libexec/java_home -v 17) ./gradlew bootRun
```

### Test the app
```sh
JAVA_HOME=$(/usr/libexec/java_home -v 17) ./gradlew test
```

### Starter endpoints
- `GET /api/hello`
- `GET /actuator/health`

## Features
### User
As a service desk employee I want to:
- login with simple username and password
- create a user
- assign them a device
- manufacture year, model number, brand, cpu, ram should be tracked
- mark the device as returned when user separates from company
- disable user

### Reports
As a service desk manager I want to be able to quickly see the following:
- average age of devices out
- list of users and their devices
- list of devices approaching EOL

## Technical constraints
Needs to fit into existing system that:
- Uses JWT auth tokens
- Uses relational database
- Uses RESTful services

## Goals of the exercise
- Build a system without hand coding
- Understand candidates maturity level in using and interacting with AI

## Candidate work
JWT authentication, relational persistence, user management, device assignment, returned-device workflows, disabled-user workflows, and reports are not implemented in the starter app. These requirements are the intended exercise work.
