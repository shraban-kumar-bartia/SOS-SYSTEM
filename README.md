# SOS System for Emergency

The SOS System is a web application that enables users to share their location in an emergency. This triggers an email alert with the user's location details to a designated recipient, helping to assist promptly.

--------------------

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
  - [Frontend Setup](#frontend-setup)
  - [Backend Setup](#backend-setup)
- [Configuring Gmail App Password](#configuring-gmail-app-password)
- [Running the Application](#running-the-application)

----------------------

## Features

- Real-time location sharing via email
- Backend service for handling and sending emergency notifications
- Map integration for location data visualization

---------------------

## Prerequisites

Ensure that you have the following installed:

- **Node.js** and **npm** for frontend
- **Java Development Kit (JDK)** 8 or higher
- **Apache Maven** for backend

---------------------

## Setup Instructions

### Frontend Setup

1. Navigate to the frontend directory:
   cd sos-frontend
   
2.Install required dependencies:
  npm install

3.Install additional libraries:
npm install axios
npm install leaflet

4.Start the frontend application:
npm start

The frontend will start on http://localhost:3000.

Backend Setup
1. Update email credentials in application.properties:

Open the backend configuration file sos-backend/src/main/resources/application.properties.
Update the following fields:
spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password

2.Update the recipient email address in the Email Service class:

Open sos-backend/src/main/java/in/skb/sos_backend/service/EmailService.java.
Replace the recipient email with your desired recipient's address:
String recipientEmail = "recipient@gmail.com"; // Update this with the actual recipient's email address

3.Start the backend:

cd sos-backend
mvn clean install
mvn spring-boot:run
The backend will start on http://localhost:8080.

Npte: Configuring Gmail App Password
To enable secure email sending, you need to set up an App Password for Gmail. Follow these steps:

Step 1: Enable 2-Step Verification
Go to your Google Account Security page.
Under "Signing in to Google", select "2-Step Verification".
Follow the prompts to complete the 2-Step Verification setup.

Step 2: Generate an App Password
Once 2-Step Verification is enabled, return to the Security page.
Under "Signing in to Google", click on "App Passwords".

Re-enter your password if prompted.
In the "Select app" dropdown, choose Mail.
In the "Select device" dropdown, select Other (Custom name), enter "Spring Boot" or any descriptive name, and click Generate.
Copy the 16-character App Password displayed. Use this password in place of your regular Gmail password.

Step 3: Update Application Properties
In application.properties, update the email credentials:


spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
Note: The App Password allows your Spring Boot application to access Gmail for sending emails securely without requiring your primary Gmail password.

Running the Application
After setting up both the frontend and backend, the application should be running at:

Frontend: http://localhost:3000
Backend: http://localhost:8080
