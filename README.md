# 🎓 Student Management System (Java)

[![Java](https://img.shields.io/badge/Java-8%2B-blue?logo=java)](https://www.java.com/) [![Open Source](https://img.shields.io/badge/Open%20Source-Yes-brightgreen)](https://github.com/amitkumar-Github8/Student-Management-System)

A simple, interactive, console-based Student Management System implemented in Java using OOP principles. Manage courses, subjects, students, and exams—all from your terminal!

---

## 📋 Table of Contents
- [Features](#-features)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Usage](#-usage)
- [Architecture Overview](#-architecture-overview)
- [How to Extend](#-how-to-extend)
- [License](#-license)
- [Contributing](#-contributing)

---

## 🚀 Features

✅ Admin login and menu-driven interface  
✅ Add and manage courses  
✅ Add subjects to courses  
✅ Register and view students  
✅ Exam and grading structure (basic, extendable)  
✅ In-memory data management (no real database yet)

---

## 📦 Project Structure

```
Student-Management-System/
├── Admin.java            # Admin user logic and menu
├── Course.java           # Course entity and subject management
├── DatabaseConnection.java # Placeholder for DB logic
├── Exam.java             # Exam entity
├── ExamUtils.java        # Exam grading utility
├── Main.java             # Program entry point
├── Student.java          # Student entity and logic
├── Subject.java          # Subject entity
├── User.java             # Base user class
└── README.md             # Project documentation
```

---

## 🏁 Getting Started

> **Tip:** You only need Java 8+ and a terminal to run this project!

1. **Clone the repo:**
   ```bash
   git clone https://github.com/amitkumar-Github8/Student-Management-System.git
   cd Student-Management-System
   ```
2. **Compile all Java files:**
   ```bash
   javac *.java
   ```
3. **Run the application:**
   ```bash
   java Main
   ```

---

## 👍 Usage

- Follow the on-screen menu to add courses, subjects, and students.
- All data is stored in memory (no database required).
- To exit, use the logout option in the menu.

---

## 🏗 Architecture Overview

| Component         | Responsibility                                 |
|-------------------|------------------------------------------------|
| **Admin**         | Manages courses, subjects, and students        |
| **Course**        | Contains course name and subjects              |
| **Subject**       | Represents a subject in a course               |
| **Student**       | Represents a student (see Student.java)        |
| **Exam/ExamUtils**| Structure for exams and grading                |
| **DatabaseConnection** | Placeholder for future DB integration      |
| **User**          | Base class for Admin and Student               |

---

## 💡 How to Extend

> 💬 **Ideas:**
> - Implement real database storage (see `DatabaseConnection.java`)
> - Add authentication for users
> - Expand exam and grading features
> - Add a GUI (Swing/JavaFX)
> - Add unit tests

---

## 📄 License

This project is for educational purposes. See LICENSE if present in the repo.

---

## 🤝 Contributing

Pull requests and suggestions are welcome! Feel free to open an issue or submit a PR.
