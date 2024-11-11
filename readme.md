
# Abstract Data Types (ADT) Implementation in Java

  

## **Overview**

This project demonstrates the implementation and manipulation of three fundamental Abstract Data Types (ADTs) in Java: **List**, **Stack**, and **Queue**. Two versions of the application are provided:

1.  **CLI Version**: A command-line interface for interacting with the ADTs.

2.  **GUI Version**: A graphical user interface (GUI) for user-friendly interaction.

  

---

  

## **Features**

1.  **List ADT**: Represents a dynamic list of elements.

2.  **Stack ADT**: Implements a Last In, First Out (LIFO) data structure.

3.  **Queue ADT**: Implements a First In, First Out (FIFO) data structure.

4.  **CLI Version**: Simple text-based interaction with the ADTs.

5.  **GUI Version**: Button-based interaction with real-time results displayed in a text area.

  

---

  

## **Class Descriptions**

  

### **1. ListADT**

-  **Purpose**: Represents a dynamic list of elements.

-  **Supported Operations**:

-  `add(element)`: Adds an element to the list.

-  `remove(index)`: Removes the element at the specified index.

-  `get(index)`: Retrieves the element at the specified index.

-  `size()`: Returns the number of elements in the list.

-  `isEmpty()`: Checks if the list is empty.

  

### **2. StackADT**

-  **Purpose**: Implements the stack data structure.

-  **Supported Operations**:

-  `push(element)`: Adds an element to the top of the stack.

-  `pop()`: Removes and returns the top element.

-  `peek()`: Returns the top element without removing it.

-  `size()`: Returns the number of elements in the stack.

-  `isEmpty()`: Checks if the stack is empty.

  

### **3. QueueADT**

-  **Purpose**: Implements the queue data structure.

-  **Supported Operations**:

-  `enqueue(element)`: Adds an element to the end of the queue.

-  `dequeue()`: Removes and returns the front element.

-  `peek()`: Returns the front element without removing it.

-  `size()`: Returns the number of elements in the queue.

-  `isEmpty()`: Checks if the queue is empty.

  

### **4. MainApplication (CLI Version)**

-  **Purpose**: Provides a text-based testing environment for the ADTs.

-  **Features**:

- Add, remove, and view elements in the List.

- Push, pop, and view elements in the Stack.

- Enqueue, dequeue, and view elements in the Queue.

  

### **5. MainApplicationGUI (GUI Version)**

-  **Purpose**: Provides a graphical user interface for testing the ADTs.

-  **Features**:

- Button-based interaction for all ADT operations.

- Results are displayed in a text area for easy review.

  

---

## **How to Run**

Compile all.java files:

	javac *.java
**For CLI Version**:

    java MainApplication
  **For GUI Version**:

    java MainApplicationGUI

  ## **Input/Output Scenarios**

### **CLI Version**

#### **List ADT**

**Input**:

-   Add 10, 20, 30 to the list.
-   Remove the element at index 1.

**Output**:

List Contents:
10 30
List Size: 2


#### **Stack ADT**

**Input**:

-   Push 1, 2, 3 onto the stack.
-   Pop an element.

**Output**:

Stack Top Element: 3
Stack Top after Pop: 2
Stack Size: 2


#### **Queue ADT**

**Input**:

-   Enqueue 100, 200, 300.
-   Dequeue an element.

**Output**:

Queue Front Element: 100
Queue Front after Dequeue: 200
Queue Size: 2

----------

### **GUI Version**

#### **List Operations**:

-   Add elements using the **Add to List** button.
-   Remove elements by specifying an index and clicking **Remove from List**.
-   View the list by clicking **View List**.

#### **Stack Operations**:

-   Push elements using **Push to Stack**.
-   Pop elements using **Pop from Stack**.
-   View the stack by clicking **View Stack**.

#### **Queue Operations**:

-   Enqueue elements using **Enqueue to Queue**.
-   Dequeue elements using **Dequeue from Queue**.
-   View the queue by clicking **View Queue**.
----------
## **Files in the Project**

-   `ListADT.java`: Implementation of the List ADT.
-   `StackADT.java`: Implementation of the Stack ADT.
-   `QueueADT.java`: Implementation of the Queue ADT.
-   `MainApplication.java`: CLI-based application to test the ADTs.
-   `MainApplicationGUI.java`: GUI-based application to test the ADTs.
-   `main.ico`: Icon used for the GUI application.

## **Acknowledgements**

This project was developed as part of the **MCDCS204/03 MC in Data Structures and Algorithms** course for the Bachelor in Software Engineering (Honours) (Application Development) program.

## Author

  

👤 **Chien Hang**

  

* Github: [@khooch01](https://github.com/khooch01)

  


***

