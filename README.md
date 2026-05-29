🏥Clinic Appointment Management System (MVP)

This is a simple Java console-based project built as a learning exercise to practice Object-Oriented Programming (OOP) and basic software engineering workflows.

The system simulates a small clinic where doctors and patients can be managed, and appointments can be created and viewed through a menu-driven console interface.

✨ What this project does
Add doctors to the system
Add patients to the system
Create appointments between doctors and patients
Store all appointments using an ArrayList
View all saved appointments
Run everything through a simple interactive console menu
📚 OOP concepts used

This project was built to practice and demonstrate core Java OOP principles.

1. Classes and Objects

The system is split into multiple classes, each handling a specific part of the application:

Person.java
Doctor.java
Patient.java
Appointment.java

All objects are created and managed mainly in Main.java.

2. Encapsulation

All class fields are kept private and accessed using getters and setters.

This helps protect data and keeps the code clean and controlled.

3. Inheritance

Doctors and patients share common properties through a parent class:

Person
├── Doctor
└── Patient

This avoids duplication and keeps the structure organized.

4. Polymorphism

The project demonstrates polymorphism in a few ways:

Method overriding: displayInfo() is customized in both Doctor and Patient
Method overloading: consultPatient() is implemented with different parameters
Superclass usage:
Person p1 = doctor1;
Person p2 = patient1;
📁 Project structure
ClinicAppointmentManagementSystem/
│
├── src/
│   ├── Person.java
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Appointment.java
│   ├── ClinicSystem.java
│   └── Main.java
│
├── .github/
│   └── workflows/
│       └── pr-review.yml
│
└── README.md
⚙️ How to run the project
Compile:
javac src/*.java
Run:
java -cp src Main
🔄 CI/CD (GitHub Actions)

This project includes a simple automated pipeline that runs whenever a Pull Request is created.

What it checks:
Required Java files exist
Code compiles successfully
Program runs without crashing

If anything fails, the build will fail automatically.

This helps ensure the project stays clean and functional.

🖥️ Example output
===== Doctor Information =====
ID: 1
Name: Dr. Ahmed
Age: 45
Specialization: Cardiology

===== Patient Information =====
ID: 101
Name: Ali
Age: 25
Illness: Heart Disease

Appointment added successfully.
