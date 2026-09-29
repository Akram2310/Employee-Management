# Employee Management System

A Java console/dialog application that models a company's employees and departments using object-oriented design.

## Features
- **Class hierarchy** – `Employees` (base class) with `Manager` and `Developer` subclasses
- **Polymorphic salary** – managers are paid by their position, developers by programming language (Java / C)
- **Departments** – HR and IT departments with add employee, remove employee, department report and total payroll
- **Swing dialog menu** – choose a department, then add or remove managers and developers through `JOptionPane` dialogs

## OOP concepts demonstrated
Inheritance, polymorphism (`getSalary()` and `getEmployeeInfo()` overridden per subclass), encapsulation, composition (`Manager` has a `Departments` and a `Positions`).

## Run
Requires JDK 11+ (the NetBeans project targets 18).

```
javac -d out src/employees/*.java
java -cp out employees.TestProj
```

Or open the folder as a project in NetBeans and run it (main class: `employees.TestProj`).

## Structure
```
src/employees/
├── Employees.java     base class
├── Manager.java       salary from Positions
├── Developer.java     salary from programming language
├── Departments.java   employee storage, add/remove, payroll
├── Positions.java     job title + salary
└── TestProj.java      dialog menu and sample data
```

## Limitations
Data is held in memory only (nothing is saved between runs), and departments have a fixed capacity.
