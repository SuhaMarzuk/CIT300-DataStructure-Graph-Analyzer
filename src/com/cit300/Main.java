package com.cit300;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayOperations arrayOps = new ArrayOperations(100);
    static StackOperations stackOps = new StackOperations(100);
    static QueueOperations queueOps = new QueueOperations(100);
    static LinkedListOperations linkedListOps = new LinkedListOperations();
    static GraphOperations graphOps = new GraphOperations();

    public static void main(String[] args) {
        int choice;
        do {
            printMainMenu();
            choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1: arrayMenu(); break;
                case 2: stackMenu(); break;
                case 3: queueMenu(); break;
                case 4: linkedListMenu(); break;
                case 5: searchingMenu(); break;
                case 6: graphMenu(); break;
                case 7: PerformanceComparison.runAll(); break;
                case 8: displayAllResults(); break;
                case 9: System.out.println("Exiting... Goodbye!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
    }

    static void printMainMenu() {
        System.out.println("\n===== DATA STRUCTURE & GRAPH ANALYZER =====");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("============================================");
    }

    static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    static void arrayMenu() {
        int choice;
        do {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = getIntInput("Enter choice: ");

            switch (choice) {
                case 1:
                    int val = getIntInput("Enter value to insert: ");
                    arrayOps.insert(val);
                    break;
                case 2:
                    val = getIntInput("Enter value to delete: ");
                    arrayOps.delete(val);
                    break;
                case 3:
                    val = getIntInput("Enter value to search: ");
                    int idx = arrayOps.search(val);
                    System.out.println(idx != -1 ? "Found at index " + idx : "Not found");
                    break;
                case 4: arrayOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void stackMenu() {
        int choice;
        do {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = getIntInput("Enter choice: ");

            switch (choice) {
                case 1:
                    int val = getIntInput("Enter value to push: ");
                    stackOps.push(val);
                    break;
                case 2: stackOps.pop(); break;
                case 3: stackOps.peek(); break;
                case 4: stackOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void queueMenu() {
        int choice;
        do {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek/Front");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = getIntInput("Enter choice: ");

            switch (choice) {
                case 1:
                    int val = getIntInput("Enter value to enqueue: ");
                    queueOps.enqueue(val);
                    break;
                case 2: queueOps.dequeue(); break;
                case 3: queueOps.peek(); break;
                case 4: queueOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void linkedListMenu() {
        int choice;
        do {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            choice = getIntInput("Enter choice: ");

            switch (choice) {
                case 1:
                    int val = getIntInput("Enter value to insert: ");
                    linkedListOps.insert(val);
                    break;
                case 2:
                    val = getIntInput("Enter value to delete: ");
                    linkedListOps.delete(val);
                    break;
                case 3:
                    val = getIntInput("Enter value to search: ");
                    linkedListOps.search(val);
                    break;
                case 4: linkedListOps.display(); break;
                case 5: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void searchingMenu() {
        System.out.println("\n--- SEARCHING OPERATIONS ---");
        if (arrayOps.getSize() == 0) {
            System.out.println("Array is empty! Insert data first.");
            return;
        }
        int target = getIntInput("Enter value to search: ");
        SearchingOperations.compare(arrayOps.getArray(), arrayOps.getSize(), target);
    }

    static void graphMenu() {
        int choice;
        do {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");
            choice = getIntInput("Enter choice: ");

            switch (choice) {
                case 1:
                    System.out.print("Enter vertex name: ");
                    graphOps.addVertex(scanner.nextLine().trim());
                    break;
                case 2:
                    System.out.print("Enter source vertex: ");
                    String src = scanner.nextLine().trim();
                    System.out.print("Enter destination vertex: ");
                    String dest = scanner.nextLine().trim();
                    graphOps.addEdge(src, dest);
                    break;
                case 3: graphOps.displayGraph(); break;
                case 4: graphOps.bfs(); break;
                case 5: graphOps.dfs(); break;
                case 6: break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    static void displayAllResults() {
        System.out.println("\n===== ALL RESULTS =====");
        System.out.println("\n--- Array ---");
        arrayOps.display();
        System.out.println("\n--- Stack ---");
        stackOps.display();
        System.out.println("\n--- Queue ---");
        queueOps.display();
        System.out.println("\n--- Linked List ---");
        linkedListOps.display();
        System.out.println("\n--- Graph ---");
        graphOps.displayGraph();
    }
}