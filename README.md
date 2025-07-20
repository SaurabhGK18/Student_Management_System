# 🎓 Student Management REST API

A simple backend project built using **Java**, **Javalin**, **JDBC**, and **MySQL** that provides RESTful APIs for managing student records.

---

## 📦 Features
- ✅ Add a new student
- ✅ View all students
- ✅ Delete a student by ID

---

## 🛠️ Tech Stack
- **Java**
- **Javalin (REST API framework)**
- **JDBC (Database connectivity)**
- **MySQL**

---

## 🚀 Setup Instructions

### 1️⃣ Database Setup (MySQL)
```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);
