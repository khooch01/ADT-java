# Implementing and Manipulating Abstract Data Types (ADT) using Java

## **Overview**
This project demonstrates the implementation and usage of three Abstract Data Types (ADT) in Java: **List**, **Stack**, and **Queue**. Each ADT is designed to support common operations, and a small application is provided to interact with and manipulate these data structures based on user input.

### **Purpose**
The goal of this assignment is to:
1. Evaluate understanding of Abstract Data Types and their operations.
2. Implement List, Stack, and Queue using arrays or linked lists.
3. Test the correctness of these implementations using a small Java application.

---

## **Class Descriptions**

### **1. ListADT**
- **Purpose**: Represents a dynamic list of elements.
- **Operations**:
  - `add(element)`: Adds an element to the list.
  - `remove(index)`: Removes the element at the specified index.
  - `get(index)`: Retrieves the element at the specified index.
  - `size()`: Returns the number of elements in the list.
  - `isEmpty()`: Checks if the list is empty.

### **2. StackADT**
- **Purpose**: Implements the stack data structure (Last In, First Out - LIFO).
- **Operations**:
  - `push(element)`: Adds an element to the top of the stack.
  - `pop()`: Removes and returns the element at the top of the stack.
  - `peek()`: Returns the element at the top without removing it.
  - `size()`: Returns the number of elements in the stack.
  - `isEmpty()`: Checks if the stack is empty.

### **3. QueueADT**
- **Purpose**: Implements the queue data structure (First In, First Out - FIFO).
- **Operations**:
  - `enqueue(element)`: Adds an element to the end of the queue.
  - `dequeue()`: Removes and returns the element at the front of the queue.
  - `peek()`: Returns the element at the front without removing it.
  - `size()`: Returns the number of elements in the queue.
  - `isEmpty()`: Checks if the queue is empty.

### **4. MainApplication**
- **Purpose**: Provides a command-line interface (CLI) or GUI to test the List, Stack, and Queue implementations interactively.
- **Features**:
  - Adds, removes, and views elements in the List.
  - Pushes, pops, and views elements in the Stack.
  - Enqueues, dequeues, and views elements in the Queue.

---

## **How to Run**

### **Prerequisites**
- Ensure you have **Java 17** or later installed. You can verify this by running:
  ```bash
  java -version
