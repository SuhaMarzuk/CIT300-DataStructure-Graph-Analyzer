# CIT300 - Data Structure & Graph Analyzer

## 📋 Project Description

A Java-based console application developed as part of the CIT300 Graded Practical Assignment. This system demonstrates the practical application of data structures, algorithms, searching techniques, graph concepts, and algorithmic complexity through an interactive menu-driven interface.

The application allows users to work with different data structures (Array, Stack, Queue, Linked List), perform searching operations (Linear & Binary Search), represent and traverse graphs (BFS & DFS), and observe performance comparisons between algorithms.

---

## 👥 Team Members

| Role | Name | Student ID | GitHub Email | Assigned Responsibility |
|------|------|-----------|--------------|-------------------------|
| Team Leader | MMF. Suha | 23da2-0488 | marrzuksuha@gmail.com | Array, Searching, Integration & Main Menu |
| Member | MF. Rifka | 23da2-0481 | frifka540@gmail.com | Stack & Queue |
| Member | K. Afrin | 23DA2-0485 | afrinkaleel7@gmail.com | Linked List |
| Member | NF. Rusna | 23da2-0551 | 23DA2-0551@sltc.ac.lk | Graph & Performance Comparison |

---

## 🎯 Individual Contributions

### MMF. Suha (23da2-0488) — Team Leader
**Assigned Responsibility:** Array, Searching, Integration & Main Menu

**Individual Contribution:**
- Created and managed the GitHub repository
- Set up project folder structure (`src/com/cit300/`)
- Implemented `ArrayOperations.java`
  - Insert operation with overflow handling
  - Delete operation with value search
  - Linear search within array
  - Display operation
- Implemented `SearchingOperations.java`
  - Linear Search algorithm
  - Binary Search algorithm (with sorting)
  - Step counting and time comparison
- Implemented `Main.java`
  - Integrated console menu system
  - Connected all modules (Array, Stack, Queue, Linked List, Searching, Graph)
  - Input validation
  - Display All Results feature
- Merged all team branches into main
- Created and maintained README.md
- Coordinated team workflow and testing

---

### MF. Rifka (23da2-0481)
**Assigned Responsibility:** Stack & Queue

**Individual Contribution:**
- Implemented `StackOperations.java`
  - Push operation with overflow detection
  - Pop operation with underflow detection
  - Peek operation to view top element
  - Display stack contents (top to bottom)
- Implemented `QueueOperations.java`
  - Enqueue operation with circular array logic
  - Dequeue operation with underflow detection
  - Peek/Front operation
  - Display queue contents (front to rear)
- Tested both components for edge cases (empty stack/queue)
- Verified integration with Main.java menu

---

### K. Afrin (23DA2-0485)
**Assigned Responsibility:** Linked List

**Individual Contribution:**
- Implemented `LinkedListOperations.java`
  - Node class definition
  - Insert operation (append to end)
  - Delete operation (by value, including head deletion)
  - Search operation (returns position)
  - Display operation (traverses from head to null)
- Handled edge cases:
  - Empty list operations
  - Deleting head node
  - Searching for non-existent values
- Tested linked list functionality
- Verified integration with Main.java menu

---

### NF. Rusna (23da2-0551)
**Assigned Responsibility:** Graph & Performance Comparison

**Individual Contribution:**
- Implemented `GraphOperations.java`
  - Graph representation using adjacency list (LinkedHashMap)
  - Add vertex operation with duplicate detection
  - Add edge operation (undirected graph)
  - Display graph as adjacency list
  - BFS (Breadth-First Search) traversal using Queue
  - DFS (Depth-First Search) traversal using recursion
- Implemented `PerformanceComparison.java`
  - Linear Search step counting
  - Binary Search step counting
  - Formatted comparison table
  - Complexity explanation (O(n), O(log n), O(V+E))
- Tested graph operations and traversal algorithms
- Verified integration with Main.java menu

---

## 🛠️ Technologies Used

- **Programming Language:** Java (JDK 8+)
- **IDE:** Visual Studio Code / IntelliJ IDEA / Eclipse
- **Version Control:** Git & GitHub
- **Build Tool:** Manual `javac` compilation
- **Interface:** Console-based (command-line)

---

## ✨ Main System Features

### 1. Array Operations
- Insert element
- Delete element by value
- Search element (Linear)
- Display array contents

### 2. Stack Operations
- Push element
- Pop element
- Peek top element
- Display stack

### 3. Queue Operations
- Enqueue element
- Dequeue element
- Peek front element
- Display queue

### 4. Linked List Operations
- Insert node
- Delete node
- Search for value
- Display list

### 5. Searching Operations
- Linear Search with step count
- Binary Search with step count
- Time comparison in nanoseconds

### 6. Graph Operations
- Add vertex
- Add edge (undirected)
- Display adjacency list
- BFS Traversal
- DFS Traversal

### 7. Performance Comparison
- Compares Linear Search vs Binary Search
- Shows number of steps for each algorithm
- Explains algorithmic complexity

### 8. Display All Results
- Shows current state of all data structures

---

## 📂 Project Structure

```
CIT300-DataStructure-Graph-Analyzer/
│
├── README.md
│
└── src/
    └── com/
        └── cit300/
            ├── Main.java                    (Member 1)
            ├── ArrayOperations.java         (Member 1)
            ├── SearchingOperations.java     (Member 1)
            ├── StackOperations.java         (Member 2)
            ├── QueueOperations.java         (Member 2)
            ├── LinkedListOperations.java    (Member 3)
            ├── GraphOperations.java         (Member 4)
            └── PerformanceComparison.java   (Member 4)
```

---

## 🚀 How to Run the Program

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Verify installation: `java -version` and `javac -version`

### Step 1: Clone the Repository

```bash
git clone https://github.com/marrzuksuha/CIT300-DataStructure-Graph-Analyzer.git
cd CIT300-DataStructure-Graph-Analyzer
```

### Step 2: Compile the Java Files

```bash
javac -d . src/com/cit300/*.java
```

### Step 3: Run the Application

```bash
java com.cit300.Main
```

### Step 4: Use the Menu

The program will display:
```
===== DATA STRUCTURE & GRAPH ANALYZER =====
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
============================================
Enter your choice:
```

Select a number and follow the on-screen prompts.

---

## 🔀 GitHub Collaboration Evidence

### Branches Used
- `main` — Final integrated code
- `feature/array-searching` — Member 1's work (Array, Searching, Main)
- `feature/stack-queue` — Member 2's work (Stack, Queue)
- `feature/linked-list` — Member 3's work (Linked List)
- `feature/graph-performance` — Member 4's work (Graph, Performance)

### Collaboration Workflow
1. Each member created their own feature branch
2. Members committed code with meaningful messages
3. Each member created a Pull Request (PR) to merge into `main`
4. Team Leader reviewed and merged all PRs
5. All work tracked via Git commits and GitHub PR history

### Pull Requests
- PR #1: Initialize project folder structure (Member 1)
- PR #2: Add Array, Searching, and Main integration (Member 1)
- PR #3: Add Stack and Queue implementations (Member 2)
- PR #4: Add Linked List implementation (Member 3)
- PR #5: Add Graph and Performance Comparison (Member 4)

---

## ⚡ Performance & Complexity Demonstration

| Operation | Algorithm | Complexity | Steps Observed |
|-----------|-----------|-----------|----------------|
| Search | Linear Search | O(n) | Depends on position |
| Search | Binary Search | O(log n) | Fewer steps for large datasets |
| Graph Traversal | BFS | O(V + E) | Visits all vertices and edges |
| Graph Traversal | DFS | O(V + E) | Visits all vertices and edges |
| Array Insert | — | O(1) | Constant time at end |
| Array Delete | — | O(n) | Shifts elements after deletion |
| Stack Push/Pop | — | O(1) | Constant time |
| Queue Enqueue/Dequeue | — | O(1) | Constant time with circular array |
| Linked List Insert | — | O(n) | Traverses to end |
| Linked List Delete | — | O(n) | Traverses to find node |

### Why Results Differ
- **Linear Search** checks each element one by one — O(n) — suitable for unsorted data.
- **Binary Search** divides the search space in half each time — O(log n) — requires sorted data.
- **BFS/DFS** visit every vertex and edge once — O(V + E) — both efficient for graph traversal but differ in order.
- **BFS** uses a Queue (level-order), **DFS** uses recursion/Stack (depth-first).

---

## 📸 Sample Output

```
===== DATA STRUCTURE & GRAPH ANALYZER =====
1. Array Operations
2. Stack Operations
...

Enter your choice: 1

--- ARRAY OPERATIONS ---
1. Insert
2. Delete
3. Search
4. Display
5. Return to Main Menu
Enter choice: 1
Enter value to insert: 45
Inserted: 45
```

---

## 🎥 Demonstration Video

A merged demonstration video (less than 15 minutes) has been prepared showing:
- Each member's face and introduction
- Code walkthrough for each component
- Live program demonstration
- Explanation of algorithms and complexity
- Integration demonstration

---

## 📝 Assignment Requirements Compliance

- ✅ Array operations (Insert, Delete, Search, Display)
- ✅ Stack operations (Push, Pop, Peek, Display)
- ✅ Queue operations (Enqueue, Dequeue, Peek, Display)
- ✅ Linked List operations (Insert, Delete, Search, Display)
- ✅ Searching (Linear & Binary with comparison)
- ✅ Graph operations (Add Vertex, Add Edge, Display, BFS, DFS)
- ✅ Performance/Complexity demonstration
- ✅ Input validation
- ✅ Empty data structure handling
- ✅ Object-oriented design (separate classes per component)
- ✅ GitHub collaboration (branches, commits, PRs)
- ✅ Console-based interface

---

## 📄 License

This project was developed for academic purposes as part of the CIT300 Graded Practical Assignment at SLTC.

---

## 📞 Contact

For any queries regarding this project:

- **Team Leader:** MMF. Suha — 23da2-0488
- **Email:** marrzuksuha@gmail.com
- **Repository:** https://github.com/SuhaMarzuk/CIT300-DataStructure-Graph-Analyzer

---

**Submission Date:** 29th September
**Institution:** Sri Lanka Technology Campus (SLTC)
**Module:** CIT300 - Data Structures & Algorithms
