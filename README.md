## 🏥 Clinic Appointment Management System (MVP)

This is a simple Java console-based project built as a learning exercise to practice Object-Oriented Programming (OOP) and basic software engineering workflows.

The system simulates a small clinic where doctors and patients can be managed, and appointments can be created and viewed through a menu-driven console interface.

---

## ✨ Features

- Add doctors to the system  
- Add patients to the system  
- Create appointments between doctors and patients  
- Store appointments using ArrayList  
- View all appointments in a clean format  
- Interactive console menu for user input  

---

## 📚 OOP Concepts Used

This project was built to practice core Java OOP principles in a real example.

### 1. Classes and Objects

The system is divided into multiple classes, each handling a specific role:

- `Person.java`
- `Doctor.java`
- `Patient.java`
- `Appointment.java`

Objects are created and used mainly in:

- `Main.java`

---

### 2. Encapsulation

Encapsulation is applied by:

- Making all fields `private`  
- Using getters and setters  
- Controlling access to data through methods  

Used in:

- `Person.java`
- `Doctor.java`
- `Patient.java`

---

### 3. Inheritance

Inheritance is used to reduce repetition and improve structure.


Person
├── Doctor
└── Patient


Both `Doctor` and `Patient` inherit common properties from `Person`.

---

### 4. Polymorphism

This project demonstrates polymorphism in different ways:

#### Method Overriding
- `displayInfo()` is overridden in:
  - `Doctor.java`
  - `Patient.java`

#### Method Overloading
- `consultPatient()` is overloaded in:
  - `Doctor.java`

#### Superclass Reference

```java
Person p1 = doctor1;
Person p2 = patient1;

This allows different objects to be treated as their parent type.

📁 Project Structure
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
```
⚙️ How to Run
Compile the project

javac src/*.java

Run the program

java -cp src Main

🔄 GitHub Actions CI/CD Pipeline

This project includes an automated pipeline that runs on every Pull Request.

What it does:
Checks required Java files exist
Compiles the project
Runs the application
Fails if anything breaks

This ensures the code stays clean and functional at all times.

🖥️ Sample Output

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
