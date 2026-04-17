# Tiny Corp Laptop Tracker
Build a lightweight assest management system where a user can do the following:

## Features
### User
As a service desk employee I want to:
- create a user
- assign them a device
- manufacture year, model number, brand, cpu, ram should be tracked
- mark the device as returned when user separtes from company
- disable user

### Reports
As a service desk manager I want to be able to quick see the following:
- average age of devices out
- list of users and their devices
- list of devices approaching EOL

## Technical constraints
Needs to fit into existing system that:
- Uses JWT auth tokens
- Uses relational database
- Uses RESTful services
