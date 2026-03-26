Smart-Expense-Splitter-
A Java-based efficient expense management system that simplifies group expense management by fairly splitting costs and minimizing the number of transactions between users.
This project is developed as part of my Vityarthi Java 'BYOP' submission.

Description
Smart Expense Splitter is a Java-based application designed to simplify the management of shared expenses among a group of users. It ensures fair distribution of total expenses and minimizes the number of transactions required to settle debts efficiently.

Problem Statement
Managing shared expenses manually often leads to confusion, incorrect calculations, and unnecessary financial transactions. In group settings such as trips, shared accommodations, or team activities, it becomes difficult to track who owes how much and to whom.
This project provides a structured and automated solution to address these challenges effectively.

Objectives
* To develop a Java-based system for managing shared expenses
* To ensure fair and accurate expense distribution
* To minimize the number of transactions between users
* To apply Object-Oriented Programming concepts in a real-world problem

Features
* Add multiple users
* Input total expense
* Calculate equal share for each user
* Determine individual balances
* Minimize number of transactions using a greedy algorithm

How It Works
The program first calculates each user's fair share of the total expense. Based on how much each user has contributed, it determines whether they owe money (debtor) or should receive money (creditor).
A greedy algorithm is applied to:
* Identify the user with maximum credit
* Identify the user with maximum debt
* Settle the maximum possible amount between them

This process continues until all balances become zero, ensuring the minimum number of transactions.

Technologies Used
* Java
* Object-Oriented Programming (OOP)
* ArrayList (Java Collections Framework)
* Greedy Algorithm

Sample Run

Enter number of users: 3

Enter name: A
Enter name: B
Enter name: C

Enter total expense: 300

Each person should pay: 100

Enter amount paid by A: 200
Enter amount paid by B: 50
Enter amount paid by C: 50

--- Transactions ---
B pays 50 to A
C pays 50 to A

Concepts Used
* Classes and Objects
* Lists (ArrayList)
* Loops and Conditional Statements
* Greedy Algorithm

Future Scope
* Graphical User Interface (GUI) using Java Swing or JavaFX
* Database integration for storing user data
* Mobile or web-based application
* Support for custom or unequal expense splitting

Efforts by:
Divyanshi Shrivastava
( 24BAI10822 )

