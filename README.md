# 🎓 Student Management System (Java)

Welcome to the **Student Management System**!  
This is a simple, interactive, console-based Java application that lets you manage courses, students, and exams—all from your terminal.  
Whether you're an admin or a student, you'll find the menu-driven interface easy and intuitive.

---

## 📋 Table of Contents
- [✨ Features](#-features)
- [🗂 Project Structure](#-project-structure)
- [🚀 Getting Started](#-getting-started)
- [💡 Usage](#-usage)
- [🏗 Architecture Overview](#-architecture-overview)
- [🔧 How to Extend](#-how-to-extend)
- [🖥️ Example Usage](#️-example-usage)
- [🛠️ Troubleshooting](#-troubleshooting)
- [📄 License](#-license)
- [🤝 Contributing](#-contributing)
- [📫 Contact](#-contact)

---

## ✨ Features

✅ Admin login and menu-driven interface  
✅ Add and manage courses  
✅ Register and view students  
✅ Enroll students in courses  
✅ Take simple exams (random grading)  
✅ In-memory data management (no database required)

---

## 🗂 Project Structure

```
Student-Management-System/
├── src/
│   ├── Admin.java
│   ├── Course.java
│   ├── DatabaseConnection.java
│   ├── ExamUtils.java
│   ├── Main.java
│   ├── Student.java
│   └── User.java
└── README.md
```

---

## 🚀 Getting Started

> **Requirements:** Java 8+ and a terminal.

1. **Clone the repo:**
   ```bash
   git clone https://github.com/amitkumar-Github8/Student-Management-System.git
   cd Student-Management-System
   ```
2. **Compile all Java files:**
   ```bash
   javac src/*.java
   ```
3. **Run the application:**
   ```bash
   java -cp src Main
   ```

---

## 💡 Usage

- **Admin:** Add/view courses, enroll students, view students.
- **Student:** View/enroll in courses, take exams.
- All data is stored in memory (no database required).
- To exit, use the logout or exit option in the menu.

---

## 🏗 Architecture Overview

| Component         | Responsibility                                 |
|-------------------|------------------------------------------------|
| **Admin**         | Manages courses and students                   |
| **Course**        | Represents a course                            |
| **Student**       | Represents a student and their enrollments     |
| **ExamUtils**     | Utility for grading exams                      |
| **DatabaseConnection** | Placeholder for future DB integration      |
| **User**          | Base class for Admin and Student               |

---

## 🔧 How to Extend

- Implement real database storage (see `DatabaseConnection.java`)
- Add authentication for users
- Expand exam and grading features
- Add a GUI (Swing/JavaFX)
- Add unit tests

---

## 🖥️ Example Usage

**Admin Perspective:**
1. Login as admin.
2. Add a new course: `CS101 - Intro to Computer Science`
3. Register a new student: `John Doe`
4. Enroll John in CS101
5. Log out.

**Student Perspective:**
1. Login as student.
2. View available courses.
3. Enroll in CS101.
4. Take the exam for CS101.
5. Log out.

---

## 🛠️ Troubleshooting

- **Issue:** Can't connect to the database.  
  **Solution:** Ensure the database server is running and the connection details in `DatabaseConnection.java` are correct.

- **Issue:** Compilation errors.  
  **Solution:** Make sure you have Java 8+ installed and properly set up in your system's PATH.

- **Issue:** Application not starting.  
  **Solution:** Check if all Java files are compiled. Run `javac src/*.java` again to compile any missed files.

---


## 🤝 Contributing

Pull requests and suggestions are welcome! Feel free to open an issue or submit a PR.

---

## 📫 Contact

For any inquiries or feedback, please contact the project maintainer:

**Amit Kumar**  
Email: amitkumar@example.com  
GitHub: [amitkumar-Github8](https://github.com/amitkumar-Github8)