# Employee Management System

**(Using Inheritance and Polymorphism in Java)**

## 📌 Project Overview

The Employee Management System is a console-based Java application designed to demonstrate **Object-Oriented Programming (OOP)** concepts, especially **inheritance**, **polymorphism**, and **method overriding**.
The system manages different types of employees such as **Managers** and **Developers** using a common base class.

---

## 🎯 Objectives

* Understand and implement **inheritance** and **polymorphism**
* Use the `super` keyword to access parent class members
* Demonstrate **method overriding**
* Store objects using **runtime polymorphism**
* Build a menu-driven Java application

---

## 🧱 Class Design

### 1. Employee (Base Class)

**Attributes**

* employeeId (int)
* name (String)
* salary (double)

**Methods**

* `calculateBonus()`
* `displayDetails()`

### 2. Manager (Derived Class)

**Additional Attribute**

* department (String)

**Feature**

* Overrides `calculateBonus()` to give higher bonus

### 3. Developer (Derived Class)

**Additional Attribute**

* programmingLanguage (String)

**Feature**

* Overrides `calculateBonus()` with different logic

### 4. ManagementSystem (Main Class)

* Uses an array of `Employee` objects
* Implements a menu-driven interface

---

## 🖥️ Sample Menu

```
1. Add Manager
2. Add Developer
3. Display Employee Details
4. Display All Employees
5. Exit
```

---

## 🛠️ Technologies Used

* Java
* OOP Concepts
* Arrays
* Scanner class

---

## ✅ Learning Outcomes

* Strong understanding of inheritance and polymorphism
* Practical implementation of real-world class hierarchy
* Improved Java programming skills

---

## 👤 Author

**Naman**
Capstone Assignment – Java Programming
