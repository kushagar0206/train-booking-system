Train Booking System (Spring Boot + MySQL)
A complete Train Ticket Booking System built using Spring Boot, MySQL, and RESTful APIs.
This project allows users to search trains, book tickets, cancel bookings, view available trains, and more — all through a structured backend service ready for frontend integration (React, Angular, or any UI).


📋 Features
✅ User Management
Register new users

Login & Authentication
View user booking history

✅ Train Management
Add new trains (Admin)
View all available trains

Search trains by route, date, or train number
✅ Booking System
Book tickets for available trains

Cancel booked tickets
View all booked tickets by user

✅ Payment Module (Demo)
Simulated payment integration for booking confirmation

✅ Database Integration
Persistent storage using MySQL
JPA and Hibernate ORM for mapping entities


🏗️ Tech Stack
Backend: Java, Spring Boot
Database: MySQL ORM	Hibernate / JPA
Build Tool: Maven
API Testing: Postman
Security: Spring Boot Starter Security (optional)
IDE	IntelliJ IDEA



⚙️ Project Structure
TrainBookingSystem/
│
├── src/main/java/com/trainbooking/
│   ├── controller/        # REST controllers (Train, Booking, User)
│   ├── dto/               # Data Transfer Objects
│   ├── entity/            # JPA Entities (Train, Booking, User)
│   ├── repository/        # Spring Data JPA Repositories
│   ├── service/           # Business logic layer
│   └── TrainBookingSystemApplication.java
│
├── src/main/resources/
│   ├── application.properties   # Database configuration
│   └── data.sql (optional)      # Initial data load
│
├── pom.xml               # Maven dependencies
└── README.md             # Project documentation


⚙️ Installation, Setup & Prerequisites
Before running the project, ensure you have:
☕ Java 21
🧰 Maven installed
🗄️ MySQL server running
🖥️ IDE (IntelliJ IDEA)
