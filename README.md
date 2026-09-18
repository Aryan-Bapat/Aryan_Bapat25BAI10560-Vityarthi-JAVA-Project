# Smart Exam Seating & Conflict Detection System

## Project Overview

The Smart Exam Seating & Conflict Detection System is a Java-based console application developed to make examination seating arrangements easier and more organized.

The system allows examination staff to add students and examination rooms, generate seating arrangements, and check the arrangement for possible conflicts. It can detect problems such as duplicate seat allocation and students who could not be allocated a seat.

The project uses core Java concepts such as Object-Oriented Programming, inheritance, encapsulation, collections, multithreading, exception handling, and file handling.

## Problem Statement

Creating examination seating arrangements manually can be time-consuming, especially when there are many students and multiple examination rooms.

Manual arrangements may result in problems such as:

- Two students being assigned the same seat
- More students being assigned than the available room capacity
- Students being left without a seat
- Difficulty checking the final seating arrangement

This project provides a simple system to automatically allocate students to available seats and check the arrangement for possible conflicts.

## Objectives

- Manage student examination information
- Manage examination rooms and their capacities
- Automatically generate seating arrangements
- Prevent duplicate seat allocation
- Detect unallocated students
- Check seating arrangements for conflicts
- Generate examination seating reports
- Export reports to a text file
- Demonstrate important Java programming concepts

## Main Features

### Student Management

- Add students
- Store student name, roll number, and course
- View registered students
- Prevent duplicate roll numbers

### Exam Room Management

- Add examination rooms
- Set room capacity
- View available rooms
- Prevent duplicate room numbers

### Automatic Seat Allocation

- Automatically create seats according to room capacity
- Assign students to available seats
- Support multiple examination rooms

### Conflict Detection

The system checks for:

- Duplicate student allocation
- Duplicate seat allocation
- Unallocated students

### Report Generation

The system generates information about:

- Total students
- Total examination rooms
- Total seats available
- Students allocated
- Students unallocated

### File Export

The generated examination seating report can be exported to:

exam_seating_report.txt

## Java Concepts Used

The project demonstrates the following Java concepts:

- Classes and Objects
- Encapsulation
- Inheritance
- Method Overriding
- Polymorphism
- ArrayList
- HashSet
- Multithreading
- Exception Handling
- String Processing
- File I/O

## Project Modules

The project is divided into the following modules:

1. Student Management
2. Exam Room Management
3. Seating Allocation
4. Conflict Detection
5. Multithreaded Conflict Checking
6. Report Generation
7. File Management

## Project Structure

```text
SmartExamSeatingSystem/
│
├── User.java
├── Student.java
├── Admin.java
├── ExamRoom.java
├── Seat.java
├── SeatingArrangement.java
├── StudentManager.java
├── RoomManager.java
├── SeatingManager.java
├── ConflictDetector.java
├── SeatingCheckThread.java
├── ReportGenerator.java
├── FileManager.java
└── Main.java
